public class Cliente extends Usuario {
    protected String endereco;

    public Cliente(int idUsuario, String nome, String CPF, String email, String senha, String telefone, TipoUsuario1 tipoUsuario, String endereco){
        super(idUsuario, nome, CPF, email, senha, telefone, tipoUsuario);
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nEndereço " + endereco;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
