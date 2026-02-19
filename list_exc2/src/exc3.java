import java.util.Scanner;

public class exc3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois num acima de 0!");
        double numb1 = sc.nextDouble();
        double numb2 = sc.nextDouble();

        double result = Math.pow(numb1, numb2);

    System.out.println("O primeiro numero sera elevado ao outro, entao");
        System.out.println("O, " + numb1 + ", elevado a ," + numb2 + ", e igual a: " + result);

    }
}
