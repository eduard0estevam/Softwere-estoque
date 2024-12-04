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

    public void criarestoque( String idEstoque){
        Estoque estoque = new Estoque(idEstoque) ;
        this.listaestoque.add(estoque);
    }

    public Estoque localizarEstoque( String idestoque){
      
          for( int x = 0; x < listaestoque.size(); x++){

            if(idestoque == listaestoque.get(x).idEstoque){
                return listaestoque.get(x);
            }
        }
                
            System.out.println("Nao encontrado");
            return null;
    }


    public void addItemestoque( String idProdutoEstoque, int quantidade, String idestoque){
        Estoque estoque = null;
        ItemEstoque item = new ItemEstoque( quantidade) ;
        for(int x = 0; x < listaestoque.size(); x++){

            if ( listaestoque.get(x).idEstoque == idestoque){
                for( int y  )
                estoque = listaestoque.get(x);
            }
        }
        estoque.additemestoque(item);
    }

    public static void main(String[] args) {
        
    } 
}
