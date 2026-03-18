import java.util.Scanner;

public class exc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite um dia da semana");
        int dia_da_semana = sc.nextInt();

        switch (dia_da_semana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }
    }
}
