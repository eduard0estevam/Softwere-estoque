import java.util.List;
import java.util.ArrayList;
public class Estoque { 
    
    ArrayList <ItemEstoque> itensestoques ;
    public int idEstoque;

    public Estoque( int idEstoque){
        this.idEstoque = idEstoque;
        this.itensestoques = new ArrayList<ItemEstoque>();  
    }
    public void additemestoque(ItemEstoque item , int idProdutoEstoque){
        for( int x = 0 ; x < itensestoques.size() ;x++ ){
            if( idProdutoEstoque == itensestoques.get(x).idProdutoEstoque ){
                this.itensestoques.add(item);
            }
        }
       

    }

    public void retiraritem(String idproduto, int quantidade) {
        for (int x = 0; x < itensestoques.size(); x++) {
            if (itensestoques.get(x).produto.idproduto.equals(idproduto)) {
                if (itensestoques.get(x).quantidade > quantidade) {
                    itensestoques.get(x).quantidade -= quantidade;
                } else {
                    itensestoques.remove(x);
                }
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
}

    public void listarItensEstoque() {
    if (itensestoques.isEmpty()) {
        System.out.println("O estoque está vazio.");
    } else {
        for (ItemEstoque item : itensestoques) {
            System.out.println("Produto: " + item.produto.nome + 
                               ", Quantidade: " + item.quantidade);
        }
    }
}

   

    public int getIdestoque() {
        return idEstoque;
    }

    public ArrayList<ItemEstoque> getItensestoques() {
        return itensestoques;
    }

    public void setIdestoque(int idestoque) {
        this.idEstoque = idestoque;
    }


    
}
