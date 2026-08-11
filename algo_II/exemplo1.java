package algo_II;

import java.util.Random;

public class exemplo1 {

    public static void main(String[] args) {
        int[] v2 = new int[10];
        int[] v3 = new int[10];

        aleatorio(v3);
        ordenar(v3);
        mostrar(v3);
        
               
    }
    
    public static void aleatorio(int[] a){
        Random rd = new Random(); // instanciar a classe random

        for(int i=0; i < a.length; i++){
            a[i] = rd.nextInt(10);
        }
    }

    public static void mostrar(int[] b){
        for(int valor:b){
            System.out.println(valor);
        }
    }

    public static void ordenar (int[] c){
        int temp;
        for(int j = 0; j < c.length - 1; j++){
            for(int i = 0; i < c.length - 1 - j; i++){
                if(c[i]>c[i+1]){
                    temp = c[i];
                    c[i]= c[i+1];
                    c[i+1]= temp;
                }
            }
            
        }  
    }
}   
