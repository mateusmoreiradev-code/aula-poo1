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

    public String getNomeRestaurante(){
        return nomeRestaurante;
    }    public void setNomeRestaurante(String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEnderecoRestaurante(){
        return  enderecoRestaurante;
    }
    public void setEnderecoRestaurante(String enderecoRestaurante){
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public List<Produto> getCardapio(){
        return cardapio;
    }

    public void adicionarProduto(Produto produto){
        cardapio.add(produto);
    }

}
