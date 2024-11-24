/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;

/**
 *
 * @author Microsoft
 */
public class Membro {
    private int idMembro;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
    private CategoriaAlimentar categoriaAlimentar;
    private TipoUsuario tipoUsuario;
    private StatusPagamento statusPagamento;
    
    public void login(String email, String senha) {}
    public void atualizarDados(String endereco, String telefone) {}
    public void selecionarCategoriaAlimentar(CategoriaAlimentar novaCategoria) {}
    public StatusPagamento consultarPagamento() { return new StatusPagamento(); }
    public Evento criarEvento(Evento evento) { return new Evento(); }
    public void finalizarEvento(Evento evento) {}
    public void alterarDadosEvento(Evento evento) {}
    public StatusParticipante atualizarStatus() { return new StatusParticipante(); }
    public void cancelarInscricao(Evento evento) {}
    public CategoriaAlimentar consultarCategoriaAlimentar() { return new CategoriaAlimentar(); }
    public void responderConvite(StatusParticipante resposta) {}
    public void calcularDivisaoCustos() {}
    public Relatorio solicitarRelatorio(Relatorio tipoRelatorio) { return new Relatorio(); }
    public void realizarPagamento(float valor) {}
    public void verificarDevedor(Participante participante) {}
    public void redefinirSenha(String senha) {}
    public void registrarConvidade(String nomeCompleto, String telefone) {}
    public void aceitarRecusarCargo() {}
    public void solicitarExclusao() {}
}
