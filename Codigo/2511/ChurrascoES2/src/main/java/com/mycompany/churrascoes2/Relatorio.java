package com.mycompany.churrascoes2;

import java.time.LocalDate;

public class Relatorio {

    private int idRelatorio;

    private String tipoRelatorio;

    private LocalDate dataGeracao;

    private String conteudo;

    private Membro membro;

    private Evento evento;

    public Relatorio(int idRelatorio, String tipoRelatorio, LocalDate dataGeracao, String conteudo, Membro membro, Evento evento) {
        this.idRelatorio = idRelatorio;
        this.tipoRelatorio = tipoRelatorio;
        this.dataGeracao = dataGeracao;
        this.conteudo = conteudo;
        this.membro = membro;
        this.evento = evento;
    }
    
    

    public void gerarRelatorioDespesasMensais() {

    }

    public void gerarRelatorioDespesasEvento(Evento evento) {

    }

    public void gerarRelatorioDevedor() {

    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void setTipoRelatorio(String tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
