import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();

        int ano_nasceu = 2026 - idade;
        int em_2030 = 2030 - ano_nasceu;

        System.out.println("Voce tem " + idade + " e nasceu em " + ano_nasceu);
        System.out.println("Em 2030 Voce tera: " + em_2030);



    }
}
