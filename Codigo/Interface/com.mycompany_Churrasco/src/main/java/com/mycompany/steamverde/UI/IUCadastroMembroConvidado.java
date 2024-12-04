/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.steamverde.UI;

import com.mycompany.steamverde.UI.Classes.Membro;
import com.mycompany.steamverde.UI.Classes.Sistema;
import com.mycompany.steamverde.UI.Classes.StatusPagamento;
import com.mycompany.steamverde.UI.Classes.TipoUsuario;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft
 */
public class IUCadastroMembroConvidado extends javax.swing.JFrame {

    /**
     * Creates new form UICadastroMembroConvidado
     */
    public IUCadastroMembroConvidado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senha_text = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confsenha_text = new javax.swing.JPasswordField();
        cadastrar_botao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        catalim = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOME");

        jLabel2.setText("E-MAIL");

        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        jLabel3.setText("SENHA");

        jLabel4.setText("REPETIR SENHA");

        cadastrar_botao.setText("CADASTRAR CONVIDADO");
        cadastrar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_botaoActionPerformed(evt);
            }
        });

        jLabel6.setText("CATEGORIA ALIMENTAR");

        catalim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONÍVORO", "VEGETARIANO", "CARNÍVORO", "VEGANO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 226, Short.MAX_VALUE)
                        .addComponent(cadastrar_botao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_text)
                            .addComponent(email_text)
                            .addComponent(senha_text)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(confsenha_text)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(catalim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confsenha_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catalim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar_botao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textActionPerformed

    
    private void alertCadastro(String txt) {
        JOptionPane.showMessageDialog(
            null, 
            txt, 
            "Argumentos insuficientes", 
            JOptionPane.WARNING_MESSAGE
        );
    }
    
    private void cadastrar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_botaoActionPerformed
        // TODO add your handling code here:

        Pattern pat;
        boolean matchSuccessful;

        pat = Pattern.compile("^(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])$");
        email_text.setText(email_text.getText().toLowerCase());
        matchSuccessful = pat.matcher(email_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Endereço de e-mail inválido.");
            return;
        }

        int MINPASSLENGTH = 8;
        if (senha_text.getText().length() < MINPASSLENGTH) {
            alertCadastro(String.format("Comprimento de senha deve ser no mínimo %d.", MINPASSLENGTH));
            return;
        }
        pat = Pattern.compile("[A-Za-z0-9]*");
        matchSuccessful = pat.matcher(senha_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Senha inválida. Utilize apenas letras e números.");
            return;
        }
        if (!confsenha_text.getText().equals(senha_text.getText())) {
            alertCadastro("Repetição de senha incorreta.");
            return;
        }

        nome_text.setText(nome_text.getText().toUpperCase());
        pat = Pattern.compile("^[-',A-ZÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
        matchSuccessful = pat.matcher(nome_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Nome inválido.");
            return;
        }

        JOptionPane.showMessageDialog(
            null,
            "O cadastro foi realizado com sucesso.",
            "Cadastro bem sucedido",
            JOptionPane.INFORMATION_MESSAGE
        );
        Sistema sys = Sistema.getinstancia();
        Membro mem = new Membro();
        mem.setNome(nome_text.getText());
        mem.setEmail(email_text.getText());
        mem.setSenha(senha_text.getText());
        mem.setStatusPagamento(StatusPagamento.ATIVO);
        mem.setCategoriaAlimentar(catalim.getSelectedItem().toString());
        mem.setTipoUsuario(TipoUsuario.CONVIDADO);
        sys.listamembros.add(mem);
        this.dispose();
    }//GEN-LAST:event_cadastrar_botaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(IUCadastroMembroConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroConvidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroMembroConvidado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_botao;
    private javax.swing.JComboBox<String> catalim;
    private javax.swing.JPasswordField confsenha_text;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nome_text;
    private javax.swing.JPasswordField senha_text;
    // End of variables declaration//GEN-END:variables
}