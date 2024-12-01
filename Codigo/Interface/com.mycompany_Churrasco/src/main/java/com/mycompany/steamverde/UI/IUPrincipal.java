/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.steamverde.UI;

import java.util.List;
import com.mycompany.steamverde.UI.*;
import com.mycompany.steamverde.UI.Classes.Membro;
import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class IUPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
        initComponents();
    }
    
    public void addMembro(String email, String nome, String dataniver) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroCliente = new javax.swing.JMenuItem();
        menuComprar = new javax.swing.JMenu();
        comprarProdutos = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        relatorioMembros = new javax.swing.JMenuItem();
        menuDadosSalvos = new javax.swing.JMenu();
        dadosSalvosDeletarDados = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        perfilUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");
        menuCadastro.setName(""); // NOI18N

        cadastroCliente.setText("Membro Permanente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroCliente);

        jMenuBar1.add(menuCadastro);

        menuComprar.setText("Comprar");
        menuComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComprarActionPerformed(evt);
            }
        });

        comprarProdutos.setText("Produtos");
        comprarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarProdutosActionPerformed(evt);
            }
        });
        menuComprar.add(comprarProdutos);

        jMenuBar1.add(menuComprar);

        menuRelatorios.setText("Relatórios");

        relatorioMembros.setText("Todos Membros");
        relatorioMembros.setName(""); // NOI18N
        relatorioMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioMembrosActionPerformed(evt);
            }
        });
        menuRelatorios.add(relatorioMembros);
        relatorioMembros.getAccessibleContext().setAccessibleName("");

        jMenuBar1.add(menuRelatorios);

        menuDadosSalvos.setText("Dados salvos");

        dadosSalvosDeletarDados.setText("Deletar dados");
        dadosSalvosDeletarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosSalvosDeletarDadosActionPerformed(evt);
            }
        });
        menuDadosSalvos.add(dadosSalvosDeletarDados);

        jMenuBar1.add(menuDadosSalvos);

        menuPerfil.setText("Perfil");

        perfilUsuario.setText("Perfil Membro");
        perfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioActionPerformed(evt);
            }
        });
        menuPerfil.add(perfilUsuario);

        jMenuBar1.add(menuPerfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        // TODO add your handling code here:
        IUCadastroMembroPermanente IUcli = new IUCadastroMembroPermanente(this,true);
        IUcli.setLocationRelativeTo(this);
        IUcli.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void comprarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarProdutosActionPerformed
        // TODO add your handling code here:
        IUVenda IU = new IUVenda(this,true);
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_comprarProdutosActionPerformed

    private void menuComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComprarActionPerformed
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_menuComprarActionPerformed

    private void dadosSalvosDeletarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosSalvosDeletarDadosActionPerformed
        // TODO add your handling code here:               
    }//GEN-LAST:event_dadosSalvosDeletarDadosActionPerformed

    private void relatorioMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioMembrosActionPerformed
        // TODO add your handling code here:
        IURelatorio IU = new IURelatorio(this, true);
        System.out.println("gerarrelatoriomembros");
        IU.relatoriotodosmembros();
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_relatorioMembrosActionPerformed

    private void perfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioActionPerformed
        // TODO add your handling code here:
        IUPerfilMembro IU = new IUPerfilMembro(this,true);
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_perfilUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
//        Configuracao conf = new Configuracao();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem comprarProdutos;
    private javax.swing.JMenuItem dadosSalvosDeletarDados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuComprar;
    private javax.swing.JMenu menuDadosSalvos;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem perfilUsuario;
    private javax.swing.JMenuItem relatorioMembros;
    // End of variables declaration//GEN-END:variables
}
