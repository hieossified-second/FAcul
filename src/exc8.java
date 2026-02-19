import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double imposto = 0.038;

        System.out.println("insira a quantidade de deposito");
        double salario = sc.nextDouble();


        System.out.println("Insira o valor do cheque/ Valor total: " + salario );
        double ch1 = sc.nextDouble();
        double ch1_imp = ch1 * imposto;
        double ch1_pimp = ch1 - ch1_imp;


        System.out.println("Insira o valor do segundo cheque/ Valor sobrando: " + ch1_pimp );
        double ch2 = sc.nextDouble();
        double ch2_imp = ch2 * imposto;
        double ch2_pimp = ch2 - ch2_imp;
        double sal_final1 = salario - ch1_pimp;
        double sal_final2 = sal_final1 - ch2_pimp;

        System.out.println("Voce fez dois cheques de, " + ch1 + " e de " + ch2 + " \nVoce tem sobrando " + sal_final2);

    }
}
