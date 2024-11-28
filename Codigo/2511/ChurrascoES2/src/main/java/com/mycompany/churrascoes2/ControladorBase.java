/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import View.AutenticarView;

/**
 *
 * @author lhsan
 */
public class ControladorBase {
    
     // Método comum para todos os controladores
    public void abrirTelaAutenticacao() {
        
        // Obtém a instância única do UsuarioController
        UsuarioController usuarioController = UsuarioController.getInstancia();
        
        // Cria e exibe a janela de autenticação para o administrador
        AutenticarView autenticarView = new AutenticarView(usuarioController);
        autenticarView.setVisible(true);
        autenticarView.toFront(); // coloca a janela de autenticação  à frente de todas as outras
        autenticarView.requestFocusInWindow(); 
    }
    
}
