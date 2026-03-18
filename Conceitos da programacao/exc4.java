import java.util.Scanner;

public class exc4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu plano A, B ou C?");
        String plan = sc.next();

        System.out.println("Qual seu salario");
        double salario = sc.nextDouble();

        double sal_porcentoA = 0.10 * salario;
        double sal_porcentoB = 0.15 * salario;
        double sal_porcentoC = 0.20 * salario;

        double sal_finA = salario + sal_porcentoA;
        double sal_finB = salario + sal_porcentoB;
        double sal_finC = salario + sal_porcentoC;

        if (plan.equals("A")){
            System.out.println("Seu saldo antigo era de: " + salario);
            System.out.println("Seu saldo teve um almento de 10%\n" +
                    "Seu saldo atual e: " + sal_finA );
        } else if (plan.equals("B")) {
            System.out.println("Seu saldo antigo era de: " + salario);
            System.out.println("Seu saldo teve um almento de 15%\n" +
                    "Seu saldo atual e: " + sal_finB );
        }
        if (plan.equals("C")) {
            System.out.println("Seu saldo antigo era de: " + salario);
            System.out.println("Seu saldo teve um almento de 20%\n" +
                    "Seu saldo atual e: " + sal_finC );
        }

        sc.close();
    }
}
