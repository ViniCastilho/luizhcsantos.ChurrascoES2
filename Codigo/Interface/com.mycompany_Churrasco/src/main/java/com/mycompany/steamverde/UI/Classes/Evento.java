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
    private int idEvento;
    private String nomeEvento;
    private LocalDate data;
    private String local;
    private Membro organizador;
    private List<Participante> participante;
    private List<Compra> compras;
    private List<Pagamento> pagamentos;
    
    public void adicionarParticipante(Membro membro) {}
    public void removerParticipante(Participante participante) {}
    public void adicionarProduto(Produto produto) {}
    public void decrementarProduto(Produto produto) {}
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
