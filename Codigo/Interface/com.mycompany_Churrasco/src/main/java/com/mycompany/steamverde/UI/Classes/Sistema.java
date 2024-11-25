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
