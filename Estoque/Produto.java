package estoque;

public class Produto {
    String  idproduto;
   String nome;
   int validade ;
    
    public Produto (String idproduto , String nome , int validade ) {

        this.idproduto = idproduto ;
        this.nome = nome ;
        this.validade = validade; 
       
    }
     public Produto setProduto (String idproduto , String nome , int validade ) {

        this.idproduto = idproduto ;
        this.nome = nome ;
        this.validade = validade; 
        return this;
    }
    public Produto getProduto () {
        
        return this;
    }
    Produto iten = new  Produto( null,null,0);
}
