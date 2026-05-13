//Nome: Kevin da Silva Lima

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i + 1));
            nomes[i] = entrada.nextLine();
        }

        
        System.out.println("Nomes do último para o primeiro:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[4]);

        entrada.close();
    }
}