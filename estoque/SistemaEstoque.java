import java.util.ArrayList;

public class SistemaEstoque {
private static SistemaEstoque instancia ; 
 ArrayList<Estoque> listaestoque = new ArrayList<>() ; 
    private SistemaEstoque(){

    }
    public static SistemaEstoque getinstancia(){
        if(instancia == null ){
            instancia = new SistemaEstoque() ; 
        }
    return instancia ;
    }

    public void criarestoque( int idEstoque){
        Estoque estoque = new Estoque(idEstoque) ;
        this.listaestoque.add(estoque);
    }

    public Estoque localizarEstoque( int idestoque){
      
          for( int x = 0; x < listaestoque.size(); x++){

            if(idestoque == listaestoque.get(x).idEstoque){
                return listaestoque.get(x);
            }
        }
                
            System.out.println("Nao encontrado");
            return null;
    }


   public void addItemestoque(Produto produto, int quantidade, int idestoque) {
       Estoque estoque = localizarEstoque(idestoque);
       if (estoque != null) {
           ItemEstoque item = new ItemEstoque(produto, quantidade, produto.idproduto.hashCode());
           estoque.additemestoque(item);
       } else {
           System.out.println("Estoque não encontrado.");
       }
   }

}
