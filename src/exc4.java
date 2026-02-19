import java.util.Scanner;

public class exc4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero que sera convertido para \npolegadas, milhas e jardas ");
        System.out.println("Lembrando que os numero colocados aqui estao em pes");
        System.out.println("1 pé= 12 polegadas, 1 jarda = 3 pés, 1 milha= 1,760 jardas.");

        double pe = sc.nextDouble();
        double polegada = pe * 12;
        double jarda = pe / 3;
        double mil = jarda / 1.760;

        System.out.println("Seu numero em Polegada e: " + polegada + "\n Seu numero em jarda e: " + jarda +
        "\n Seu numero em milha e: " + mil);

    }

}
