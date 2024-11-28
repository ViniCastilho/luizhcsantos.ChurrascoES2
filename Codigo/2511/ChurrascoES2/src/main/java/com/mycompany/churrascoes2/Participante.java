package com.mycompany.churrascoes2;

public class Participante {

    private int idParticipante;

    private Evento evento;

    private Membro membro;

    private StatusParticipante status;

    public Participante(Membro membro, Evento evento) {
        this.membro = membro; 
        this.evento = evento; 
    }
    
    

    public void adicionarParticipante(Membro membro) {

    }

    public void removerParticipante(Membro membro) {

    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public StatusParticipante getStatus() {
        return status;
    }

    public void setStatus(StatusParticipante status) {
        this.status = status;
    }
    
    

}
