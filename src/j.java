import java.util.Scanner;

public class j {
    public static void main(String[] args){
        //programa para ver se a pessoa tem mais de 18
        //e saber com o que trabalha

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira sua idade");
        int age = sc.nextInt();

        if (age < 18 ) {
            System.out.println("voce nao pode entrar, apenas maiores de 18");
            return;
        }
            else {
            System.out.println("Seja bem-vindo");
        }

        System.out.println("Voce trabalha");
        String sn = sc.next();
        
        String trc = "";

        if (sn.equalsIgnoreCase("sim")) {
            System.out.println("Otimo, com o que voce trabalha?");
            trc = sc.next();
        }
        else if (sn.equalsIgnoreCase("nao")) {
            System.out.println("Que pena");
        }

        System.out.println("voce tem " + age + "  anos \ne voce trabalha com " + trc);
    
    }
}

