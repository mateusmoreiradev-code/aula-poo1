public class PagamentoPIX implements Pagamento{
    public boolean pago(double valor){
        System.out.println("Pagamento via PIX aprovado!");
        return true;
    }
    public String getPagamento(){
        return "PIX";
    }
}
