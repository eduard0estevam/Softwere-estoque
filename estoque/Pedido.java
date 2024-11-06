import java.util.List;
import java.util.ArrayList;

public class Pedido {

    ArrayList itempedido = new ArrayList<Pedido>(); 

     public void additempedido(Itempedido item){
        this.itempedido.add(item);
    }
 
     public void retiraritempedido(int idproduto){
        
        for( int x = 0; x < itempedido.size(); x++){

            if (itempedido.get(x).produto.idproduto == idproduto ) {
                this.itempedido.remove(x);
            }

            }

     }

    }