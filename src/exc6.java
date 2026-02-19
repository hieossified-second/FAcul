import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do carro");
        double vl_fb = sc.nextDouble();

        System.out.println("Digite a porcentagem de lucro");
        double percentual_l = sc.nextDouble();

        System.out.println("Digite a porcentagem de imposto");
        double impos = sc.nextDouble();
        System.out.println("imposto esta em : " + impos);


        double perc_luc  = vl_fb / 100;
        double lucro = perc_luc * percentual_l;

        double impos_fb = vl_fb / 100;
        double impos_sbfb = impos_fb * impos;

        System.out.println("Lucro da fabrica: " + lucro);

        System.out.println("imposto sobre o carro: " + impos_sbfb);

        double val_fin = lucro + impos_sbfb + vl_fb;
        System.out.println("valor do carro final e: " + val_fin);
    }
}
