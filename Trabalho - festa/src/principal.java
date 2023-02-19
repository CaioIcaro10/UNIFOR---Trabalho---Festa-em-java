import java.util.Scanner;

public class principal extends Festa {
    public principal(String CPF, int qtdConvidados, Double custoFesta) {
        super(CPF, qtdConvidados, custoFesta);
    }

    public static void main(String[] args) {
        Scanner scannerLeitura = new Scanner(System.in);

        System.out.print("Informe o CPF do responsável pela festa: ");
        String cpf = scannerLeitura.nextLine();

        System.out.print("Informe a quantidade de convidados: ");
        int quantidadeConvidados = scannerLeitura.nextInt();

        System.out.print("Informe o custo da festa em reais: ");
        double custo = scannerLeitura.nextDouble();

        Festa festaTest = new Festa(cpf, quantidadeConvidados, custo);

        System.out.println("Informe o Comprimento do Espaço: ");
        Double compDouble = scannerLeitura.nextDouble();

        System.out.println("Informe a Largura do Espaço: ");
        Double larDouble = scannerLeitura.nextDouble();

        Local localTest = new Local(cpf, quantidadeConvidados, custo, larDouble, compDouble);
    
        festaTest.mostra(cpf, quantidadeConvidados, custo);
        localTest.mostra();

        festaTest.possivelLocal(compDouble, larDouble);
    }
}
