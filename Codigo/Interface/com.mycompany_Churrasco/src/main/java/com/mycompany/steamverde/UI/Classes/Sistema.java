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
    public static Evento currevent;
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
        currevent = null;
        listamembros = new ArrayList<>();
        listaprodutos = new ArrayList<>();
        // ...
        if (listamembros.size() == 0) {
            registrarMembro(
                TipoUsuario.PERMANENTE,
                "ADMINISTRADOR",
                "admin@admin.com",
                "admin",
                "99888775533",
                "MUNDO VIRTUAL, 10",
                CategoriaAlimentar.ONIVORO
            );
            registrarMembro(
                TipoUsuario.CONVIDADO,
                "CONVIDADO ESPECIAL",
                "guest@admin.com",
                "admin",
                "11333557799",
                "MUNDO VIRTUAL, 11",
                CategoriaAlimentar.VEGANO
            );
        }
        if (listaprodutos.size() == 0) {
            Produto p = new Produto();
            p.setNomeProduto("UNIDADE CERVEJA CRISTAL");
            p.setPreco(4.25f);
            p.setCategoria(Categoria.bebidasAlcoolicas);
            listaprodutos.add(p);
            
            p = new Produto();
            p.setNomeProduto("QUILOGRAMA BACON PERDIGÃO");
            p.setPreco(30.00f);
            p.setCategoria(Categoria.proteinaAnimal);
            listaprodutos.add(p);
            
            p = new Produto();
            p.setNomeProduto("LITRO SUCO NATURAL DE LARANJA");
            p.setPreco(50.00f);
            p.setCategoria(Categoria.bebidasNaoAlcoolicas);
            listaprodutos.add(p);
        }
        selecionarOrganizadorAleatorio();
    }
    
    public void selecionarOrganizadorAleatorio() {
        boolean organizer = false;
        List<Membro> pot = new ArrayList<>();
        for (int i = 0; i < listamembros.size(); i++) {
            String mt = listamembros.get(i).getTipoUsuario();
            if (mt.equals(TipoUsuario.PERMANENTE)) {
                pot.add(listamembros.get(i));
            } else if (mt.equals(TipoUsuario.ORGANIZADOR)) {
                organizer = true;
                break;
            }
        } 
        if (!organizer) {
            pot.get((int)(Math.random()*pot.size())).setTipoUsuario(TipoUsuario.ORGANIZADOR);
        }
    }
    public void registrarMembro(String tipo, String nome, String email, String senha, String telefone, String endereco, String categoriaAlimentar) {
        Membro m = new Membro();
        m.setNome(nome.toUpperCase());
        m.setEmail(email.toLowerCase());
        m.setSenha(senha);
        m.setStatusPagamento(StatusPagamento.ATIVO);
        m.setTelefone(telefone);
        m.setEndereco(endereco);
        m.setTipoUsuario(tipo);
        m.setCategoriaAlimentar(categoriaAlimentar);
        listamembros.add(m);
    }
    public boolean validarLogin(String email, String senha) {
        int idx = -1;
        Membro m = curruser();
        if (m != null && email.equals(m.getEmail())) {
            return false;
        }
        for (int i = 0; i < listamembros.size(); i++) {
            if (listamembros.get(i).getEmail().equals(email)) {
                idx = i;
                break;
            }
        }
        if (idx < 0) {
            return false;
        }
        m = listamembros.get(idx);
        return m.getSenha().equals(senha);
    }
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
