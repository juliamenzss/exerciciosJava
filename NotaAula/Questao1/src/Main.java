import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.println("Qual o nome do aluno?");
        a.setNome(sc.nextLine());
        System.out.println("Qual a primeira nota?");
        a.setNota1(sc1.nextInt());
        System.out.println("Qual a segunda nota?");
        a.setNota2(sc1.nextInt());
        System.out.println("Qual a terceira nota?");
        a.setNota3(sc1.nextInt());
        a.calcularMedia();
        System.out.println("Os detalhes do aluno são:\n");
        a.detalhesAluno();
    }
}
