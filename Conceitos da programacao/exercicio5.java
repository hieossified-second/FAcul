import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pont1 = 4;
        double pont2 = 4;
        double pont3 = 2;


        System.out.println("Digite suas notas");
        Double not_alu1 = sc.nextDouble();
        Double not_alu2 = sc.nextDouble();
        Double not_alu3 = sc.nextDouble();

        double result = (not_alu1 * pont1 + not_alu2 * pont2 + not_alu3 * pont3) / (pont1 + pont2 + pont3); 

        System.out.println("seu resultado foi: " + result);



    }
    
}
