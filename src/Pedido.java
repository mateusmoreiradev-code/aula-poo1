import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private String status;

    //Agregação
    private Cliente cliente;
    private Entregador entregador;
    private Restaurante restaurante;

    //Abstração
    private Pagamento pagamento;
    private Entrega entrega;

    //Composição
    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido(int idPedido, Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.status = "EM ABERTO!";

    }

    public void adicionarItem(Produto produto, int quantidade){
        if(!status.equals("EM ABERTO!")){
            System.out.println("Não é possível incluir itens em um pedido que não está em aberto!");
        }else{
            int idItensPedido = 1;
            if(!itens.isEmpty()){
                idItensPedido = itens.size() + 1;
            }
            ItensPedido item = new ItensPedido(idItensPedido, produto, quantidade);
            itens.add(item);

            System.out.println("Item adicionado no pedido!");
        }
    }

    public double calcularTotal(){
        double total = 0;

        for(ItensPedido item : itens) {
            total += item.getSubTotal();
        }
        return total;
    }

    public void finalizarPedido(){
        double total = calcularTotal();
    }

    public int getId() {
        return idPedido;
    }

    public String getStatus() { return status; }
    public Cliente getCliente(){
        return cliente;
    }
    public Entregador getEntregador(){
        return entregador;
    }
    public List<ItensPedido> getItens(){
        return itens;
    }
    public Restaurante getRestaurante() { return restaurante; }
    public Pagamento getPagamento(){ return pagamento; }
    public Entrega getEntrega(){ return entrega; }


}
