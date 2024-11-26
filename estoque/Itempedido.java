public class Itempedido {
    Produto produto;
    int quantidade ;
    String idCliente;

    public Itempedido(Produto produto , int quantidade, String idcliente){
        this.produto = produto;
        this.quantidade = quantidade;
        this.idCliente = idcliente;
    }

    Itempedido item = new Itempedido( produto, 0 , null);
    
}
