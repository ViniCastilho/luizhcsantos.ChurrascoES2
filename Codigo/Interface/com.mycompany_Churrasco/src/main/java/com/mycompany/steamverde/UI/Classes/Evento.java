/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;
import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Microsoft
 */
public class Evento {
    private String nomeEvento;
    private LocalDate data;
    private String local;
    private Membro organizador;
    private List<Participante> participante;
    private List<Compra> compras;
    private List<Pagamento> pagamentos;

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setOrganizador(Membro organizador) {
        this.organizador = organizador;
    }

    public void setParticipante(List<Participante> participante) {
        this.participante = participante;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public Membro getOrganizador() {
        return organizador;
    }

    public List<Participante> getParticipante() {
        return participante;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
    
    public Evento() {
        participante = new ArrayList<>();
        compras = new ArrayList<>();
        pagamentos = new ArrayList<>();
        
    }
    
    public void adicionarParticipante(Membro membro) {
        Sistema s = Sistema.getinstancia();
        Participante p = new Participante();
        p.setMembro(membro);
        p.setEvento(s.currevent);
        p.setStatus(StatusParticipante.PENDENTE);
        participante.add(p);
    }
    public void removerParticipante(Participante participante) {
        int x = this.participante.indexOf(participante);
        if (x > 0) {
            this.participante.remove(x);
        }
    }
    public void adicionarProduto(Produto produto) {
        Sistema s = Sistema.getinstancia();
        Compra c = new Compra();
        c.setEvento(s.currevent);
        c.setProdutos(produto);
        c.setQtdComprada(0);
        c.setValorTotal(produto.getPreco()*c.getQtdComprada());
        this.compras.add(c);
    }
    public void decrementarProduto(Produto produto) {
        for (int i = 0; i < compras.size(); i++) {
            Compra c = compras.get(i);
            if (c.getProdutos().getNomeProduto().equals(produto.getNomeProduto())) {
                compras.remove(i);
                return;
            }
        }
    }
    public void calcularDivisaoCustos() {}
    public Relatorio gerarRelatorio(Relatorio tipoRelatorio) { return new Relatorio(); }
    public void atualizarInformacoes(LocalDate data, String local, String nomeEvento) {}
    public void enviarConvite(Membro membro) {}
    public void atribuirCustos(Participante participante) {}
    public void excluirEvento() {}
    public void atualizarListaDevedores() {}
    public void cirarListaCompras() {}
    public void registrarCompraEvento(Compra compra) {}
}
