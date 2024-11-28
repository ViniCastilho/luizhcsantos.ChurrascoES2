package Model;

public class Produto {

	private int id;
	private String nome;
        
        private Categoria categoria; 
        private float preco; 
        private int qtde; 
        
        

    /**
     *
     * @param codigo
     * @param nome
     * @param descricao
     * @param disponivel
     * @param tangivel
     * @param movel
     * @param permanente
     */
    public Produto(int id, String nome, float preco, Categoria categoria, int qtde) {
        this.id = id;  
        this.nome = nome;
        this.categoria = categoria; 
        this.qtde = qtde; 
    }


    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void atualizarQtde(int novaQuantidade) {
        this.qtde = novaQuantidade; 
    }
    
    public float calcualarValorTotal() {
        return 0; 
    }
    
    public void registrarProduto(String nomeProduto, Categoria categoria, float preco, int qtde) {
        
    }

}
