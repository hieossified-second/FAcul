import java.util.Random;
public class random {
    public static void main(String[] args){
        Random R1 = new Random();
        Random R2 = new Random();
        for (int i = 0; i < 10; i++) {
            int sorteado = 1 + R1.nextInt(20);
            System.out.println(sorteado);
        }
        for (int j = 0; j < 20; j++) {
            int sorteado = 1 + R1.nextInt(20);
            int sorteado2 = 1 + R2.nextInt(20);
            int result = sorteado + sorteado2;

            if (result % 2 == 0){
                System.out.println("e par");
            }
            else{
                System.out.println("Impar");
            }

            System.out.println(" ");
            System.out.println("Os randoms " + sorteado + " e " + sorteado2 + " - A soma dos dois e: " + result);
            System.out.println(" ");
            System.out.println(result);

            
        }
    }
}
