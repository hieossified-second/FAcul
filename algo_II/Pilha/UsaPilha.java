package Pilha;

import java.util.Scanner;

public class UsaPilha {
    public static void main(String[] args) {
        int var;
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o tamanho da pilha");
        int tamanho = sc.nextInt();
        int v[] = new int[tamanho];

        Pilha p = new Pilha(tamanho);

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("[1] - Push\n[2] - Pop");
            System.out.println("[3] - Top\n[4] - Size");
            System.out.println("[5] - Empty\n[6] - Exibir\n[7] - Sair");

            int op = sc.nextInt();

            switch (op) {
                case 1://push
                    if (!p.full()) {
                        System.out.println("Digite o valor");
                        var = sc.nextInt();
                        p.push(var);
                    }
                    else {
                        System.out.println("Pilha cheia");

                    }
                    break;
                case 2://pop
                    if (!p.empty()) {
                        System.out.println(p.top() + " Foi removido");
                        p.pop();
                    } else {
                        System.out.println("Pilha esta vazia");
                    }
                    break;

                case 3://top
                    if (!p.empty()) {
                        var = p.top();
                        System.out.println("O topo é: " + var);
                    } else {
                        System.out.println("Pilha vazia");
                    }

                    break;

                case 4://size
                    System.out.println("Tamanho da pilha " + p.size());
                    break;
                case 5:// empty
                    if(p.empty()){
                        System.out.println("A pilha esta vazia!");
                    }   else {
                        System.out.println("Pilha possui elementos!: " + p.size());
                    }

                    break;

                case 6: //exibir pilha
                    if (!p.empty()){
                        System.out.println("Elementos da pilha:");
                        p.exibirPilha();
                    }

                    break;
                case 7://sair
                    sc.close();
                    System.exit(0);
            }
        }
    }
}