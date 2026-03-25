import java.util.Scanner;

public class notaluno {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- Ola seja bem vindo(a) -\n" +
                "- Forneca o nome do aluno e as 3 notas tiradas nas avaliacoes - ");

        boolean menu = true;

        while (menu) {

            System.out.println("- Digite o nome do aluno");
            String student_name= sc.next();

            System.out.println("- Notas do aluno(a)");
            double student_nota1 = sc.nextDouble();
            double student_nota2 = sc.nextDouble();
            double student_nota3 = sc.nextDouble();

            double peso1 = 3.0;
            double peso2 = 3.0;
            double peso3 = 2.0;

            double f_note = (student_nota1 * peso1 + student_nota2 * peso2 + student_nota3 * peso3) / (peso1 + peso2 + peso3);

            if (f_note > 10) {
                System.out.println("Nota invalida tente novamente");
                continue;
            }
            if (f_note >= 6) {
                System.out.println("O(a) aluno(a)" + student_name + "  Passou!");
                System.out.printf("Nota final do aluno(a) e: %.2f%n ", f_note);
                System.out.println("Faca o calculo do proximo aluno abaixo! ");
                continue;
            }
            if (f_note < 3) {
                System.out.println("O(a) aluno(a) " + student_name + " foi reprovado(a)!");
                System.out.printf("Nota final do aluno(a) e: %.2f%n ", f_note);
                System.out.println("Faca o calculo do proximo aluno abaixo! ");
                continue;
            }
            break;
        }
    }
}
