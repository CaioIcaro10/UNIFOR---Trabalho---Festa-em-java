public class Local extends Festa {
    
    private double Largura;
    private double Comprimento;


    public Local(String CPF, int qtdConvidados, Double custoFesta, double Largura, double Comprimento) {
        super(CPF, qtdConvidados, custoFesta);
        this.Largura = Largura;
        this.Comprimento = Comprimento;
    }


    public double getLargura() {
        return Largura;
    }


    public void setLargura(int largura) {
        Largura = largura;
    }


    public double getComprimento() {
        return Comprimento;
    }


    public void setComprimento(int comprimento) {
        Comprimento = comprimento;
    }

    public void mostra() {
        System.out.println("Largura: " + Largura);
        System.out.println("Comprimento: " + Comprimento);

    }

}
