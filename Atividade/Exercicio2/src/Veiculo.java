import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Veiculo {
    protected String modelo;
    protected double preco;

    Veiculo(String name, double preco) {
        this.modelo = name;
        this.preco = preco;
    }

    double getPreco() {
        return preco;
    }

    void printDados() {
        System.out.println("Modelo: " + modelo + ", Preço: " + preco);
    }
}


