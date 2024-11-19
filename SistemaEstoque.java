import java.util.ArrayList;

public class SistemaEstoque {
private static Singleton instancia ; 
 ArrayList<Estoque> listaestoque = new ArrayList<>() ; 
    private Singleton(){

    }
    public static Singleton getinstancia(){
        if(instancia == null ){
            instancia = new Singleton() ; 
        }
    return instancia ;
    }

    public void criarestoque(){

    }

    public Estoque localizarEstoque( int  idestoque){
      
          for( int x = 0; x < listaestoque.size(); x++){

            if(idestoque == listaestoque.get(x).idEstoque){
                return listaestoque.get(x);
            }
        }
                
            System.out.println("Nao encontrado");
            return null;
    }
    public void addItemestoque(int idestoque,  int idproduto , int quantidade ){
    
    }

    public static void main(String[] args) {
        
    } 
}
