import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== Menu ==========");
        System.out.println(" ");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listas de produtos");
        System.out.println("3 - Sair do Sistema");
        System.out.println(" ");
        System.out.println("====== Escolha uma das opções ======");


        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Voce escolheu a primeira opçcao");
                System.out.println("que e a opcao de cadastrar produto");

                System.out.println("o que voce deseja cadastrar ?");

                break;

            case 2:
                System.out.println("Voce escolheu a segunda opçcao");
                System.out.println("que e a opcao de Listas dos produtos");
                break;

            case 3:
                System.out.println("Voce escolheu a terceira opçcao");
                System.out.println("que e a opcao de Sair do Sistema");
                break;


            default:
                System.out.println("item do menu invalido");

        }
    }
}
