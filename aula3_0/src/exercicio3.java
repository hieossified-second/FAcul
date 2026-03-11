import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 numero");
        double num1 = sc.nextDouble();
        System.out.println("digite outro numero");
        double num2 = sc.nextDouble();

        if (num1 == num2) {
            System.out.println("Numeros iguais");
        }
        else if (num1 > num2) {
            System.out.println(num1 - num2);
        }
        else {
            System.out.println(num2 - num1);
            }


    }
}
