import java.util.Scanner;

public class Exercicio7 {
    public static int calcularFatorial(int n1){

        int fator = 1;

        for (int i = 1; i <= n1; i++) {
            fator *= i;
        }

        return fator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num_fat = sc.nextInt();

        int result = calcularFatorial(num_fat);

         System.out.println("Fatorial de " + num_fat + " = " + result);

    }
}
