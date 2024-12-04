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

    public void retiraritem( String idproduto){

        for( int x = 0; x < itensestoques.size(); x++){

        if (itensestoques.get(x).produto.idproduto == idproduto ) {
            this.itensestoques.remove(x);
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