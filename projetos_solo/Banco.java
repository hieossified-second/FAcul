package projetos_solo;

import java.util.Scanner;
import java.util.Random;

public class Banco {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();


    public static void main(String[] args){
        Usuario();
        senhaUsuario();

    }

    public static String Usuario() {
        String usuario_name = sc.nextLine();

        return usuario_name;
    }

    public static int senhaUsuario() {
        int s_u = sc.nextInt();

        return s_u;
    }
        
    
    static String usuario_name = Usuario();
    static int senha = senhaUsuario();


    public static void Menu(){
        System.out.println("Seja bem vindo" + usuario_name);

        boolean u_entrou = true;

        while (u_entrou)
            System.out.println("Digite sua senha");
            int senha_digitada = sc.nextInt();

            if (senha_digitada != senha){
                System.out.println("Senha incorreta tente novamente");
                return;
            }

    }   

}
