import java.util.Random;

public class ExercicioMerge {

    // Método principal do MergeSort
    public static void mergeSort(long[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(long[] vetor, int inicio, int meio, int fim) {

        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;

        long[] esquerda = new long[tamanhoEsquerda];
        long[] direita = new long[tamanhoDireita];

        for (int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = vetor[inicio + i];
        }

        for (int j = 0; j < tamanhoDireita; j++) {
            direita[j] = vetor[meio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }

            k++;
        }

        while (i < tamanhoEsquerda) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < tamanhoDireita) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int tamanho = 1000;
        long[] numeros = new long[tamanho];

        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextLong(20, 1000);
        }
        mergeSort(numeros, 0, numeros.length - 1);


        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i]);
        }
    }
}
