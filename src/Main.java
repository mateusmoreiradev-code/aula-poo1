import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private List<Cliente> cliente = new ArrayList<>();

    private static int idUsuario = 1;

    public static void main(String[] args){
        System.out.println("------Cadastro de Cliente------");
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF: ");
        String CPF = sc.nextLine();

        System.out.println("Digite o e-mail: ");
        String email = sc.nextLine();

        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        System.out.println("Digite o telefone: ");
        String telefone = sc.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = sc.nextLine();

        TipoUsuario1 tipoUsuario = TipoUsuario1.CLIENTE;

        Cliente cliente = new Cliente(idUsuario, nome, CPF, email, senha, telefone,tipoUsuario, endereco);

        idUsuario++;

        System.out.println("cliente cadastrado com sucesso!");
        System.out.println("Clientes: "+ cliente);
    }
}