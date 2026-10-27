package Pilha;

public class Pilha {
    private int [] vetor;
    private int controle = 0; //controlar a quantidade de elementos

    public Pilha(int tamanho){ //construtor
        vetor = new int[tamanho];
    }

    /**
     * Verifica se a pilha esta vazia.
     * @return boolean
     */
    public boolean empty(){
        return controle == 0;
    }


    /**
     * Verifica se esta cheia
     * @return boolean
     */
    public boolean full(){
        return controle== vetor.length;
    }


    /**
     * Ele adiciona um int X no topo da pilha,
     * obedecendo o crinterio L.I.F.O
     * @param = x
     */
    public void push(int x){
        if(!full()){
            vetor[controle] = x;
            controle++;
        }else{
            System.out.println("Pilha cheia");
        }
    }


    /**
     * Exibe o tamanho do vetor
     * @return o tamanho do vetor
     */
    public int size(){
        return controle;
    }


    /**
     * Pre-condicao: SE a pilha nao estiver vazia
     * @return int
     *
     * adendo: controle --; É DIFERENTE DE controle = controle - 1;
     * ao fazer controle -- voce esta alterando o valor do controle e nao jogando ele
     * uma casa a menos
     */
    public int pop() {
        int valor=vetor[controle-1];
        return controle--;
    }


    /**
     * pre-condicao: Pilha nao vazia
     * @return
     */
    public int top(){
        return vetor[controle-1];
    }

    public void exibirPilha(){
        for(int i: vetor){
            System.out.println("Elemento: " + i);
        }
    }

}
