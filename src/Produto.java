public class Produto{
    protected int idProduto;
    public String nomeProduto;
    public String descricao;
    protected double preco;
    public Categoria categoria;
    private int estoque;

    public Produto(int idProduto, String nomeProduto, String descricao, double preco, Categoria categoria, int estoque){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getEstoque(int estoque){
        return estoque;
    }

    public void reduzirEstoque(int quantidade){
        if(quantidade <= estoque){
            estoque -= quantidade;
        }else{
            System.out.println("Estoque indisponivel!");
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade >= 1){
            estoque += quantidade;
        }else{
            System.out.println("O valor deve ser positivo!");
        }
    }
}
