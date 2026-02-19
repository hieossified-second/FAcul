import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque o raio: ");
        double raio= sc.nextDouble();

        double area = 3.14 * raio * raio;
        System.out.println(area);


    }

}
