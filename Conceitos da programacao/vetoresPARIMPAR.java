import java.util.Scanner;

public class vetoresPARIMPAR {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int[] numeros = new int[10];
        int[] player = new int[] {100, 15, 5, 4};
        int[] inimigo = new int[] {50,10,5};

        int comando = sc.nextInt();
        if (comando == 1) {
            inimigo[0] -= player[1];
        }


        for (int i = 0; i < 9; i++) {
            System.out.println("Valor: " + (i + 1) + " ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Elementos pares");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i] + " ");
            }

        }

        System.out.println("Elementos Impares");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0){
                System.out.println(numeros[i] + " ");
            }

        }
    }
}
