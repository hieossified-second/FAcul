import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        System.out.println("Caso ele seja maior que 20 ele sera dividido por 2");
        int numero = sc.nextInt();

        if (numero >= 20)
            System.out.println(numero / 2);

        if (numero <=19) {
            System.out.println(numero);
        }

        sc.close();
    }
}
