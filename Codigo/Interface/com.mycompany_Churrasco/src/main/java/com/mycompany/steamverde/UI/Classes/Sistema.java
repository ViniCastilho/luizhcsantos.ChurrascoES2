/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;
import java.util.*;

/**
 *
 * @author Microsoft
 */
public class Sistema {
    private static Sistema instancia = null;
    public static List<Membro> listaMembros;
    
    public static Sistema getinstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }
    
    private Sistema() {
        listaMembros = new ArrayList<>();
        // ...
        if (listaMembros.size() == 0) {
            Membro admin = new Membro();
            admin.setNome("Administrador");
            admin.setEmail("admin@churras.com.br");
            admin.setSenha("admin");
            admin.setIdMembro(0);
            admin.setStatusPagamento(StatusPagamento.ATIVO);
            admin.setTelefone("99999999999");
            admin.setEndereco("MUNDO VIRTUAL, 10");
            admin.setTipoUsuario(TipoUsuario.PERMANENTE);
            admin.setCategoriaAlimentar(CategoriaAlimentar.ONIVORO);
            listaMembros.add(admin);
        }
    }
    
    public void selecionarOrganizadorAleatorio() {}
    public void registrarMembro() {}
    public void validarLogin() {}
    public void excluirEvento() {}
    public void confirmarExclusaoEvento() {}
    public void solicitarRedefinicaoSenha() {}
    public void criarPerfilConvidado() {}
    public void designarOrganizador() {}
    public void consultarPagamento() {}
    public void alterarDetalhesEvento() {}
    public void atualizarDados() {}
    public void verificarStatusPagamento() {}
    public void gerarRelatorio() {}
}
