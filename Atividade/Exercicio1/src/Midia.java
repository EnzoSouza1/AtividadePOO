import java.util.Scanner;

class Midia {
    private int codigo;
    private double preco;
    private String nome;

    Midia() {}

    Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    int getCodigo() {
        return codigo;
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    double getPreco() {
        return preco;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getTipo() {
        return "Midia";
    }

    String getDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco;
    }

    void printDados() {
        System.out.println(getTipo() + " - " + getDetalhes());
    }

    void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código: ");
        codigo = scanner.nextInt();
        System.out.print("Digite o nome: ");
        nome = scanner.next();
        System.out.print("Digite o preço: ");
        preco = scanner.nextDouble();
    }
}

