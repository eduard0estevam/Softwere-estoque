import java.util.List;
import java.util.ArrayList;
public class Estoque {
    private static Estoque instancia ;
    ArrayList <ItemEstoque> itensestoques ;

    private Estoque(){

    }

    public static Estoque getInstancia() {
        if(instancia == null){
            instancia = new Estoque() ;
        }
        return instancia ;
    }
    public void additemestoque(ItemEstoque item){
        this.itensestoques.add(item);
    }

    public void retiraritem(int idproduto){

        for( int x = 0; x < itensestoques.size(); x++){

        if (itensestoques.get(x).produto.idproduto == idproduto ) {
            this.itensestoques.remove(x);
        }

        }
    }

    public void main(){


    }
    
}