package Model;

public class Participante extends Pessoa {

    private int idParticipante;

    private Evento evento;

    private Membro membro;

    private StatusParticipante status;

    public Participante(Membro membro) {
        this.membro = membro; 
    }
    
    

    public void adicionarParticipante(Membro membro) {

    }

    public void removerParticipante(Membro membro) {

    }

}
