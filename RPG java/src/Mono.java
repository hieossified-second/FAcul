
import java.util.ArrayList;
import java.util.List;

public class Mono {
    public static void main(String[] args) {
        int[] player = new int[] {100, 20, 5, 3};
        String[] nomesPlayer = new String[] {"GUERREIRO", "ASSASSINO", "TANK"};

        int[] inimigo = new int[] {30, 15, 5};
        String[] nomesInimigos = new String[] {"ESQUELETO", "GOBLIN", "DEMONIO"};     

        List<String> nomes = new ArrayList<>();
        nomes.add("Legal");

        System.out.println(nomes);
    }

    public  static class Caixa<T> {
        private T conteudo;
    
        public void guardar(T conteudo) {
            this.conteudo = conteudo;
        }
    
        public T pegar() {
            return conteudo;
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Caixa de String
            Caixa<String> caixaDeTexto = new Caixa<>();
            caixaDeTexto.guardar("Olá, Generics!");

            List<Caixa> caixas = new ArrayList<>();

            caixas.add(caixaDeTexto);

       



            System.out.println(caixaDeTexto.pegar());
    
            // Caixa de Integer
            Caixa<Integer> caixaDeNumero = new Caixa<>();
            caixaDeNumero.guardar(100);
            System.out.println(caixaDeNumero.pegar());
        }
    }




}