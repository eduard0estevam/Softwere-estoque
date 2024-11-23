public class ItemTabela {
     private float precounitario;
     private String unidademedida;
     private int quantidade;
     private Produto produto;
 
     // Construtor
     public ItemTabela(Produto produto, float precounitario, String unidademedida, int quantidade) {
         this.produto = produto;
         this.precounitario = precounitario;
         this.unidademedida = unidademedida;
         this.quantidade = quantidade;
     }
 
     // Getters e Setters
     public float getPrecounitario() {
         return precounitario;
     }
 
     public void setPrecounitario(float precounitario) {
         this.precounitario = precounitario;
     }
 
     public String getUnidademedida() {
         return unidademedida;
     }
 
     public void setUnidademedida(String unidademedida) {
         this.unidademedida = unidademedida;
     }
 
     public int getQuantidade() {
         return quantidade;
     }
 
     public void setQuantidade(int quantidade) {
         this.quantidade = quantidade;
     }
 
     public Produto getProduto() {
         return produto;
     }
 
     public void setProduto(Produto produto) {
         this.produto = produto;
     }
 
     @Override
     public String toString() {
         return "ItemTabela{" +
                 "produto=" + produto.nome +
                 ", precounitario=" + precounitario +
                 ", unidademedida='" + unidademedida + '\'' +
                 ", quantidade=" + quantidade +
                 '}';
     }
}
