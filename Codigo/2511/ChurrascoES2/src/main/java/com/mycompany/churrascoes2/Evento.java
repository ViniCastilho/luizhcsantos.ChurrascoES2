/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrascoes2;

import java.sql.Date;

/**
 *
 * @author lhsan
 */
public class Evento {
    
    private String nomeEvento; 
    private Date dataEvento; 
    private String local; 
    private String nomeMembro; 

    public Evento(String nomeEvento, Date dataEvento, String local, String nomeMembro) {
        this.nomeEvento = nomeEvento; 
        this.nomeMembro = nomeMembro; 
        this.dataEvento = dataEvento; 
        this.local = local; 
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }
    
    
    
}
