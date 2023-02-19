public class Festa  {
    
    private String CPF;
    private int qtdConvidados;
    private double custoFesta;


    public Festa(String CPF, int qtdConvidados, Double custoFesta) {
        this.CPF = CPF;
        this.qtdConvidados = qtdConvidados;
        this.custoFesta = custoFesta;
    }


    public String getCPF() {
        return CPF;
    }


    public int getQtdConvidados() {
        return qtdConvidados;
    }


    public double getCustoFesta() {
        return custoFesta;
    }


    public void setCPF(String cPF) {
        CPF = cPF;
    }


    public void setQtdConvidados(int qtdConvidados) {
        this.qtdConvidados = qtdConvidados;
    }


    public void setCustoFesta(int custoFesta) {
        this.custoFesta = custoFesta;
    }


    @Override
    public String toString() {
        return "Festa [CPF=" + CPF + ", qtdConvidados=" + qtdConvidados + ", custoFesta=" + custoFesta + "]";
    }

    public void mostra(String valorCPF,int quantConvidado, double custo) {
        System.out.println("CPF: " + CPF);
        System.out.println("Quantidade de Convidados: " + qtdConvidados);
        System.out.println("Custo da Festa: " + custoFesta);
    }

    public void classifica() {
        if(qtdConvidados < 300 && custoFesta < 15000) {
            System.out.println("Sua festa é uma Festa junina");
        } else if (qtdConvidados < 300 && custoFesta >= 15000) {
            System.out.println("Sua festa é um Aniversário");    
        } else if (qtdConvidados >= 300 && custoFesta < 15000) {
            System.out.println("Sua festa é uma Formatura");
        } else if (qtdConvidados >= 300 && custoFesta >= 15000) {
            System.out.println("Sua festa é um Casamento\n\n");
        }
    }


    public void possivelLocal(Double Comp, Double Larg) {
        double multi = Comp * Larg;
        double capMaxima = 4*multi/3;

        System.out.print("Testando se o tamanho do Local Permite...\n\n\n");
        
        System.out.println("O espaço tem " + multi + "m²");

        if(qtdConvidados > capMaxima) {
            System.out.println("Temos uma quantidade de pessoas acima do permitido");
        }else if (qtdConvidados <= capMaxima) {
            System.out.println("Temos Capacidade Suficifiente para " + qtdConvidados + " Pessoas");
        }
    }
}


