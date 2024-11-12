public class ItemEstoque {
    Produto produto ;
    int quantidade ;

    public ItemEstoque (Produto produto , int quantidade){
        this.produto = produto ;
        this.quantidade = quantidade;
    }
    ItemEstoque item = new ItemEstoque(produto,0);
    
}
