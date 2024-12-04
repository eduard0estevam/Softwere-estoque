public class Produto {
    String  idproduto;
   String nome;
   int validade ;
    
    public Produto (String idproduto , String nome , int validade ) {

        this.idproduto = idproduto ;
        this.nome = nome ;
        this.validade = validade; 
    }
    Produto produto = new  Produto( null,null,0);
}
