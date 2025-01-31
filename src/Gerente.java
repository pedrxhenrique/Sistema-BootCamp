import java.util.ArrayList;
import java.util.List;

public non-sealed class Gerente extends Funcionario {

    public List<Atendente> listaAtendentes;
    public List<Vendedor> listaVendedores;

    public Gerente(String nome, String email, String senha){
        super(nome, email, senha, true);
        this.listaAtendentes = new ArrayList<>();
        this.listaVendedores = new ArrayList<>();
    }

    public void adicionarAtendente(Atendente atendente) {
        listaAtendentes.add(atendente);
    }

    public void adicionarVendedores(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }


    public void gerarRelatorioAtendentes(){
        int totalVendas = 0;

        for(Atendente atendente : listaAtendentes){
            System.out.println("-------------------------------");
            System.out.println("Atendente: " + atendente.getNome());
            System.out.println("Valor em Caixa: R$ " + atendente.getValorEmCaixa());

            totalVendas += atendente.getValorEmCaixa();
        }

        System.out.println("===== Totais Gerais =====");
        System.out.println("Total de Produtos Vendidos: R$ " + totalVendas);
        }

        public void gerarRelatorioVendedor(){

            int quantiaVendas = 0;

        for(Vendedor vendedor : listaVendedores){
            System.out.println("-------------------------------");
            System.out.println("Vendedor: " + vendedor.getNome());
            System.out.println("Quantia em Caixa: " + vendedor.getQuantidade());

            quantiaVendas += vendedor.getQuantidade();
        }

        System.out.println("===== Totais Gerais =====");
        System.out.println("Total de quantidades vendidas: " + quantiaVendas);


        }



    }


