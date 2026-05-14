import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private List<Cliente> clientes = new ArrayList<>();
    private static final List<Categoria> categorias = new ArrayList<>();
    private static final List<Entregador> entregadores = new ArrayList<>();
    private static final List<Pedido> pedidos = new ArrayList<>();
    private static final List<Restaurante> restaurantes = new ArrayList<>();

    private static int idUsuario = 1;

    public static void main(String[] args){
        boolean executando = true;

        while(executando) {
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("   Sistema de Delivery   ");
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("1. Area de ADM");
            System.out.println("2. Area de Cliente");
            System.out.println("3. Area de Entregador");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    menuADM();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 3:
                    menuEntregador();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            sc.close();
        }
    }
    public static void menuADM(){
        boolean voltar = false;

        while(!voltar){
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("  Area do Administrador  ");
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("1. Cadastrar categoria");
            System.out.println("2. Cadastrar restaurante");
            System.out.println("3. Cadastrar produto no restaurante");
            System.out.println("4. Cadastrar entregador");
            System.out.println("5. Listar restaurante");
            System.out.println("6. Listar entregadores");
            System.out.println("7. Listar pedidos");
            System.out.println("0. Voltar");
            System.out.println("Escolha uma opção: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    cadastrarCategoria();
                    break;
                    case 2:
                        cadastrarRestaurante();
                        break;
                            case 3:
                                cadastrarProdutoNoRestaurante();
                                break;
                            case 4:
                                cadastrarEntregador();
                                break;
                            case 5:
                                listarRestaurante();
                                break;
                            case 6:
                                listarEntregadores();
                                break;
                            case 7:
                                listarPedidos();
                                break;
                            case 0:
                                voltar = true;
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }
            }

            public static void cadastrarCategoria(){
                System.out.println("Digite o nome da categoria: ");
                String nome = sc.nextLine();
                Categoria categoria = new Categoria(nome);

                categorias.add(categoria);
                System.out.println("Categoria adicionada!");
                System.out.println("Categoria criada: " + categoria.getNome());
    }
}

