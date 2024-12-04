/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;
import java.time.LocalDate;

/**
 *
 * @author Microsoft
 */
public class Pagamento {
    private Evento evento;
    private Membro membro;
    private float valorPago;
    private LocalDate dataPagamento;
    private String status;

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Evento getEvento() {
        return evento;
    }

    public Membro getMembro() {
        return membro;
    }

    public float getValorPago() {
        return valorPago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public String getStatus() {
        return status;
    }
    
    public void realizarPagamento(float valor) {}
    public void atualizarStatusPagamento(Participante participante) {}
}
