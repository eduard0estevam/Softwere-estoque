public class ItemEstoque {
    Produto produto ;
    float quantidade ;

    public ItemEstoque (Produto produto , float quantidade){
        this.produto = produto ;
        this.quantidade = quantidade;
    }
    ItemEstoque item = new ItemEstoque(produto,0.0f);
    
}
