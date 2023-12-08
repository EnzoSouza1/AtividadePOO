import java.util.Scanner;
class CD extends Midia {
    private int nMusicas;

    CD() {}

    CD(int c, double p, String s, int m) {
        super(c, p, s);
        nMusicas = m;
    }

    int getNMusicas() {
        return nMusicas;
    }

    void setNMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    String getTipo() {
        return "CD";
    }

    @Override
    String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    void setMusica(int m) {
        nMusicas = m;
    }

    @Override
    void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de músicas: ");
        nMusicas = scanner.nextInt();
    }
}
