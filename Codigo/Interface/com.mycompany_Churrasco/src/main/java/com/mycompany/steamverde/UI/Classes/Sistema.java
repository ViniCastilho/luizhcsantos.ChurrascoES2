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
    public static List<Membro> listamembros;
    public static List<Produto> listaprodutos;
    private static int curruserid;
    public static Membro curruser() {
        if (curruserid == -1) return null;
        else return listamembros.get(curruserid);
    }
    public static void setcurruser(int id) {
        curruserid = id;
    }
    
    public static Sistema getinstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }
    
    
    private Sistema() {
        curruserid = -1;
        listamembros = new ArrayList<>();
        listaprodutos = new ArrayList<>();
        // ...
        if (listamembros.size() == 0) {
            Membro admin = new Membro();
            admin.setNome("ADMINISTRADOR");
            admin.setEmail("admin@admin.com");
            admin.setSenha("admin");
            admin.setIdMembro(0);
            admin.setStatusPagamento(StatusPagamento.ATIVO);
            admin.setTelefone("99999999999");
            admin.setEndereco("MUNDO VIRTUAL, 10");
            admin.setTipoUsuario(TipoUsuario.PERMANENTE);
            admin.setCategoriaAlimentar(CategoriaAlimentar.ONIVORO);
            listamembros.add(admin);
        }
        if (listaprodutos.size() == 0) {
            Produto p = new Produto();
            p.setNomeProduto("CERVEJA CRISTAL");
            p.setPreco(90.25f);
            p.setIdProduto(0);
            p.setCategoria(Categoria.bebidasAlcoolicas);
            listaprodutos.add(p);
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
