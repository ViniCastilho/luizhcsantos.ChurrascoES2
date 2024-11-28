package Model;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {

	private int código;

	private Date data_empréstimo;

	private ArrayList<Produto> bens_emprestados;

	private Date prazo_entrega;

	private Participante usuário_solicitante;

	private boolean autorizado;

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public Date getData_empréstimo() {
        return data_empréstimo;
    }

    public void setData_empréstimo(Date data_empréstimo) {
        this.data_empréstimo = data_empréstimo;
    }

    public ArrayList<Produto> getBens_emprestados() {
        return bens_emprestados;
    }

    public void setBens_emprestados(ArrayList<Produto> bens_emprestados) {
        this.bens_emprestados = bens_emprestados;
    }

    public Date getPrazo_entrega() {
        return prazo_entrega;
    }

    public void setPrazo_entrega(Date prazo_entrega) {
        this.prazo_entrega = prazo_entrega;
    }

    public Participante getUsuário_solicitante() {
        return usuário_solicitante;
    }

    public void setUsuário_solicitante(Participante usuário_solicitante) {
        this.usuário_solicitante = usuário_solicitante;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
        
        

}
