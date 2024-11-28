/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.Participante;

/**
 *
 * @author lhsan
 */
import java.sql.*;

public class UsuarioController extends BaseController {

    private Participante usuarioAtual;  // Armazena o usuario logado
    private static UsuarioController instancia;  // Instância única do UsuarioController (Singleton)
    private AuthenticationManager authManager = AuthenticationManager.getInstancia();


    public UsuarioController() {
    }
    
     // Método para obter a instância do controlador
    public static UsuarioController getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioController();
        }
        return instancia;
    }


    // Método para autenticar o usuario
    public boolean autenticar(String nome, Integer codigo, String senha) {

        String sql = "SELECT * FROM usuarios WHERE nome = ? AND codigo = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuarioAtual = new Participante(rs.getString("nome"), rs.getString("senha"), rs.getString("tipo"));
                return true;
            }
        } catch (SQLException e) {
        }
        return false;  // Falha na autenticação
    }

    // Método para autenticar o administrador usando consulta ao banco de dados
    public boolean autenticarAdministrador(String nome, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ? AND tipo = 'Administrador'";

        try (Connection conn = DBConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Se encontrar o administrador, cria um objeto Participante para o admin logado
                usuarioAtual = new Participante(nome, senha, "Administrador");
                instancia.setUsuarioAtual(usuarioAtual);
                //System.out.println("\nusuario atual: "+instancia.getUsuarioAtual().getNome());
                return true; // Autenticação bem-sucedida
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Falha na autenticação
    }


    // Método para adicionar um novo usuario
    public void adicionarUsuario(String nome, Integer codigo, String senha, String tipo) {
        
        // Obtém o usuário atual diretamente do AuthenticationManager
        usuarioAtual = authManager.getUsuarioAtual();
        
        
        if (usuarioAtual == null || !usuarioAtual.getTipo().equals("Administrador")) {
            System.out.println("Apenas administradores podem adicionar usuarios.");
            // Se o usuario não for administrador, abre a tela de autenticação
            abrirTelaAutenticacao();
            usuarioAtual = authManager.getUsuarioAtual();
            System.out.println("(usuarioController) nome usuarioAtual  "+ this.usuarioAtual.getNome()+"\n");
            
            // Lógica para adicionar um novo usuario ao banco de dados
            String sql = "INSERT INTO usuarios (nome, tipo, codigo, senha) VALUES (?, ?, ?, ?)";
            try (Connection conn = DBConnection.getConnection(); 
                    PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, tipo);
                stmt.setInt(3, codigo);
                stmt.setString(4, senha);
                stmt.executeUpdate();
                System.out.println("Novo usuario " + nome + " adicionado com sucesso.");
            } catch (SQLException e) {
            }
            System.out.println("Usuario adicionado com sucesso.");
            
            return;
        }
        
        
        
        
    }

    
    
    
    
    public void adicionarMembro() {
        
    }
}
