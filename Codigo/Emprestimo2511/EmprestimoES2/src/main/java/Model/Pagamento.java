/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author lhsan
 */
public class Pagamento {

    private int idPagamento;

    private Evento evento;

    private Membro membro;

    private float valorPago;

    private LocalDate dataPagamento;

    private StatusPagamento status;

    public void realizarPagamento(float valor) {

    }

    public StatusPagamento consultarStatus() {
        return null;
    }

    public StatusPagamento verificarStatusPagamento(Participante participante) {
        return null;
    }

    public void atualizarStatusPagamento(Participante participante) {

    }

}
