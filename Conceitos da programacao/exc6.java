import java.util.Scanner;

public class exc6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Cardápio =====");
    System.out.println("100 Cachorro Quente R$ 1,20");
    System.out.println("101 Bauru R$ 1,30");
    System.out.println("102 Bauru com ovo R$ 1,50");
    System.out.println("103 Hambúrguer R$ 1,20");
    System.out.println("184 Cheeseburguer R$ 1,30");
    System.out.println("105 Refrigerante R$ 1,00");
    System.out.println("Digite o código do produto");

    int codigo = sc.nextInt();

    System.out.println("Digite a quantidade");

    int quantidade = sc.nextInt();

    double precounidade = 0;

    String nomeProduto = "";

    switch (codigo){

        case 100:

            nomeProduto = "Cachorro Quente";
            precounidade = 1.20;
            break;

        case 101:

            nomeProduto = "Bauru";
            precounidade = 1.30;
            break;

        case 102:

            nomeProduto = "Bauru com ovo";
            precounidade = 1.50;
            break;

        case 183:

            nomeProduto = "Hambúrguer";
            precounidade = 1.203;
            precounidade = 1.20;



            break;

        28

        29

        case 101:
            nomeProduto "Bauru";
            precounidade 1.30;
            break;

        case 102:
            nomeProduto "Bauru com ovo";
            precounidade 1.50;
            break;

        case 103:
            nomeProduto = "Hambúrguer";
            precounidade 1.20;
            break;

        case 104:
            nomeProduto = "Cheeseburguer";
            precounidade 1.30;
            break;

        case 105:
            nome Produto "Refrigerante";
            precounidade = 1.00;
            break;

        default:
            System.out.println("Código Inválido");

    }

        return;

    double valortotal = precounidade * quantidade;

    System.out.println("*** Informações da compra -");

    System.out.println("Produto: + nomeProduto);

        System.out.printf("Valor a ser pago é de: R$ %.2f", valortotal);

        sc.close();
    }
}