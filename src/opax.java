import java.util.Scanner;

public class opax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numro para fazer a tabuada dele ate 10");
        int var = sc.nextInt();

        int i;

        System.out.println("Tabuada 1");
        for (i = 0; i <= 10; i++) {
            
            int tabuada = i * var;
            System.out.println(tabuada);
        }

        if (i < 2) {
            System.out.println("Nigga");
        }


        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade nao entra");
            return;
        }
        else {
            System.out.println("Seja bem vindo " + nome);
        }
        
        System.out.println("Codigo continuou");
 
        int numb1 = 20;

        System.out.println("agora voce deve adivinhar o numero de 1 a 20 para continuar o codigo \n"
        + "caso erre voce ira encerrar o codigo");

        System.out.println("insira o numero");
        int adivinhou = sc.nextInt();

        if (adivinhou == numb1){
            System.out.println("Parabens, voce acertou");
        }
        else{
            System.out.println("Errou, encerrando codigo");
            return;
        }

        System.out.println("fim do codigo teste, Parabens");

        sc.close();
    }
}