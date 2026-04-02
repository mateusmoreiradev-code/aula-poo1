

public class Usuario {
    protected int idUsuario;
    public String nome;
    protected String CPF;
    public String email;
    private String senha;
    public String telefone;
    public TipoUsuario1 tipoUsuario;

    public Usuario(int idUsuario, String nome, String CPF, String email, String senha, String telefone, TipoUsuario1 tipoUsuario){
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
