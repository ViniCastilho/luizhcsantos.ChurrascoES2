package Model;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private int idEvento;
    private String nomeEvento;
    private LocalDate data;
    private String local;
    private Membro organizador;
    private List<Participante> participantes = new ArrayList<>();
    private List<Compra> compras = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();

    // Adiciona um participante ao evento
    public void adicionarParticipante(Membro membro) {
        Participante participante = new Participante(membro);
        participantes.add(participante);
        System.out.println("Participante adicionado: " + membro.getNome());
    }

    // Remove um participante do evento
    public void removerParticipante(Participante participante) {
        if (participantes.remove(participante)) {
            System.out.println("Participante removido: " + participante.getNome());
        } else {
            System.out.println("Participante não encontrado.");
        }
    }

    // Adiciona um produto à lista de compras
    public void adicionarProduto(Produto produto) {
        Compra compra = new Compra(produto);
        compras.add(compra);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Decrementa um produto da lista de compras
    public void decrementarProduto(Produto produto) {
        compras.removeIf(compra -> compra.getProduto().equals(produto));
        System.out.println("Produto removido: " + produto.getNome());
    }

    // Calcula a divisão de custos entre os participantes
    public void calcularDivisaoCustos() {
        double total = compras.stream().mapToDouble(Compra::getPreco).sum();
        double custoPorPessoa = total / participantes.size();
        for (Participante p : participantes) {
            p.setCusto(custoPorPessoa);
            System.out.println("Custo atribuído ao participante " + p.getNome() + ": R$ " + custoPorPessoa);
        }
    }

    // Gera um relatório do evento
    public Relatorio gerarRelatorio(Relatorio tipoRelatorio) {
        System.out.println("Gerando relatório do tipo: " + tipoRelatorio.getTipo());
        return new Relatorio(tipoRelatorio.getTipoRelatorio(), compras, pagamentos);
    }

    // Atualiza as informações do evento
    public void atualizarInformarcoes(LocalDate data, String local, String nomeEvento) {
        this.data = data;
        this.local = local;
        this.nomeEvento = nomeEvento;
        System.out.println("Informações do evento atualizadas: " + nomeEvento);
    }

    // Envia convite para um membro
    public void enviarConvite(Membro membro) {
        System.out.println("Convite enviado para: " + membro.getNome());
    }

    // Atribui custos para um participante específico
    public void atribuirCustos(Participante participante) {
        double total = compras.stream().mapToDouble(Compra::getPreco).sum();
        double custoPorPessoa = total / participantes.size();
        participante.setCusto(custoPorPessoa);
        System.out.println("Custo atribuído ao participante " + participante.getNome() + ": R$ " + custoPorPessoa);
    }

    // Exclui o evento
    public void excluirEvento() {
        participantes.clear();
        compras.clear();
        pagamentos.clear();
        System.out.println("Evento excluído.");
    }

    // Atualiza a lista de devedores
    public void atualizarListaDevedores() {
        System.out.println("Atualizando lista de devedores...");
        for (Participante p : participantes) {
            if (p.getCusto() > p.getPagamentos()) {
                System.out.println("Participante devedor: " + p.getNome());
            }
        }
    }

    // Cria uma lista de compras baseada nos produtos adicionados
    public void criarListaCompras() {
        System.out.println("Lista de compras criada com os seguintes itens:");
        for (Compra compra : compras) {
            System.out.println("- " + compra.getProduto().getNome());
        }
    }

    // Registra uma compra no evento
    public void registrarCompraEvento(Compra compra) {
        compras.add(compra);
        System.out.println("Compra registrada: " + compra.getProduto().getNome() + " - R$ " + compra.getPreco());
    }

}
