import java.util.Random;

public class Excercicio1 {
        public static  void main (String[]args ){
            Random random = new Random();
            int sorteio = random.nextInt(100);
            System.out.println(sorteio);
        }
}

