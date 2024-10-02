import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int r;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Produto p = new Produto();
    do{
        System.out.println("Caso escolha: 1-Cadastrar produto, 2-Realizar venda, 3-Sair");
        int x = sc1.nextInt();
        switch (x) {
            case 1:
                cadastrarProduto(sc, sc1, p);
                break;
            case 2:
                realizarVenda(sc,sc1, p);
                break;
            case 3:
                System.out.println("Encerrando o programa");
                return;
            default:
                System.out.println("Opção Inválida");
        }
        System.out.println("Para voltar ao inicio digite 0");
        r=sc1.nextInt();
        } while (r==0);
    }

    private static void cadastrarProduto(Scanner sc, Scanner sc1, Produto p){
        System.out.println("Nome do produto: ");
        p.setNome(sc.nextLine());
        System.out.println("Qual a cor? ");
        p.setCor(sc.nextLine());
        System.out.println("Qual o código do produto? ");
        p.setCodigo(sc1.nextInt());
        System.out.println("Qual o tamanho do produto em centimetros? ");
        p.setTamanho(sc1.nextDouble());
        System.out.println("Qual o peso do produto em gramas? ");
        p.setPeso(sc1.nextDouble());
        System.out.println("Qual o valor do produto?");
        p.setValor(sc1.nextDouble());
        System.out.println("Qual a quantidade adicionada?");
        p.setQntEstoque(sc1.nextInt());
        p.cadastrarProduto();
    }

    private static void realizarVenda(Scanner sc, Scanner sc1, Produto p){
        System.out.println("Código do produto:");
        int codigo = sc.nextInt();
        if (codigo != p.getCodigo()) {
            System.out.println("Produto não encontrado.");
            return;
    }
        System.out.println("Quantidade a ser vendida:");
        p.setQntVendida(sc1.nextInt());
        p.vendaProduto();

        if(p.getQntVendida() <= p.getQntEstoque()){
            System.out.println("Escolha a forma de pagamento 1, 2 ou 3:");
            int i = sc1.nextInt();

            double valorFinal = p.getValorTotal();
            switch (i){
                case 1:
                    valorFinal *= 0.95;
                    System.out.printf("Valor final com o desconto: R$%.2f\n", valorFinal);
                    break;
                case 2:
                    System.out.println("Digite o valor dado em espécie:");
                    p.setValorEspecie(sc1.nextDouble());
                    valorFinal *= 0.95;
                    System.out.printf("Valor final com o desconto: R$%.2f\n", valorFinal);
                    p.calcularTroco();
                    break;
                case 3:
                    System.out.println("Valor total " + valorFinal);
                    p.valorDaParcela();
                    break;
                default:
                    System.out.println("Forma de pagamento inválida.");
                    return;
            }
            System.out.println("Venda realizada com sucesso!");
            p.atualizarEstoque();
            System.out.printf("Novo estoque: %d\n", p.getQntEstoque());
        }
}


}