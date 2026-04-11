import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.TreeMap;

//codigo esta incompleto e possui muitos erros!!

public class Rpggolem {

    public static void espaco() {
        System.out.println("");
    }

    public static void limparTela(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void limparTela2(){
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        boolean interfacemenu = true;
        int player_life = 100;
        int max_player_life = 100;
        int golem_life =  300;
        int heal = 4;
        int heal_life = 20;
        int player_curado = player_life + heal_life;

        int player_attack_f = 17;
        int player_attack = generator.nextInt(35);
        int golem_attack = generator.nextInt(15);



        System.out.println("Sala 2");
        System.out.println("");

        System.out.println("Inimigo atual");
        System.out.println("GOLEM");
        System.out.println("");



        while(interfacemenu) {

            System.out.println("O que deseja fazer❓");
            System.out.println("1 - ⚔️ Inicar batalha❗ ⚔️");
            System.out.println("2 - 📑 Ver suas Estatisticas 📑");
            System.out.println("3 - 💨 Salvar e Sair 💨");

            if (sc.hasNextInt()) {
                int menu = sc.nextInt();

                switch (menu) {

                    case 1:
                        limparTela();
                        System.out.println("⚔️A Batalha comecou !⚔️");
                        interfacemenu = false;
                        continue;

                    case 2:
                        limparTela2();
                        System.out.println("📑 Estatisticas 📑");
                        System.out.println(player_life);
                        System.out.println(player_attack_f);
                        Thread.sleep(1000);
                        limparTela2();
                        break;

                    case 3:
                        System.out.println("💨 Ate a proxima aventureiro 💨");
                        return;

                    default:
                        if (menu >= 4){
                            System.out.println("❌ opcao invalida tente novamente ❌");
                            Thread.sleep(1000);
                            limparTela();
                            break;
                        }

                }
            }
            else {
                System.out.println("❌ opcao invalida, use somente numeros ❌");
                Thread.sleep(1000);
                limparTela();
                sc.next();
            }
        }

        boolean battle_begins = true;

        while (player_life != 0 && golem_life != 0) {


            System.out.println("O Golem se aproxima");
            Thread.sleep(100);
            espaco();

            System.out.println("O que voce faz?");
            espaco();

            System.out.println("1 - ⚔️ Ataca");
            System.out.println("2 - 🛡️ Defende");
            System.out.println("3 - ➕ Se cura");

            if (sc.hasNextInt()) {
                int menu2 = sc.nextInt();


                switch (menu2){
                    case 1:

                        System.out.println("Voce deu " + player_attack + " de DMG no Golem❗");
                        espaco();

                        int golem_life_after_dmg1 = golem_life - player_attack;

                        if (player_attack >= 27) {
                            System.out.println("🩸 DANO CRITICO 🩸");
                        }

                        System.out.println("Golem agora possui " + golem_life_after_dmg1 + " de HP ❗");
                        espaco();
                        Thread.sleep(2000);
                        espaco();
                        System.out.println("E a vez do Golem");
                        espaco();

                        System.out.println("O Golem se aproxima");
                        espaco();
                        Thread.sleep(2000);

                        int choose_golem = generator.nextInt(3);

                        if (choose_golem == 0) {
                            System.out.println("Ele ataca");
                            System.out.println("Voce levou " + golem_attack + " de DMG");
                            int player_l_a_dmg = player_life - golem_attack;


                            if (golem_attack >= 11) {
                                System.out.println("Ele te deu um DMG critico ❗");
                            }

                            System.out.println("Voce Agora possui " + player_l_a_dmg + " de HP");

                            player_life = player_l_a_dmg;
                            Thread.sleep(500);

                        } else if (choose_golem == 1) {
                            System.out.println("O golem defendeu e recuperou 1 hp");
                            int golem_healed = golem_life_after_dmg1 + 1;
                            Thread.sleep(2000);

                            System.out.println("Agora golem possui " + golem_healed + " de HP");
                            Thread.sleep(500);

                            golem_life = golem_healed;
                        }
                        else {
                            System.out.println("Golem se destraiu e a vez dele passou");
                        }
                        break;
                    case 3:
                        
                        if (player_life >= 100) {
                            System.out.println("Voce nao pode usar cura [vida maxima atingida]");
                            break;
                        } else if (player_life < 100) {
                            System.out.println("Voce escolheu se curar");

                            int heal_used = heal - 1 ;

                                if (menu2 == 2) {
                                    heal = heal_used;
                                    player_curado = player_life + heal_life;
                                }

                                System.out.println("Agora voce possui " + heal_used);


                                if (player_life == 100) {
                                    player_life = 100;
                                }

                                player_life = player_curado;

                                System.out.println("Voce possui " + player_curado + " de HP");
                        }




                    default:
                        if (menu2 >= 4) {
                            System.out.println("❌ Opcao invalida tente novamente ❌");
                            Thread.sleep(1000);
                            limparTela();
                            break;
                        }
                }

            }
            else {
                System.out.println("❌ Opcao invalida, use somente numeros ❌");
                Thread.sleep(1000);
                limparTela();
                sc.next();
            }
        }

    }
}
