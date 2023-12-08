import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Midia> catalogo = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar mídias cadastradas");
            System.out.println("2 - Cadastrar nova mídia");
            System.out.println("3 - Modificar mídias cadastradas");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mostrarMidias(catalogo);
                    break;
                case 2:
                    cadastrarMidia(catalogo);
                    break;
                case 3:
                    modificarMidias(catalogo);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void mostrarMidias(List<Midia> catalogo) {
        if (catalogo.isEmpty()) {
            System.out.println("Nenhuma mídia cadastrada.");
        } else {
            System.out.println("\nCatálogo de Mídias:");
            for (Midia midia : catalogo) {
                midia.printDados();
            }
        }
    }

    private static void cadastrarMidia(List<Midia> catalogo) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de mídia (1 para DVD, 2 para CD): ");
        int escolha = scanner.nextInt();

        Midia novaMidia;
        if (escolha == 1) {
            novaMidia = new DVD();
        } else if (escolha == 2) {
            novaMidia = new CD();
        } else {
            System.out.println("Escolha inválida.");
            return;
        }

        novaMidia.inserirDados();
        catalogo.add(novaMidia);
        System.out.println("Mídia cadastrada com sucesso!");
    }

    private static void modificarMidias(List<Midia> catalogo) {
        if (catalogo.isEmpty()) {
            System.out.println("Nenhuma mídia cadastrada para modificar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o código da mídia a ser modificada:");
        int codigoEscolhido = scanner.nextInt();

        for (Midia midia : catalogo) {
            if (midia.getCodigo() == codigoEscolhido) {
                midia.inserirDados();
                System.out.println("Mídia modificada com sucesso!");
                return;
            }
        }

        System.out.println("Mídia com código " + codigoEscolhido + " não encontrada.");
    }
}

