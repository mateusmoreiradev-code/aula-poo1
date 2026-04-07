import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    public int idRestaurante;
    public String nomeRestaurante;
    protected String enderecoRestaurante;
    private List<Produto> cardapio = new ArrayList<>();

    public Restaurante(int idRestaurante, String nomeRestaurante, String enderecoRestaurante){
        this.idRestaurante = idRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public void adicionarProduto(Produto produto){
        cardapio.add(produto);
    }

    public List<Produto> getCardapio(){
        return cardapio;
    }
}
