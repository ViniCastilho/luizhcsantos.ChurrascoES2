/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lhsan
 */
public class ProdutoController extends ControladorBase {

    private final ArrayList<Produto> listaProdutos;
    // Instância única do UsuarioController (Singleton)
    private final AuthenticationManager authManager = AuthenticationManager.getInstancia();

    public ProdutoController() {
        listaProdutos = new ArrayList<>();
    }

    public void adicionarNovoProduto(String nome, float preco, int qtde, Categoria categoria) {
        Produto novoProduto = new Produto(nome, preco, categoria, qtde);
        listaProdutos.add(novoProduto);

        // Obtém o usuário atual diretamente do AuthenticationManager
        Membro usuarioAtual = authManager.getUsuarioAtual();

        if (usuarioAtual == null) {
            System.out.println("Apenas administradores podem criar eventos.");
            abrirTelaAutenticacao();
            usuarioAtual = authManager.getUsuarioAtual();
            System.out.println("Membro atual: "+usuarioAtual.getNome());

            // Lógica para adicionar um novo usuario ao banco de dados
            String sql = "INSERT INTO produto (nome, preco, qtde, categoria) VALUES (?, ?, ?, ?)";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setFloat(2, preco);
                stmt.setInt(3, qtde);
                stmt.setString(4, categoria.toString());
                stmt.executeUpdate();
                System.out.println("Novo produto " + nome + " adicionado com sucesso.");
            } catch (SQLException e) {
            }
            System.out.println("Produto adicionado com sucesso.");

        }

    }

}
