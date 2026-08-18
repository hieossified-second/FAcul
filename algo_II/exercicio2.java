import java.util.Random;

public class exercicio2 {
    public static void matrizP(int[][]m){
        Random rd = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rd.nextInt(0, 10);
            }
        }
    }

    public static void exibir(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int somaMatrizPi(int m[][]){
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++, i++) {
                    soma += m[i][j];
                }
            } 
        return soma;
    }

    public static int somaMatrizSec(int m[][]){
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i + j == m.length - 1){
                    soma += m[i][j];
                }
            }
        } 
        return soma;
    }

    

    public static void main(String[] args) {
        int[][]m = new int[6][6];

        matrizP(m);
        exibir(m);
        System.out.println(somaMatrizPi(m));
        System.out.println(somaMatrizSec(m));
    }
}
