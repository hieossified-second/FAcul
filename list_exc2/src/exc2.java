import java.util.Scanner;

public class exc2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero e ele vai ficar ao quadrado!");
        double num1 = sc.nextDouble();

        //Rs 1
        double result = Math.pow(num1, 2);
        System.out.println("Result: "+ result);

        //rs ao cubo
        double num_1cub = Math.pow(num1, 3);
        System.out.println("Esse e o seu numero ao cubo: " + num_1cub);

        //numb ao cb
        System.out.println("Agora digite um numero, e ele ficara ao cubo!");
        double num2 = sc.nextDouble();

        //result numb cb
        double resultCb = Math.pow(num2, 3);
        System.out.println("Resultado: " + resultCb);

        //result ao qd
        double resultqd2 = Math.pow(result, 2);
        System.out.println("este e o resultado do primeiro ao quadrado: " + resultqd2);
    }

}
