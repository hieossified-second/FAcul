package com.banco.app;

import java.util.Scanner;
import com.banco.model.ContaBancaria;

public class oisolox {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ContaBancaria conta = new ContaBancaria();
            conta.saldo = 0.0;

            System.out.println("Digite o numero da sua conta");
            conta.numCont = sc.nextInt();
            System.out.println("Digite o seu Login");
            conta.titular = sc.next();
            System.out.println("Digite sua senha");
            String senha = sc.next();



            System.out.println("Ola bem vindo ao banco solo " + conta.titular +
                    "\nDigite 1 para depositar\n" +
                    "Digite 2 para sacar\n" +
                    "Digite 3 para ver o seu saldo\n" +
                    "Digite 4 para sair");

            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Digite o tanto que deseja depositar");
                    double deposito = sc.nextDouble();

                    System.out.println("Voce depositou: " + deposito);
                    System.out.println("Agora voce possui em sua conta: " + (conta.saldo + deposito));
                    break;

                case 2:
                    double saque = sc.nextDouble();

                    if (conta.saldo < saque) {
                        System.out.println("Saldo insuficiente para sacar");
                        break;
                    }
                    else {
                        System.out.println("Saque feito com sucesso\n" +
                                "Agora voce possui em sua conta: " + conta.saldo);
                        break;
                    }

                case 3:
                    System.out.println("Voce tem de saldo: " + conta.saldo);
                    break;

                case 4:
                    System.out.println("Voce digitou 4 para sair");
                    break;
            }
        }

    }