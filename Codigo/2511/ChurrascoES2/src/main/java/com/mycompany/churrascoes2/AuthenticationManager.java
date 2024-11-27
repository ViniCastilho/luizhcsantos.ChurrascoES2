/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lhsan
 */
public class AuthenticationManager {

    private static AuthenticationManager instancia;
    private Membro usuarioAtual;

    // Construtor privado para impedir a criação de múltiplas instâncias
    AuthenticationManager() {
    }

    // Método para obter a instância do AuthenticationManager (Singleton)
    public static AuthenticationManager getInstancia() {
        if (instancia == null) {
            instancia = new AuthenticationManager();
        }
        return instancia;
    }

    // Método para autenticar o administrador
    public boolean autenticar(String nome, String email, String senha) {
        // Define o SQL para consultar a tabela de usuários
        String sql = "SELECT nome, email, senha FROM membro WHERE nome = ? AND email = ? AND senha = ?";

        try (Connection conn = DBConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da consulta SQL
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);

            // Executa a consulta
            ResultSet rs = stmt.executeQuery();

            // Verifica se a consulta retornou algum resultado
            if (rs.next()) {

                // Se for administrador, cria o usuário atual
                this.usuarioAtual = new Membro(nome, email, senha);
                System.out.println("membro atual: "+this.usuarioAtual.getNome());
                return true;  // Autenticação bem-sucedida

            }
        } catch (SQLException e) {
            System.out.println("Erro ao autenticar o usuário: " + e.getMessage());
        }

        return false;  // Retorna falso se as credenciais forem inválidas ou o tipo não for "Administrador"
    }

    // Método para obter o usuário autenticado
    public Membro getUsuarioAtual() {
        return usuarioAtual;
    }

    // Método para limpar a sessão de autenticação (se necessário)
    public void logout() {
        usuarioAtual = null;
    }

}
