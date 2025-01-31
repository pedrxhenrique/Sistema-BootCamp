public class App {
    public static void main(String[] args) throws Exception {

        Atendente atendente2 = new Atendente("Pedro", "pedro@gmail.com", "pedro123", 0);

        Vendedor vendedor = new Vendedor("Maria", "maria123@gmail.com", "maria345", 0);

        Gerente gerente = new Gerente("Mel", "mel@hotmail.com", "mel567");

        System.out.println("========Atendente========");
        atendente2.realizarVenda(100);
        atendente2.fecharCaixa();
        System.out.println(atendente2.imprimirInformacoes());
        atendente2.realizarLogin("pedro34@gmail.com", "pedro1233");

        atendente2.realizarLogoff();

        System.out.println("========Vendedor========");
        vendedor.realizarLogin("maria123@gmail.com", "maria345");
        vendedor.quantiaVenda(150);
        vendedor.consultarVendas();
        System.out.println(vendedor.imprimirInformacoes());
        vendedor.realizarLogoff();

        System.out.println("========Gerente========");
        gerente.adicionarAtendente(atendente2);
        gerente.adicionarVendedores(vendedor);
        gerente.gerarRelatorioAtendentes();
        System.out.println("====================");
        gerente.gerarRelatorioVendedor();

        System.out.println(gerente.imprimirInformacoes());

    }
}
