public class ItensPedido {
    private int idItensPedido;
    protected Produto produto;
    protected int quantidade;
    protected double precoUnitario;

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public ItensPedido(int idItensPedido, Produto produto, int quantidade){
        this.idItensPedido = idItensPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double getSubTotal(){
        return quantidade * precoUnitario;
    }
}
