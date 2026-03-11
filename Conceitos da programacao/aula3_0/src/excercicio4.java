import java.util.Scanner;

public class excercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque o 1 numero");
        double num1 = sc.nextDouble();
        System.out.println("Coloque o 2 numero");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Esta em ordem Decrescente");
            System.out.println(num1);
            System.out.println(num2);
        }
        else if (num1 < num2){
            System.out.println("Esta em ordem Crescente");
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println("Numeros nao podem podem ser iguais");
        }

    }
}
