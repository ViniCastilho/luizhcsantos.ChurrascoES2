/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Produto;
import Model.Emprestimo;
import Model.Participante;

/**
 *
 * @author lhsan
 */
public class DevolucaoController {

    private Emprestimo emprestimo = null;
    private Produto bem = null;
    private Participante usuario = null;

    public DevolucaoController() {
    }
    
    

    public DevolucaoController(Emprestimo emprestimo, Produto bem, Participante usuario) {
        this.emprestimo = emprestimo;
        this.bem = bem;
        this.usuario = usuario;
    }

    // Método para realizar a devolução do bem
    public void realizarDevolucao() {
        if (emprestimo.getUsuário_solicitante() == usuario && emprestimo.getBens_emprestados().get(0) == bem) {
            bem.setDisponibilidade(true);
            //emprestimo.setDevolvido(true);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Erro na devolução.");
        }
    }
}
