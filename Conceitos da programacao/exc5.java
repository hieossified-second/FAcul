
import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("[M] Media");
        System.out.println("[S] Diferenca (maior - menor)");
        System.out.println("[P] Produto");
        System.out.println("[D] Divisao (n1 / n2)");
        System.out.print("Opcao: ");

        char op = sc.next().trim().toUpperCase().charAt(0);

        switch (op) {
            case 'M':
                double media = (n1 + n2) / 2.0;
                System.out.println("Media = " + media);
                break;

            case 'S':
                double diferenca;
                if (n1 >= n2) {
                    diferenca = n1 - n2;
                } else {
                    diferenca = n2 - n1;
                }
                System.out.println("Diferenca (maior - menor) = " + diferenca);
                break;

            case 'P':
                double produto = n1 * n2;
                System.out.println("Produto = " + produto);
                break;

            case 'D':
                if (n2 == 0.0) {
                    System.out.println("Erro: divisao por zero nao e permitida.");
                } else {
                    double divisao = n1 / n2;
                    System.out.println("Divisao (n1 / n2) = " + divisao);
                }
                break;

            default:
                System.out.println("Opcao invalida. Use M, S, P ou D.");
        }

        sc.close();
    }
}

