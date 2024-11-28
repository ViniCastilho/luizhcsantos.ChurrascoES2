/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lhsan
 */
public class UsuarioController extends ControladorBase {

   

    private ArrayList<Membro> listaMembros = new ArrayList<>();
    private ArrayList<Participante> listaParticipantes = new ArrayList<>();

    private static UsuarioController instancia;  // Instância única do UsuarioController (Singleton)
    private final AuthenticationManager authManager = AuthenticationManager.getInstancia();

    private Membro usuarioAtual;

    public UsuarioController() {
    }

    public static UsuarioController getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioController();
        }
        return instancia;
    }

    public void adicionarMembro(String nome, String email, String endereco, String senha,
            String telefone, CategoriaAlimentar categoriaAlimentar, String tipoUsuario) {

        Membro novoMembro = new Membro(nome, email, endereco, senha, telefone, categoriaAlimentar, tipoUsuario);
        listaMembros.add(novoMembro);

        // Obtém o usuário atual diretamente do AuthenticationManager
        usuarioAtual = authManager.getUsuarioAtual();

        if (usuarioAtual == null) {
            System.out.println("Apenas administradores podem criar eventos.");
            abrirTelaAutenticacao();
            usuarioAtual = authManager.getUsuarioAtual();
            System.out.println("(usuarioController) nome usuarioAtual  " + this.usuarioAtual.getNome() + "\n");

            String sql = "INSERT INTO membro (nome, email, senha, endereco, telefone, categoriaAlimentar, tipoUsuario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, email);
                stmt.setString(3, senha);
                stmt.setString(4, endereco);
                stmt.setString(5, telefone);
                stmt.setString(6, categoriaAlimentar.toString());
                stmt.setString(7, tipoUsuario);
                stmt.executeUpdate();
                System.out.println("Novo Membro " + nome + " adicionado com sucesso.");
            } catch (SQLException e) {
            }
            System.out.println("Membro adicionado com sucesso.");
        }

        
    }

    public void adicionarParticipante(String nomeMembro, int evento_id) {
        int id_membro;
        Membro membro;
        for (int i = 0; i < listaMembros.size(); i++) {
            if (listaMembros.get(i).getNome().equals(nomeMembro)) {
                membro = listaMembros.get(i);
                id_membro = membro.getIdMembro();
            }
        }

//        Participante novoParticipante = new Participante(membro, id_membro); 
//        listaParticipantes.add(novoParticipante); 
    }
    
     public List<String> carregarMembros() {
        List<String> membros = new ArrayList<>();
        String query = "SELECT nome FROM membro"; // Query para obter membros cadastrados
        
        try (Connection conn = DBConnection.getConnection(); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                membros.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados");
        }
        
        return membros; 
    }

    public ArrayList<Membro> getListaMembros() {
        return listaMembros;
    }

    public void setListaMembros(ArrayList<Membro> listaMembros) {
        this.listaMembros = listaMembros;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public void setUsuarioAtual(Membro usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }

    public Membro getUsuarioAtual() {
        return usuarioAtual;
    }
    
    

}
