import java.util.Scanner;

public class exc5 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Coloque ano que nasceu");
        int ano = sc.nextInt();

        System.out.println("Mes do seu nascimento");
        int mes = sc.nextInt();

        System.out.println("Dia de nascimento");
        int dia = sc.nextInt();

        int idade_pessoa = 2026 - ano;

        System.out.println("Voce tem " + idade_pessoa + " e nasceu em " + dia + "/" + mes + "/" + ano);

        int em2050 = 2050 - ano;

        System.out.println("Em 2050 voce tera, " + em2050);

    }

}
