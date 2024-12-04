public class ItemPedido {
    Produto produto;
    int quantidade ;
    

    public ItemPedido(Produto produto , int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    ItemPedido item = new ItemPedido( produto, 0 );
    
}
