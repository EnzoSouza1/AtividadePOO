import java.util.Scanner;

class DVD extends Midia {
    private int nFaixas;

    DVD() {}

    DVD(int c, double p, String s, int f) {
        super(c, p, s);
        nFaixas = f;
    }

    int getNFaixas() {
        return nFaixas;
    }

    void setNFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    String getTipo() {
        return "DVD";
    }

    @Override
    String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    void setFaixas(int f) {
        nFaixas = f;
    }

    @Override
    void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de faixas: ");
        nFaixas = scanner.nextInt();
    }
}