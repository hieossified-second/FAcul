import java.util.Random;
public class Excercicio3{
    public static void main(String[] args) {

        Random random = new Random();
        int acomulador = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {

            int sorteio = 0 + random.nextInt(19 + 1);
            System.out.println(sorteio);
            acomulador += sorteio;


            if ( sorteio % 2 == 0 ){
                System.out.printf("Num: %d. Par " , sorteio);
                pares++;
            }

            else{
                System.out.printf("Num : %d. Impar " , sorteio);
                impares++;
            }
        }

        System.out.println();
        System.out.printf("A soma dos valores são %d " ,  acomulador);


        System.out.println();
        System.out.printf("A quantidade de numeros pares é : %d\n " ,pares );
        System.out.printf("A quantidade de numeros Impares é : %d\n " , impares);

        System.out.printf("A média dos valores é : %d" , (acomulador / 10));

    }
}