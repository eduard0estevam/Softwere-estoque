import java.util.ArrayList;

public class ControleVendas {
    Pedido venda;
    private static ControleVendas instancia;
    ArrayList<Pedido> listavendas = new ArrayList<>() ;
    private ControleVendas(){

    }
    public static ControleVendas getinstancia(){
        if(instancia == null){
            instancia = new ControleVendas() ;
        }
        return instancia ;
    }
    
}
