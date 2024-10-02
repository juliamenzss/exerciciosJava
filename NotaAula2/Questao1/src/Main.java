import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        do {
            System.out.println("Olá, seja bem vindo! Qual seu tipo de conta?");
            System.out.println("Escolha 1 para Conta Corrente ou 2 para Conta Poupança");
            int x = sc1.nextInt();
            switch (x){
                case 1:
                    System.out.println("Qual o seu nome?");
                    cb.setTitular(sc.nextLine());
                    System.out.printf("Olá, %s. Você escolheu Conta Corrente.\n", cb.titular);

                    int escolha = 0;
                    while(escolha != 5){
                        System.out.println("O que deseja fazer? 1-Depositar, 2-Sacar, 3-Usar cheque Especial, 4-Exibir dados da conta, 5-Sair");
                        escolha = sc1.nextInt();

                        switch (escolha) {
                            case 1:
                                System.out.println("Qual valor quer depositar?");
                                cc.setValor(sc1.nextDouble());
                                cc.depositar();
                                break;
                            case 2:
                                System.out.println("Qual valor quer sacar?");
                                cc.setValor(sc1.nextDouble());
                                cc.sacar();
                                break;
                            case 3:
                                System.out.println("Qual valor quer utilizar do cheque especial?");
                                cc.setValor(sc1.nextDouble());
                                cc.chequeEspecial();
                                break;
                            case 4:
                                System.out.println("Dados da conta:");
                                System.out.println("Titular: " + cb.titular);
                                System.out.println("Saldo: " + cc.saldo);
                                break;
                            case 5:
                                System.out.println("Saindo do menu de Conta Corrente");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Qual o seu nome?");
                    cb.setTitular(sc.nextLine());
                    System.out.printf("Olá, %s. Você escolheu Conta Poupança.\n", cb.titular);

                    int escolha2 = 0;
                    while(escolha2 != 5){
                        System.out.println("O que deseja fazer? 1-Depositar, 2-Sacar, 3-Calcular rendimento, 4-Exibir dados da conta, 5-Sair");
                        escolha2 = sc1.nextInt();

                        switch (escolha2) {
                            case 1:
                                System.out.println("Qual valor quer depositar?");
                                cp.setValor(sc1.nextDouble());
                                cp.depositar();
                                break;
                            case 2:
                                System.out.println("Qual valor quer sacar?");
                                cp.setValor(sc1.nextDouble());
                                cp.sacar();
                                break;
                            case 3:
                                System.out.println("Qual valor da taxa selic?");
                                cp.setSelic(sc1.nextDouble());
                                cp.calcularRendimento();
                                break;
                            case 4:
                                System.out.println("Dados da conta:");
                                System.out.println("Titular: " + cb.titular);
                                System.out.println("Saldo: " + cp.saldo);
                                break;
                            case 5:
                                System.out.println("Saindo do menu de Conta Poupança");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para ver novamente, digite 0");
            r=sc1.nextInt();
        } while (r==0);
    }
}