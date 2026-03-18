import java.util.Scanner;

public class exc3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Em qual Periodo voce estuda?\n" +
                "M, V ou N?");
        String periodoS = sc.next();

        String periodoM = "M";
        String periodoV = "V";
        String periodoN = "N";



        if (periodoM.equals(periodoS)){
            System.out.println("Bom dia");
        }
        else if (periodoV.equals(periodoS)){
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
    }
}
