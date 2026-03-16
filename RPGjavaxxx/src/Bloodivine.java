import java.util.Scanner;

public class Bloodivine {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        String [] carregamento = {
            "Carregando",
                " /\\\n",
                " ||\n",
                " ||\n",
                " ||\n",
                " ||\n",
                " ||\n",
                " ||\n",
                " ||\n",
               "/__\\\n " ,
        };

        for (String linha : carregamento) {
            System.out.println(linha);
            Thread.sleep(500);
        }


        boolean autentic = false;

        while (!autentic) {

            System.out.println("Digite seu login");
            String Login = sc.nextLine();

            System.out.println("Digite sua senha");
            String senha = sc.nextLine();

            if (Login.equals("Solo") && senha.equals("2008")) {
                System.out.println("Logado");
                break;

            } else {
                System.out.println("Senha ou login incorretos");

            }
        }

        System.out.println(" ");
        System.out.println("Bem vindo de volta ");
        System.out.println(" ");



        System.out.println("======== ✠BlooDivine✠ ========");
        System.out.println("1 - ✦Novo Jogo✦ ");
        System.out.println("2 - ✦Creditos✦ ");
        System.out.println("3 - ✦Sair✦ ");
        System.out.println(" ");

        String menu = sc.nextLine();



        switch(menu) {
            case "2":
                System.out.println("Feito por 7 doentes");
                break;
            case "3":
                System.out.println("Te vejo na proxima eventureiro");
                break;
            case "1":
                System.out.println("Bem vindo aventureiro");

            default:
                System.out.println("Opcao invalida");
        }
            if (menu.equals("1")) {

            }


    }
}
