/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

/**
 *
 * @author lhsan
 */
public class Compra {
    private int id; 
    private Evento evento; 
    private Produto produto;
    private int qtde; 
    private float valorTotal; 
    private float preco; 

    public Compra(Produto produto) {
        this.produto = produto;
    }
    
    

    public Compra(int id, Evento evento, Produto produto, int qtde, float valorTotal) {
        this.id = id;
        this.evento = evento;
        this.produto = produto;
        this.qtde = qtde;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
