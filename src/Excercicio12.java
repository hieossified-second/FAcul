import java.util.Scanner;

public class Excercicio12 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Entrada do número
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();

            // Cálculos
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);
            double potencia10 = Math.pow(numero, 10);

            // Saída dos resultados
            System.out.println("O número " + numero + " elevado ao quadrado é: " + quadrado);
            System.out.println("O número " + numero + " elevado ao cubo é: " + cubo);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
            System.out.println("O número " + numero + " elevado à potência 10 é: " + potencia10);

        }
    }

//opa
