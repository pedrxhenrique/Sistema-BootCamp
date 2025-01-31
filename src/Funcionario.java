public sealed class Funcionario permits Gerente, Vendedor, Atendente {
    
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public Funcionario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean realizarLogin(String email, String senha){
        if(this.email.equals(email) && this.nome.equals(nome)){
            System.out.println("Login realizado com sucesso");
            return true;
        }else{
            System.out.println("Algo está errado, verifique as informações");
            return false;
        }
    }
    
    public boolean realizarLogoff(){
        System.out.println(nome + " voce foi deslogado com sucesso");
        return true;
    }

    public String imprimirInformacoes(){
        return "Funcionario: " + nome + "| email: " + email + "| senha: " + senha + "| administrador? " + administrador;
    }

}
