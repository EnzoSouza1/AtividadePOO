import java.util.Scanner;

class Carro extends Veiculo {
    private double km;

    Carro(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }

    double getPreco() {
        double precoFinal = super.getPreco();
        //  10% do carro
        if (km > 100000) {
            precoFinal *= 0.92; // 8% do carro
        }
        return precoFinal;
    }

    void setKm(double km) {
        this.km = km;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os quilômetros do carro: ");
        this.km = scanner.nextDouble();
    }

    void printDados() {
        super.printDados();
        System.out.println("Quilômetros: " + km);
    }
}
