import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[200];

        inserirValor(vetor);
        insertionSort(vetor);
        exibir(vetor);

        System.out.println("Digite o valor desejado");
        int valor = sc.nextInt();
        int resultado = buscaBi(vetor, valor);

        if (resultado != -1){
            System.out.println("Encontrado no indice: " + resultado);
        } else {
            System.out.println("Valor nao encontrado");
        }

    }

    public static int buscaBi(int[] v, int valor){
        int inicio = 0;
        int fim = v.length;
        int meio;

        while(inicio <= fim){
            meio = (fim + inicio) / 2;

            if(v[meio] == valor){
                return meio;
            } else if (v[meio] > valor){
                inicio = meio + 1;
            }
            else{
                inicio = meio - 1;
            }
        }
        
        return -1;
    }

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int valor = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > valor) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = valor;
        }
    }

    public static void inserirValor(int [] v){
        Random rd = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(10, 101);
        }
    }


    public static void exibir(int [] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valor no vetor " + i + ": " + v[i]);
        }
    }
}
