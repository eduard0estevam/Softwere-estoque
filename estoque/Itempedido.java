public class Itempedido {
    Produto produto;
    int quantidade ;
    String nome ;

    public Itempedido(Produto produto , int quantidade, String nome){
        this.produto = produto;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    Itempedido item = new Itempedido( produto, 0 , null);
    
}
