public class Produto {
    int  idproduto;
   String nome;
   int validade ;
    
    public Produto (int idproduto , String nome , int validade ) {

        this.idproduto = idproduto ;
        this.nome = nome ;
        this.validade = validade; 
    }
    Produto produto = new  Produto(0,null,0);
}
