public non-sealed class Vendedor extends Funcionario{

    protected int quantidade;

    public Vendedor(String nome, String email, String senha, int quantidade) {
        super(nome, email, senha, false);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    public void quantiaVenda(int quantia){ 
        this.quantidade += quantia;
        System.out.println("Quantita total vendida: " + this.quantidade + " unidades.");
    }

    public void consultarVendas(){
        System.out.println("A consulta de vendas, retornou a venda de " + quantidade + " produtos.");
    }

    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes() + " quantidade de produtos " + quantidade;
    }
    
}
