public class Produto{
    protected int idProduto;
    public String nomeProduto;
    public String descricao;
    protected double preco;
    public Categoria categoria;

    public Produto(int idProduto, String nomeProduto, String descricao, double preco, Categoria categoria){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public double getPreco(){
        return preco;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

}
