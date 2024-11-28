/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lhsan
 */
public class EventoController extends ControladorBase {

    private final ArrayList<Evento> listaEventos;
    private Membro usuarioAtual;
    private final AuthenticationManager authManager = AuthenticationManager.getInstancia();

    public EventoController() {
        listaEventos = new ArrayList<>();

    }

    public void adicionarNovoEvento(String nomeEvento, Date dataEvento, String local, String nomeMembro) {

        // Buscar a ID do membro a partir do nome
        int membroId = buscarMembroIdPorNome(nomeMembro);

        if (membroId == -1) {
            System.out.println("Membro não encontrado.");
            return; 
        }
        Evento novoEvento = new Evento(nomeEvento, dataEvento, local, nomeMembro);
        listaEventos.add(novoEvento);

        if (usuarioAtual == null) {
            System.out.println("Apenas administradores podem criar eventos.");
            abrirTelaAutenticacao();
            usuarioAtual = authManager.getUsuarioAtual();
            System.out.println("(usuarioController) nome usuarioAtual  " + this.usuarioAtual.getNome() + "\n");

            String sql = "INSERT INTO evento (nomeEvento, dataEvento, local, membro_id) VALUES (?, ?, ?, ?)";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nomeEvento);
                stmt.setDate(2, new java.sql.Date(dataEvento.getTime()));
                stmt.setString(3, local);
                stmt.setInt(4, membroId);
                stmt.executeUpdate();
                System.out.println("Novo evento " + nomeEvento + " adicionado com sucesso.");
            } catch (SQLException e) {
            }
            System.out.println("Evento adicionado com sucesso.");
        }

    }

    private int buscarMembroIdPorNome(String nomeMembro) {
        String sql = "SELECT id FROM membro WHERE nome = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeMembro);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");  // Retorna o ID do membro
            } else {
                return -1;  // Retorna -1 caso o membro não seja encontrado
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar membro: " + e.getMessage());
            return -1; // Retorna -1 em caso de erro
        }
    }

}
