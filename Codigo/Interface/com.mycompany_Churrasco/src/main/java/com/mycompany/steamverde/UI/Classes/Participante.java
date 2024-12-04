/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.steamverde.UI.Classes;

/**
 *
 * @author Microsoft
 */
public class Participante {
    private Evento evento;
    private Membro membro;
    private String status;

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Evento getEvento() {
        return evento;
    }

    public Membro getMembro() {
        return membro;
    }

    public String getStatus() {
        return status;
    }
}
