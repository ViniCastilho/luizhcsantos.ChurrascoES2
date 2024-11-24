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
public class Relatorio {
    private int idRelatorio;
    private int tipoRelatorio;
    private LocalDate dataGeracao;
    private String conteudo;
    
    public void gerarRelatorioDespesasMensais() {}
    public void gerarRelatorioDespesasEvento(Evento evento) {}
    public void gerarRelatorioDevedor() {}
}
