/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.steamverde.UI;

import com.mycompany.steamverde.UI.Classes.Categoria;
import com.mycompany.steamverde.UI.Classes.CategoriaAlimentar;
import com.mycompany.steamverde.UI.Classes.Compra;
import com.mycompany.steamverde.UI.Classes.Membro;
import com.mycompany.steamverde.UI.Classes.Pagamento;
import com.mycompany.steamverde.UI.Classes.Participante;
import com.mycompany.steamverde.UI.Classes.Produto;
import com.mycompany.steamverde.UI.Classes.Sistema;
import com.mycompany.steamverde.UI.Classes.StatusPagamento;
import com.mycompany.steamverde.UI.Classes.StatusParticipante;
import com.mycompany.steamverde.UI.Classes.TipoUsuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Microsoft
 */
public class UIEvento extends javax.swing.JFrame {
    
    
    public void updatetablepagamentos() {
        Sistema s = Sistema.getinstancia();
        DefaultTableModel model = (DefaultTableModel)(tablepagamentos.getModel());
        model.setRowCount(0);
        List<Pagamento> p = s.currevent.getPagamentos();
        for (int i = 0; i < p.size(); i++) {
            Pagamento x = p.get(i);
            model.addRow(new Object[]{
                x.getMembro().getEmail(),
                String.format("R$ %.2f", x.getValorPago()),
                x.getStatus(),
            });
        }
    }

    public void updatetableconvidados() {
        Sistema s = Sistema.getinstancia();
        DefaultTableModel model = (DefaultTableModel)(tableconvidados.getModel());
        model.setRowCount(0);
        List<Participante> p = s.currevent.getParticipante();
        for (int i = 0; i < p.size(); i++) {
            Participante x = p.get(i);
            model.addRow(new Object[]{
                x.getMembro().getEmail(),
                x.getStatus(),
            });
        }
    }
    
    public void updatetablecompras() {
        Sistema s = Sistema.getinstancia();
        DefaultTableModel model = (DefaultTableModel)(tablecompras.getModel());
        model.setRowCount(0);
        List<Compra> p = s.currevent.getCompras();
        for (int i = 0; i < p.size(); i++) {
            Compra x = p.get(i);
            model.addRow(new Object[]{
                x.getProdutos().getNomeProduto(),
                x.getProdutos().getCategoria(),
                String.format("R$ %.2f", x.getProdutos().getPreco()),
                x.getQtdComprada(),
                String.format("R$ %.2f", x.getProdutos().getPreco()*(float)(x.getQtdComprada())),
            });
        }
    }
    /**
     * Creates new form UIEvento
     */
    public UIEvento() {
        initComponents();
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        if (s.currevent.getData() != null) {
            data.setText(s.currevent.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        local.setText(s.currevent.getLocal());
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            data.setEditable(false);
            local.setEditable(false);
            prodname.setEditable(false);
            prodqtde.setEditable(false);
            payemail.setEditable(false);
        }
        List<Membro> update = new ArrayList<>();
        List<Participante> p = s.currevent.getParticipante();
        for (int i = 0; i < p.size(); i++) {
            Membro v = p.get(i).getMembro();
            update.add(v);
        }
        for (int i = 0; i < s.listamembros.size(); i++) {
            Membro x = s.listamembros.get(i);
            if (!update.contains(x)) {
                s.currevent.adicionarParticipante(x);
            }
        }
        List<Produto> compraupdate = new ArrayList<>();
        List<Compra> lc = s.currevent.getCompras();
        for (int i = 0; i < lc.size(); i++) {
            Produto pd = lc.get(i).getProdutos();
            compraupdate.add(pd);
        }
        for (int i = 0; i < s.listaprodutos.size(); i++) {
            Produto pd = s.listaprodutos.get(i);
            if (!compraupdate.contains(pd)) {
                s.currevent.adicionarProduto(pd);
            }
        }
        updatetableconvidados();
        updatetablecompras();
        updatetablepagamentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        generatepayments = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableconvidados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablecompras = new javax.swing.JTable();
        enroll = new javax.swing.JButton();
        local = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablepagamentos = new javax.swing.JTable();
        confpay = new javax.swing.JButton();
        updatedata = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prodname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prodqtde = new javax.swing.JTextField();
        updateamount = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        payemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setText("ENCERRAR EVENTO");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ORGANIZADOR");

        generatepayments.setText("GERAR PAGAMENTOS");
        generatepayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatepaymentsActionPerformed(evt);
            }
        });

        tableconvidados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "E-MAIL", "CONFIRMAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableconvidados);

        jLabel2.setText("CONVIDADOS");

        jLabel3.setText("COMPRAS");

        tablecompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PRODUTO", "CATEGORIA", "PREÇO", "QUANTIDADE", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablecompras);

        enroll.setText("CONFIRMAR SUA PRESENÇA");
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollActionPerformed(evt);
            }
        });

        jLabel4.setText("LOCAL");

        jLabel5.setText("DATA");

        data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        tablepagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "E-MAIL", "VALOR", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablepagamentos);

        confpay.setText("CONFIRMAR PAGAMENTO");
        confpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confpayActionPerformed(evt);
            }
        });

        updatedata.setText("ATUALIZAR");
        updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedataActionPerformed(evt);
            }
        });

        jLabel6.setText("PAGAMENTOS");

        jLabel7.setText("NOME");

        prodname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodnameActionPerformed(evt);
            }
        });

        jLabel8.setText("QUANTIDADE");

        prodqtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodqtdeActionPerformed(evt);
            }
        });

        updateamount.setText("ATUALIZAR QUANTIDADE");
        updateamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateamountActionPerformed(evt);
            }
        });

        finish.setText("ENCERRAR EVENTO");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        jLabel9.setText("E-MAIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enroll))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generatepayments))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prodname)
                                .addGap(173, 173, 173))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prodqtde, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateamount)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(local))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confpay))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(finish)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatedata)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatedata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enroll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(generatepayments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodqtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateamount)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(payemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confpay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(finish)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatepaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatepaymentsActionPerformed
        // TODO add your handling code here:
        
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            alert("Apenas o organizador pode fazer isso.");
            return;
        }
        
        if (s.currevent.getPagamentos().size() > 0) {
            alert("O pagamento já foi gerado.");
            return;
        }
        
        List<Pagamento> lpag = s.currevent.getPagamentos();
        List<Participante> lp = s.currevent.getParticipante();
        List<Pagamento> pagonivoro = new ArrayList<>();
        List<Pagamento> pagvegetariano = new ArrayList<>();
        List<Pagamento> pagcarnivoro = new ArrayList<>();
        List<Pagamento> pagvegano = new ArrayList<>();
        for (int i = 0; i < lp.size(); i++) {
            if (lp.get(i).getStatus().equals(StatusParticipante.PENDENTE)) continue;
            lp.get(i).getMembro().setStatusPagamento(StatusPagamento.DEVEDOR);
            Pagamento x = new Pagamento();
            x.setEvento(s.currevent);
            x.setMembro(lp.get(i).getMembro());
            x.setStatus(StatusPagamento.DEVEDOR);
            x.setValorPago(0);
            lpag.add(x);
            String d = lp.get(i).getMembro().getCategoriaAlimentar();
            switch (d) {
                case CategoriaAlimentar.ONIVORO:
                    pagonivoro.add(x);
                    break;
                case CategoriaAlimentar.VEGETARIANO:
                    pagvegetariano.add(x);
                    break;
                case CategoriaAlimentar.CARNIVORO:
                    pagcarnivoro.add(x);
                    break;
                case CategoriaAlimentar.VEGANO:
                    pagvegano.add(x);
                    break;
            }
        }
        
        List<Compra> lc = s.currevent.getCompras();
        System.out.println(String.format("%d compras identificadas", lc.size()));
        List<Pagamento> cpg = new ArrayList<>();
        for (int i = 0; i < lc.size(); i++) {
            Compra c = lc.get(i);
            cpg.clear();
            for (int j = 0; j < pagonivoro.size(); j++) {
                Pagamento p = pagonivoro.get(j);
                cpg.add(p);
            }
            switch (c.getProdutos().getCategoria()) {
                case Categoria.bebidasAlcoolicas:
                case Categoria.bebidasNaoAlcoolicas:
                    for (int j = 0; j < pagvegetariano.size(); j++) {
                        Pagamento p = pagvegetariano.get(j);
                        cpg.add(p);
                    }
                    for (int j = 0; j < pagcarnivoro.size(); j++) {
                        Pagamento p = pagcarnivoro.get(j);
                        cpg.add(p);
                    }
                    for (int j = 0; j < pagvegano.size(); j++) {
                        Pagamento p = pagvegano.get(j);
                        cpg.add(p);
                    }
                    break;
                case Categoria.derivadosLeite:
                    for (int j = 0; j < pagvegetariano.size(); j++) {
                        Pagamento p = pagvegetariano.get(j);
                        cpg.add(p);
                    }
                    for (int j = 0; j < pagcarnivoro.size(); j++) {
                        Pagamento p = pagcarnivoro.get(j);
                        cpg.add(p);
                    }
                    break;
                case Categoria.proteinaAnimal:
                    for (int j = 0; j < pagcarnivoro.size(); j++) {
                        Pagamento p = pagcarnivoro.get(j);
                        cpg.add(p);
                    }
                    break;
                case Categoria.proteinaNaoAnimal:
                    for (int j = 0; j < pagvegetariano.size(); j++) {
                        Pagamento p = pagvegetariano.get(j);
                        cpg.add(p);
                    }
                    for (int j = 0; j < pagvegano.size(); j++) {
                        Pagamento p = pagvegano.get(j);
                        cpg.add(p);
                    }
                    break;
            }
            float divp = (float)(cpg.size());
            float qtde = (float)(c.getQtdComprada());
            float valor = (c.getProdutos().getPreco()*qtde) / divp;
            System.out.println(String.format("%d dividem %s",
                cpg.size(),
                c.getProdutos().getNomeProduto()
            ));
            if (cpg.size() > 0) {
                System.out.println(String.format("%d por %.2f",
                    (int)(c.getQtdComprada()),
                    c.getProdutos().getPreco()
                ));
                System.out.println(String.format("%.2f divisão %.2f",
                    qtde*c.getProdutos().getPreco(),
                    valor
                ));
                for (Pagamento pgx : cpg) {
                    pgx.setValorPago(pgx.getValorPago() + valor);
                }
            }
            System.out.println("Próximo!");
        }
        
        for (int i = 0; i < lpag.size(); i++) {
            if (lpag.get(i).getValorPago() == 0.0f) {
                lpag.get(i).setStatus(StatusPagamento.ATIVO);
                lpag.get(i).getMembro().setStatusPagamento(StatusPagamento.ATIVO);
            }
        }
        
        updatetablepagamentos();
        
        JOptionPane.showMessageDialog(
            null, 
            "As despesas foram cobradas para todos os participantes confirmados.",
            "Cadastro bem sucedido",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_generatepaymentsActionPerformed

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollActionPerformed
        // TODO add your handling code here:
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        List<Participante> pl = s.currevent.getParticipante();
        if (s.currevent.getPagamentos().size() > 0) {
            alert("Não é possível participar depois da geração do pagamento.");
            return;
        }
        int cpt = -1;
        for (int i = 0; i < pl.size(); i++) {
            Membro x = pl.get(i).getMembro();
            if (x.getEmail().equals(m.getEmail())) {
                cpt = i;
                break;
            }
        }
        if (cpt < 0) {
            s.currevent.adicionarParticipante(m);
        }
        pl.get(cpt).setStatus(StatusParticipante.CONFIRMADO);
        updatetableconvidados();
    }//GEN-LAST:event_enrollActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void prodqtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodqtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodqtdeActionPerformed

    private void prodnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_prodnameActionPerformed

    private void updatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedataActionPerformed
        // TODO add your handling code here:
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            alert("Apenas o organizador pode fazer isso.");
            return;
        }
        
        if (s.currevent.getPagamentos().size() > 0) {
            alert("Não é possível participar depois da geração do pagamento.");
            return;
        }
        
        local.setText(local.getText().toUpperCase());
        if (local.getText().length() < 1) {
            alert("Local não preenchido.");
            return;
        }
        
        DateFormat source = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = source.parse(data.getText());
        } catch (ParseException ex) {
            alert("Data incorreta.");
            return;
        }
        LocalDate ldt = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        s.currevent.setData(ldt);
        s.currevent.setLocal(local.getText());
        
        JOptionPane.showMessageDialog(
            null, 
            "A atualização dos detalhes do evento foi realizada com sucesso.",
            "Cadastro bem sucedido",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_updatedataActionPerformed

    private void updateamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateamountActionPerformed
        // TODO add your handling code here:
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            alert("Apenas o organizador pode fazer isso.");
            return;
        }
        if (s.currevent.getPagamentos().size() > 0) {
            alert("Não é possível editar depois da geração do pagamento.");
            return;
        }
        prodname.setText(prodname.getText().toUpperCase());
        List<Compra> compraevento = s.currevent.getCompras();
        if (prodname.getText().length() == 0) {
            alert("Nome não preenchido.");
            return;
        }
        int idx = -1;
        for (int i = 0; i < compraevento.size(); i++) {
            if (compraevento.get(i).getProdutos().getNomeProduto().equals(prodname.getText())) {
                idx = i;
                break;
            }
        }
        if (idx < 0) {
            alert("Nenhuma compra com o nome identificado.");
            return;
        }
        int qtde = 0;
        try {
            qtde = Integer.parseInt(prodqtde.getText());
            if (qtde < 0) {
                alert("Quantidade inválida.");
                return;
            }
        } catch (NumberFormatException n) {
            alert("Quantidade inválida.");
            return;
        }
        compraevento.get(idx).setQtdComprada(qtde);
        updatetablecompras();
        JOptionPane.showMessageDialog(
            null, 
            "A alteração da compra foi realizada com sucesso.",
            "Cadastro bem sucedido",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_updateamountActionPerformed

    private void confpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confpayActionPerformed
        // TODO add your handling code here:
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            alert("Apenas o organizador pode fazer isso.");
            return;
        }
        if (s.currevent.getPagamentos().size() == 0) {
            alert("Não é possível quitar antes da geração do pagamento.");
            return;
        }
        
        payemail.setText(payemail.getText().toLowerCase());
        List<Compra> compraevento = s.currevent.getCompras();
        if (payemail.getText().length() == 0) {
            alert("E-mail não preenchido.");
            return;
        }
        int idx = -1;
        List<Pagamento> pg = s.currevent.getPagamentos();
        for (int i = 0; i < pg.size(); i++) {
            if (pg.get(i).getMembro().getEmail().equals(payemail.getText())) {
                idx = i;
                break;
            }
        }
        if (idx < 0) {
            alert("Nenhum participante com dívida encontrado.");
            return;
        }
        
        pg.get(idx).getMembro().setStatusPagamento(StatusPagamento.ATIVO);
        pg.get(idx).setStatus(StatusPagamento.ATIVO);
        
        updatetablepagamentos();
        
        JOptionPane.showMessageDialog(
            null, 
            "Quitação da dívida bem sucedida.",
            "Sucesso ao quitar",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_confpayActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        // TODO add your handling code here:
        Sistema s = Sistema.getinstancia();
        Membro m = s.curruser();
        if (!m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            alert("Apenas o organizador pode fazer isso.");
            return;
        }
        if (s.currevent.getPagamentos().size() == 0) {
            alert("Gere os pagamentos antes de finalizar o evento.");
            return;
        }
        
        List<Pagamento> pg = s.currevent.getPagamentos();
        boolean canFinish = true;
        for (int i = 0; i < pg.size(); i++) {
            if (pg.get(i).getStatus().equals(StatusPagamento.DEVEDOR)) {
                canFinish = false;
                break;
            }
        }
        
        if (!canFinish) {
            alert("Impossível encerrar o evento enquanto houver devedores.");
            return;
        }
        
        JOptionPane.showMessageDialog(
            null, 
            "O evento será encerrado.",
            "Sucesso ao encerrar",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        m.setTipoUsuario(TipoUsuario.PERMANENTE);
        s.selecionarOrganizadorAleatorio();
        
        this.dispose();
    }//GEN-LAST:event_finishActionPerformed

    private void alert(String txt) {
        JOptionPane.showMessageDialog(
            null, 
            txt, 
            "Ação inválida", 
            JOptionPane.WARNING_MESSAGE
        );
    }
    
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
            java.util.logging.Logger.getLogger(UIEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confpay;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JButton enroll;
    private javax.swing.JButton finish;
    private javax.swing.JButton generatepayments;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField local;
    private javax.swing.JTextField payemail;
    private javax.swing.JTextField prodname;
    private javax.swing.JTextField prodqtde;
    private javax.swing.JTable tablecompras;
    private javax.swing.JTable tableconvidados;
    private javax.swing.JTable tablepagamentos;
    private javax.swing.JButton updateamount;
    private javax.swing.JButton updatedata;
    // End of variables declaration//GEN-END:variables
}
