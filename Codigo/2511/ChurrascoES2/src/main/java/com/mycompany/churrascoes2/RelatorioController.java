/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import View.UIRelatorio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lhsan
 */
public class RelatorioController {

    private final UIRelatorio relatorioView;

    public RelatorioController(UIRelatorio view) {
        this.relatorioView = view;
    }

    public void carregarRelatorio(String tipo) {
        String sql = "";
        String[] colunas = {};

        if (tipo != null) {
            // Cria a query especifica para a tabela especificada por 'tipo' 
            switch (tipo) {
                case "membros" -> {
                    sql = "SELECT nome, email, endereco, telefone FROM membro";
                    colunas = new String[]{"Nome", "Email", "Endereço", "Telefone"};
                }
                case "produtos" -> {
                    sql = "SELECT nome, preco, qtde FROM produto";
                    colunas = new String[]{"Nome", "Preço", "Qtde."};
                }
                case "eventos" -> {
                    sql = "SELECT nomeEvento, dataEvento, local, membro_id FROM evento";
                    colunas = new String[]{"Nome Evento", "Data", "Local", "Membro id"};
                }
                default -> {

                }
            }
        }
        // Chama o método para carregar os dados da tabela
        List<Object[]> dados = obterDadosDoBanco(sql);
        // Passa os dados para a view
        relatorioView.preencherTabela(dados, colunas);
    }

    private List<Object[]> obterDadosDoBanco(String sql) {
        List<Object[]> dados = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Object[] linha = new Object[rs.getMetaData().getColumnCount()];

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    // Obtém o valor da coluna
                    Object valor = rs.getObject(i + 1);

                    // Se for um timestamp Unix (INTEGER), converta para um tipo Date ou Timestamp
                    if (valor instanceof Long aLong) {
                        // Converte para java.sql.Date (se for Unix Timestamp em milissegundos)
                        linha[i] = new java.sql.Date(aLong);  // Se for timestamp Unix, converte para Date
                    } else if (valor instanceof java.sql.Timestamp) {
                        // Já é Timestamp, nada precisa ser feito
                        linha[i] = valor;
                    } else {
                        linha[i] = valor;
                    }
                }

                dados.add(linha);
//                stmt.close();
//                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        } finally {

        }

        return dados;
    }

}
