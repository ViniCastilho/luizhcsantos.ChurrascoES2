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
    private int idPagamento;
    private Evento evento;
    private Membro membro;
    private float valorPago;
    private LocalDate dataPagamento;
    private StatusPagamento status;
    
    public void realizarPagamento(float valor) {}
    public StatusPagamento consultarStatus() { return new StatusPagamento(); }
    public StatusPagamento verificarStatusPagamento(Participante participante) { return new StatusPagamento(); }
    public void atualizarStatusPagamento(Participante participante) {}
}
