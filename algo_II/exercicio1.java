import java.util.Random;

public class exercicio1 {
    //Escreva uma funcao que retorne a soma total dos valores armazenados na matriz.


    public static void matriz(int [][]m){
        Random rd = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rd.nextInt(10, 91);
            }
        }
    }

    public static int calcularMatriz(int [][] m){
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                soma += soma + m[i][j];
            }
            
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] m = new int[3][2];

        matriz(m);
        System.out.println(calcularMatriz(m));
    }
}
