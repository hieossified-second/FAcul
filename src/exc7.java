import java.util.Scanner;

public class exc7 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Informe as suas horas trabalhadas em um dia");
       double hrs_t = sc.nextDouble();

       double sal_min = 1621;

       double hr_trb = sal_min / 2;

       double sal_brut = hrs_t * hr_trb;

       double impost = 0.03 * sal_brut;

       double sal_a_rcb = sal_brut - impost;

       System.out.println("Voce ira receber: " + sal_a_rcb);




   }
}
