import java.util.Scanner;

public class excercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua sexualidade");
        String sexo = sc.nextLine();

        System.out.println("Informe seu peso");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();

        double alt_pow = altura * altura;

        double peso_ideal = peso + 0.75 * (alt_pow - 152);

        System.out.println(peso_ideal);

    }
}
