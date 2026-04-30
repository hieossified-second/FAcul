import java.util.Scanner;

public class Exercicio5 {
    public static String exibirDiaSemana(int dia){
        
        switch (dia) {
            case 1:
                return "Segunda-Feira";
            case 2: 
                return "Terca-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sabado";
            case 7: 
                return "Domingo";
            default:
                return "Dia da semana invalido";    
        }

        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de acordo com o dia da semanqa (1 - 7)");
        int dia_esc = sc.nextInt();

        String dia_ex = exibirDiaSemana(dia_esc);

        System.out.println("Dia Correspondente " + dia_ex);
    }
}