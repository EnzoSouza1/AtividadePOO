import java.util.Scanner;

class Moto extends Veiculo {
    private int ano;

    Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }

    double getPreco() {
        double precoFinal = super.getPreco();
        //5% ao preço
        if (ano >= 2008) {
            precoFinal *= 1.1; //10% da moto
        }
        return precoFinal;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano da moto: ");
        this.ano = scanner.nextInt();
    }

    void printDados() {
        super.printDados();
        System.out.println("Ano: " + ano);
    }
}

