import java.util.Scanner;

public class exercicio3 {
    public static int encontrarMax (int n1, int n2){
        if (n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva dois numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maior = encontrarMax(num1, num2);

        System.out.println("O numero maior é: " + maior);

        sc.close();
    }

}
