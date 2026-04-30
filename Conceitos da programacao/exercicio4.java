import java.util.Scanner;

public class exercicio4 {
    public static boolean isPar(int n1){
        if (n1 % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       

        while(true){
            System.out.println("Digite um numero para o codigo dizer se é par ou impar");
            int par_dig = sc.nextInt(); 
            boolean num_par = isPar(par_dig);

            if (num_par == true){
                System.out.println("É par " + num_par);
                }
            else{
                System.out.println("É impar " + num_par);
                }
                    
           }

        

    }
}