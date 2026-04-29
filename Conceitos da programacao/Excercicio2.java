import java.util.Scanner;
import java.util.Random;

public class Excercicio2 {
    public static void main ( String [] args ){

        Random random = new Random();
        Scanner bob = new Scanner(System.in);

        int sorteio =  1 + random.nextInt(1 + 50 );
        int tentativas = 1;

        System.out.println(sorteio);
        System.out.println();

        System.out.println("Digite seu Palpite : ");
        int palpite = bob.nextInt();

        while (sorteio != palpite){


            if ( palpite < sorteio ) {
                    System  . out  . println("O numero é MAIOR ");

            }
            else if ( palpite > sorteio) {
                    System . out . println("Numero é Menor ");
            }

            System.out.println("DIGITE DNV");

            palpite = bob.nextInt();
            }

        System.out.println("ACERTOU!!!!!");

        }
    }

