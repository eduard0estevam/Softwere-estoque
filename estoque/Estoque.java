import java.util.List;
import java.util.ArrayList;
public class Estoque { 
    
    ArrayList <ItemEstoque> itensestoques ;
    public String  idEstoque;

    public Estoque( String idEstoque){
        this.idEstoque = idEstoque;
        this.itensestoques = new ArrayList<ItemEstoque>();  
    }
    public void additemestoque(ItemEstoque item){
        this.itensestoques.add(item);
    }

    public void retiraritem( String idproduto){

        for( int x = 0; x < itensestoques.size(); x++){

        if (itensestoques.get(x).produto.idproduto == idproduto ) {
            this.itensestoques.remove(x);
        }

        }
    }

   

    public String getIdestoque() {
        return idEstoque;
    }

    public ArrayList<ItemEstoque> getItensestoques() {
        return itensestoques;
    }

    public void setIdestoque(String idestoque) {
        this.idEstoque = idestoque;
    }


    
}