import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();

        do{
            System.out.println("Quem você quer cadastrar? Digite 1 para Programador ou 2 para Gerente");
            int x = sc2.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Nome do programador: ");
                    p.setNome(sc.nextLine());
                    System.out.println("Ano de nascimento do programador: ");
                    p.setNasc(sc2.nextInt());
                    p.calcularIdade();
                    System.out.println("Qual seu sálario? ");
                    p.setSalario(sc2.nextDouble());
                    p.informarSalario();
                    System.out.println("Qual a linguagem utizada?");
                    p.setLinguagem(sc.nextLine());
                    p.informarLinguagem();
                    break;
                case 2:
                    System.out.println("Nome do Gerente: ");
                    g.setNome(sc.nextLine());
                    System.out.println("Ano de nascimento do gerente: ");
                    g.setNasc(sc2.nextInt());
                    g.calcularIdade();
                    System.out.println("Qual seu sálario? ");
                    g.setSalario(sc2.nextDouble());
                    g.informarSalario();
                    System.out.println("Qual o projeto?");
                    g.setProjeto(sc.nextLine());
                    g.informarProjeto();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println("Para ver novamente, digite 0");
            r=sc2.nextInt();
        } while (r==0);

    }
}