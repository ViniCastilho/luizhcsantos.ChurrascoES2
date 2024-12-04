/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;

import java.util.List;

/**
 *
 * @author Microsoft
 */
public class Compra {
    private Evento evento;
    private Produto produtos;
    private int qtdComprada;
    private float valorTotal;
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Evento getEvento() {
        return evento;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public float getValorTotal() {
        return valorTotal;
    }
    
    public void registrarCompra(Evento evento, Produto produto, int qtdComprada, float valorTotal) {}
}
