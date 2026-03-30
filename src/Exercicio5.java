import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva tres notas para calcular a media");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double resultado = (nota1+ nota2 + nota3) / 3;

        System.out.printf("Sua media foi: %.2f ", resultado);
    }
}
