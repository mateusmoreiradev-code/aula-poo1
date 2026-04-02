public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente(1, "Hadassa", "111-222-333-44", "hadassa@gmail.com", "senhaFraca(123)//", "(47)940028922", "Cliente", "Estrada Rio Pascoal, Santa Alice do Sul");
        Entregador entregador = new Entregador(1, "José", "222-333-444-55", "joseentregador@gmail.com", "senhaforte123", "(47)936340589", "Entregador", true);

        System.out.println("------ Cliente ------");
        System.out.println(cliente);

        System.out.println("\n------ Entregador ------");
        System.out.println(entregador);
    }
}