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
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
    private String categoriaAlimentar;
    private String tipoUsuario;
    private String statusPagamento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCategoriaAlimentar(String categoriaAlimentar) {
        this.categoriaAlimentar = categoriaAlimentar;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCategoriaAlimentar() {
        return categoriaAlimentar;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }
    
    public void login(String email, String senha) throws Exception {
        boolean eqmail;
        boolean eqpass;
        eqmail = this.getEmail().equals(email);
        eqpass = this.getSenha().equals(senha);
        if (!(eqmail && eqpass)) {
            throw new Exception("Parâmetros senha ou e-mail incorretos.");
        }
    }
    public void atualizarDados(String endereco, String telefone) {
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    public void selecionarCategoriaAlimentar(String novaCategoria) {
        this.setCategoriaAlimentar(novaCategoria);
    }
    public String consultarPagamento() {
        return this.getStatusPagamento();
    }
    public Evento criarEvento(Evento evento) {
        return new Evento();
    }
    public void finalizarEvento(Evento evento) {}
    public void alterarDadosEvento(Evento evento) {}
    public StatusParticipante atualizarStatus() {
        return new StatusParticipante();
    }
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
