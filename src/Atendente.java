public non-sealed class Atendente extends Funcionario {

    protected double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
    

    public void realizarVenda(double valor){
        this.valorEmCaixa += valor;
        System.out.println("Valor total em caixa: R$" + this.valorEmCaixa);
    }

    public void fecharCaixa(){
        System.out.println("Caixa em processo de fechamento");
        System.out.println("Valor em caixa no momento do fechamento é de R$" + valorEmCaixa);
        this.valorEmCaixa = 0;
    }

    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes() + "| valor em caixa: R$" + valorEmCaixa;
    }

    
    

}
