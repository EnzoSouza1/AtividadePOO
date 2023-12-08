import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir Moto");
            System.out.println("2 - Inserir Carro");
            System.out.println("3 - Visualizar Relatório");
            System.out.println("0 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Moto moto = cadastrarMoto();
                    veiculos.add(moto);
                    break;
                case 2:
                    Carro carro = cadastrarCarro();
                    veiculos.add(carro);
                    break;
                case 3:
                    visualizarRelatorio(veiculos);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    private static Moto cadastrarMoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo da moto: ");
        String modelo = scanner.next();
        System.out.print("Digite o preço da moto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite o ano da moto: ");
        int ano = scanner.nextInt();

        return new Moto(modelo, preco, ano);
    }

    private static Carro cadastrarCarro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Digite o preço do carro: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite os quilômetros do carro: ");
        double km = scanner.nextDouble();

        return new Carro(modelo, preco, km);
    }

    private static void visualizarRelatorio(List<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println("Preço (com ajustes): " + veiculo.getPreco());
            System.out.println();
        }
    }
}