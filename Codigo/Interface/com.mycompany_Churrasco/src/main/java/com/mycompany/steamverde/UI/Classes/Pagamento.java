/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;

/**
 *
 * @author Microsoft
 */
public class Pagamento {
    private int idPagamento;
    private Evento evento;
    private Membro membro;
    private float valorPago;
    private LocalDate dataPagamento;
    private StatusPagamento status;
    
    public void realizarPagamento(float valor) {}
    public StatusPagamento consultarStatus() {}
    public StatusPagamento verificarStatusPagamento(Participante participante) {}
    public void atualizarStatusPagamento(Participante participante) {}
}