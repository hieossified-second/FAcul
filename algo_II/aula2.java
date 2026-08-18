import java.util.Random;

public class aula2{
    public static void main(String[] args) {
        //MATRIZ
       
        int[][] m = new int[3][2];

        trava(m);
        exibir(m);
        
    }

    public static void trava(int[][] m){
        Random rd= new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rd.nextInt(10, 91);
            }
        }
    }

    public static void exibir(int m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");//Primeiro loop para exibir os numeros da primeira coluna no primeiro vetor
            }

            System.out.println();//pula uma linha para o proximo
        }
    }
}