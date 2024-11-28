package com.mycompany.churrascoes2;

public class Membro {

    private int idMembro;

    private String nome;

    private String email;

    private String senha;

    private String endereço;

    private String telefone;

    private CategoriaAlimentar categoriaAlimentar;

    private String tipoUsuario;

    private StatusPagamento statusPagamento;

    private Pagamento[] pagamento;

    private Participante[] participante;

    private Evento[] evento;

    public Membro(String nome, String email, String senha, String endereço, String telefone, CategoriaAlimentar categoriaAlimentar, String tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereço = endereço;
        this.telefone = telefone;
        this.categoriaAlimentar = categoriaAlimentar;
        this.tipoUsuario = tipoUsuario;
    }

    public Membro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    
    
    

    public void login(String email, String senha) {

    }

    public void atualizarDados(String endereco, String telefone) {

    }

    public void selecionarCategoriaAlimentar(CategoriaAlimentar novaCategoria) {

    }

    public StatusPagamento consultarPagamento() {
        return null;
    }

    public Evento criarEvento(Evento evento) {
        return null;
    }

    public void finalizarEvento(Evento evento) {

    }

    public void alterarDadosEvento(Evento evento) {

    }

    public StatusParticipante atualizarStatus() {
        return null;
    }

    public void cancelarInscricao(Evento evento) {

    }

    public CategoriaAlimentar consultarCategoriaALimentar() {
        return null;
    }

    public void responderConvite(StatusParticipante resposta) {

    }

    public void calcularDivisaoCustos() {

    }

    public Relatorio solicitarRelatorio(Relatorio tipoRelatorio) {
        return null;
    }

    public void realizarPagamento(float valor) {

    }

    public void verificarDevedor(Participante participante) {

    }

    public void redefinirSenha(String novaSenha) {

    }

    public void registrarConvidado(String nomeCompleto, String telefone) {

    }

    public void aceitarRecusarCargo() {

    }

    public void solicitarExclusao() {

    }

    public int getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(int idMembro) {
        this.idMembro = idMembro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public CategoriaAlimentar getCategoriaAlimentar() {
        return categoriaAlimentar;
    }

    public void setCategoriaAlimentar(CategoriaAlimentar categoriaAlimentar) {
        this.categoriaAlimentar = categoriaAlimentar;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Pagamento[] getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento[] pagamento) {
        this.pagamento = pagamento;
    }

    public Participante[] getParticipante() {
        return participante;
    }

    public void setParticipante(Participante[] participante) {
        this.participante = participante;
    }

    public Evento[] getEvento() {
        return evento;
    }

    public void setEvento(Evento[] evento) {
        this.evento = evento;
    }
    
    

}
