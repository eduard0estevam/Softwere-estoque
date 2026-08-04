import java.util.ArrayList;
import java.util.List;

public class TabelaPreco {
    private String tipotabela;
    private List<ItemTabela> itenstabela;

    // Construtor
    public TabelaPreco(String tipotabela) {
        this.tipotabela = tipotabela;
        this.itenstabela = new ArrayList<>();
    }

    // Método para adicionar um item
    public void adicionarItem(ItemTabela item) {
        itenstabela.add(item);
    }

    // Método para listar itens
    public void listarItens() {
        if (itenstabela.isEmpty()) {
            System.out.println("A tabela de preços está vazia.");
        } else {
            System.out.println("Tabela de Preços: " + tipotabela);
            for (ItemTabela item : itenstabela) {
                System.out.println(item);
            }
        }
    }

    // Getters e Setters
    public String getTipotabela() {
        return tipotabela;
    }

    public void setTipotabela(String tipotabela) {
        this.tipotabela = tipotabela;
    }

    public List<ItemTabela> getItenstabela() {
        return itenstabela;
    }

    public void setItenstabela(List<ItemTabela> itenstabela) {
        this.itenstabela = itenstabela;
    }
}
