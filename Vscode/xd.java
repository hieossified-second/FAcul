import java.util.Scanner;

public class xd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String Name= sc.nextLine();

        System.out.println("Digite sua idade");
        int Age= sc.nextInt();


        int BornIn= (2026 - Age);


        System.out.println("Seja bem-vindo, suas informacoes estao logo a baixo");
        

        System.out.println(Name);
        System.out.println(Age);

        System.out.println("Nasceu em: " + BornIn);
        
        System.out.println();
    
        System.out.println("Digite suas notas");

        System.out.println("1 nota");
        double note1= sc.nextDouble();

        System.out.println("2 nota");
        double note2= sc.nextDouble();

        System.out.println("3 nota");
        double note3= sc.nextDouble();

        double p1= 2;
        double p2= 3;
        double p3= 3;

        double mp= (note1 * p1 + note2 * p2 + note3 * p3) / (p1 + p2 + p3);


        System.out.println(note1 + note2 + note3);

        System.out.println("Sua media de notas foi: " + mp);

        if (mp >= 5) {
            System.out.println("Voce passou");
        }
        else {
            System.out.println("Voce reprovou");
        }
        


    }


}