import java.util.List;
import java.util.ArrayList;

public class Pedido {

    public ArrayList<ItemPedido> itempedido = new ArrayList<>(); 
    String IdPedido ;
    
     public void additempedido(ItemPedido item){
        this.itempedido.add(item);

    }
 
     public void retiraritempedido(String idproduto){
        
        for( int x = 0; x < itempedido.size(); x++){

            if (this.itempedido.get(x).produto.idproduto == idproduto ) {
                this.itempedido.remove(x);
            }

            }

     }

    }