public class ListaNome {

    public static void mergeSort(String[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(String[] vetor, int inicio, int meio, int fim) {

        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;

        String[] esquerda = new String[tamanhoEsquerda];
        String[] direita = new String[tamanhoDireita];

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

            if (esquerda[i].compareToIgnoreCase(direita[j]) <= 0) {
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

        String[] nomes = {
            "ana",
            "Bruno",
            "carla",
            "Diego",
            "eduarda",
            "Felipe",
            "gabriela",
            "Henrique",
            "isabela",
            "João"
        };

        mergeSort(nomes, 0, nomes.length - 1);

        System.out.println("Nomes ordenados:");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
