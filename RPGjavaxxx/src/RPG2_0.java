import java.util.Random;
import java.util.Scanner;


public class RPG2_0 {
    public static int[] player(){
        Random rd = new Random();

        int player_vida = 100;
        int player_ataque = rd.nextInt();

        return new int[]{player_vida, player_ataque};
    }

    public static void esperar() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static int menu1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua classe");
        espaco();

        System.out.println("1 - Guerreiro");
        System.out.println("2 - Tanque");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Assasino");

        int escolha2 = sc.nextInt();

        return escolha2;

    }

    public static int[] inimigo(){
        Random rd = new Random();

        int inimigo_vida = 50;
        int inimigo_ataque = rd.nextInt(10);

        return new int[]{inimigo_vida, inimigo_ataque};
    }

    public static void espaco(){
        System.out.println("  ");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int cura = 4;

        int classe_escolhida = menu1(args);


        int[] valores_player = player();
        int[] valores_inimigo = inimigo();

        int player_vida = valores_player[0];
        int player_ataque = valores_player[1];

        int inimigo_vida = valores_inimigo[0];
        int inimigo_ataque = valores_inimigo[1];

        boolean escolhida = true;

        while (escolhida) {
            if (classe_escolhida == 1) {
                esperar();
                System.out.println("Voce escolheu Guerreiro");

                player_vida = 100;
                player_ataque = rd.nextInt(25);
                espaco();
                esperar();
                escolhida = false;
            }
            if (classe_escolhida == 2) {
                esperar();
                System.out.println("Voce escolheu Tanque");

                player_vida = 200;
                player_ataque = rd.nextInt(15);
                espaco();
                esperar();
                escolhida = false;
            }
            if (classe_escolhida == 3) {
                esperar();
                System.out.println("Voce escolheu Arqueiro");

                player_vida = 150;
                player_ataque = rd.nextInt(25);
                espaco();
                esperar();
                escolhida = false;
            }
            if (classe_escolhida == 4) {
                esperar();
                System.out.println("Voce escolheu Assasino");

                player_vida = 60;
                player_ataque = rd.nextInt(50);
                espaco();
                esperar();
                escolhida = false;
            }
            if (classe_escolhida >= 5) {
                esperar();
                System.out.println("Escolha apenas uma das opções disponiveis");
                espaco();
                espaco();
                esperar();
                menu1(args);

            }
        }
        System.out.println("A batalha comecou");
        Thread.sleep(1000);


        while (player_vida > 0 && inimigo_vida > 0) {
            System.out.println("O que voce faz?");
            espaco();

            System.out.println("1 - ataca");
            System.out.println("2 - se cura");
            System.out.println("3 - defende");
            System.out.println("4 - Seus Status");
            esperar();

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Voce resolve atacar");
                    esperar();
                    ////////////////////////////////////////////////////////////
                    // player

                    if (inimigo_vida > 0) {
                        int novo_ataque = rd.nextInt(20);
                        player_ataque = novo_ataque;


                    } else {
                        break;
                    }

                    ///////////////////////////////////////////////////////////
                    // Batalha

                    if (player_ataque >= 15) {
                        System.out.println("Dano critico");
                    }

                    System.out.println("Voce deu: " + player_ataque + " de DMG");
                    espaco();
                    esperar();

                    if (inimigo_vida >= 0) {
                        System.out.println("Agora e a vez do inimigo");
                        espaco();
                        esperar();

                        ////////////////////////////////////////////////////////////
                        // inimigo

                        int vida_nova_i = inimigo_vida - player_ataque;
                        inimigo_vida = vida_nova_i;

                        int novo_ataque_i = rd.nextInt(20);
                        inimigo_ataque = novo_ataque_i;

                        if (inimigo_vida < 0) {
                            inimigo_vida = 0;
                        }

                        if (inimigo_vida > 0) {
                            int vida_nova_p = player_vida - inimigo_ataque;
                            player_vida = vida_nova_p;
                        }
                        ///////////////////////////////////////////////////////////

                        System.out.println("Inimigo usou ataque basico");
                        System.out.println("Inimigo lhe deu: " + inimigo_ataque);
                        espaco();
                        esperar();

                        if (inimigo_ataque > 15) {
                            System.out.println("Voce levou dano critico");
                            System.out.println("Voce perdeu: " + inimigo_ataque + " de Vida");
                            espaco();
                            esperar();
                        } else {
                            System.out.println("Voce perdeu: " + inimigo_ataque + " de Vida");
                            esperar();
                        }
                    }
                    espaco();
                    System.out.println("Sua vida atual: " + player_vida);
                    System.out.println("Vida do inimigo: " + inimigo_vida);
                    espaco();
                    esperar();

                    if (player_vida < 0) {
                        player_vida = 0;
                    }

                    break;
                    case 2:
                        if (cura <= 0) {
                            System.out.println("Voce nao tem pocao de cura sobrando");
                            break;
                        } else {
                            if (classe_escolhida == 1)
                                if (player_vida >= 100) {
                                    System.out.println("Voce nao pode ser curar, maximo de vida alcancada");
                                    break;
                                } else {
                                    System.out.println("Voce decidiu se curar");

                                    int cura_usada = cura - 1;
                                    cura = cura_usada;

                                    int vida_nova_p = player_vida + 20;
                                    player_vida = vida_nova_p;

                                    if (vida_nova_p > 100) {
                                        player_vida = 100;
                                    }


                                    System.out.println("Voce tem " + player_vida + " de vida");
                                    System.out.println("Voce possui: " + cura + " sobrando");
                                    break;
                                }
                        }

                        if (classe_escolhida == 2) {
                            if (player_vida >= 150) {
                                System.out.println("Voce nao pode ser curar, maximo de vida alcancada");
                                break;
                            }
                            else {
                                System.out.println("Voce decidiu se curar");

                                int cura_usada = cura - 1;
                                cura = cura_usada;

                                int vida_nova_p = player_vida + 20;
                                player_vida = vida_nova_p;

                                if (vida_nova_p > 200) {
                                    player_vida = 200;
                                }


                                System.out.println("Voce tem " + player_vida + " de vida");
                                System.out.println("Voce possui: " + cura + " sobrando");
                                break;}
                            }
                        if (classe_escolhida == 3) {
                            if (player_vida >= 150) {
                                System.out.println("Voce nao pode ser curar, maximo de vida alcancada");
                                break;
                            } else {
                                System.out.println("Voce decidiu se curar");

                                int cura_usada = cura - 1;
                                cura = cura_usada;

                                int vida_nova_p = player_vida + 20;
                                player_vida = vida_nova_p;

                                if (vida_nova_p > 150) {
                                    player_vida = 150;
                                }


                                System.out.println("Voce tem " + player_vida + " de vida");
                                System.out.println("Voce possui: " + cura + " sobrando");
                                break;
                            }
                        }
                        if (classe_escolhida == 4) {
                            if (player_vida >= 60) {
                                System.out.println("Voce nao pode ser curar, maximo de vida alcancada");
                                break;
                            } else {
                                System.out.println("Voce decidiu se curar");

                                int cura_usada = cura - 1;
                                cura = cura_usada;

                                int vida_nova_p = player_vida + 20;
                                player_vida = vida_nova_p;

                                if (vida_nova_p > 60) {
                                    player_vida = 60;
                                }


                                System.out.println("Voce tem " + player_vida + " de vida");
                                System.out.println("Voce possui: " + cura + " sobrando");
                                break;
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Voce escolheu se defender");
                        espaco();
                        esperar();
                        System.out.println("O inimigo atacou");
                        System.out.println("Inimigo lhe deu: " + inimigo_ataque);

                        int metade_dano = inimigo_ataque / 2;
                        int vida_nova_p = player_vida - metade_dano;
                        player_vida = vida_nova_p;

                        System.out.println("Agora voce possui: " + player_vida);
                    case 4:
                        if (classe_escolhida == 1) {
                            System.out.println("Ataque: 0 - 25");
                        } else if (classe_escolhida == 2) {
                            System.out.println("Ataque: 0 - 15");
                        } else if (classe_escolhida == 3) {
                            System.out.println("Ataque: 0 - 25");
                        }
                        if (classe_escolhida == 4) {
                            System.out.println("Ataque: 0 - 50");
                        }
                        System.out.println("Vida: " + player_vida);
                        System.out.println("Curas restantes: " + cura);

                        break;

                    default:
                        if (menu > 3) {
                            System.out.println("Apenas digite uma das opções disponiveis");
                        }
                        break;
                    }
        }
        if (player_vida <= 0){
            System.out.println("Voce perdeu");
            System.out.println("Nao desista, tente denovo");
        }
        if (inimigo_vida <= 0){
            if (classe_escolhida == 1){
                System.out.println("Voce venceu, parabens nobre guerreiro");
            }
            if (classe_escolhida == 2){
                System.out.println("Voce venceu, parabens corajoso tanque");
            }
            if (classe_escolhida == 3){
                System.out.println("Voce venceu, parabens destemido arqueiro");
            }
            if (classe_escolhida == 4){
                System.out.println("Voce venceu, parabens misterioso assasino");
            }
        }


        sc.close();
    }

}
