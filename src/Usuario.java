import java.util.List;
import java.util.ArrayList;

public class Usuario {
    protected int idUsuario;
    public String nome;
    protected String CPF;
    public String email;
    private String senha;
    public String telefone;
    public String tipoUsuario;
//    public ArrayList<String> tipoUsuario = new ArrayList<>();
//
//    tipoUsuario.add("Cliente");
//    tipoUsuario.add("Entregador");
//    tipoUsuario.add("Admnistrador");

    public Usuario(int idUsuario, String nome, String CPF, String email, String senha, String telefone, String tipoUsuario){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString(){
        return "Id: " + idUsuario +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nTipo do Usuário: " + tipoUsuario;
    }
}
