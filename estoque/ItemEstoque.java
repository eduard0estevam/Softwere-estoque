public class ItemEstoque {
    Produto produto ;
    int quantidade ;
    int idProdutoEstoque ;
    public ItemEstoque (Produto produto , int quantidade, int idProdutoEstoque){
        this.produto = produto ;
        this.quantidade = quantidade;
        this.idProdutoEstoque = idProdutoEstoque ;
    }
    public ItemEstoque (int quantidade ){
        this.quantidade = quantidade ;
    }
    ItemEstoque item = new ItemEstoque(produto,0,0);
    
}
