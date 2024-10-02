import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Gato g = new Gato("Chicão", "Siames");
        Cachorro c = new Cachorro("Alfredo", "Golden");
        do {
            System.out.println("Quem você quer chamar? Digite 1 para cachorro, ou 2 para gato");
            int x = sc1.nextInt();
            switch (x){
                case 1:
                    System.out.println("Você chamou o cachorro!");
                    System.out.println("O cachorro recebeu o nome de " + c.getNome() + " de sua tutora, e sua raça é " + c.getRaca());
                    c.caminha();
                    c.late();
                    break;
                case 2:
                    System.out.println("Você chamou o gato!");
                    System.out.println("O gato recebeu o nome de " + g.getNome() + " de sua tutora, e sua raça é " + g.getRaca());
                    g.caminha();
                    g.mia();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Para ver novamente, digite 0");;
            r=sc1.nextInt();
        } while (r==0);

    }
}