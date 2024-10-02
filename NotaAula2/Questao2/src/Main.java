import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Digite a distancia percorrida em KM: ");
        c.setDistancia(scanner.nextDouble());

        System.out.println("Digite o tempo de espera em minutos: ");
        c.setTempoEspera(scanner.nextInt());

        System.out.println("Digite a tarifa base (R$): ");
        c.setTarifaBase(scanner.nextDouble());

        System.out.println("A corrida esta em horario de pico? (sim/não)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")){
            c.setFatorDemanda(1.5);
        } else{
            c.setFatorDemanda(1.0);
        }

        c.exibirDetalhesCorrida();

        scanner.close();

    }
}