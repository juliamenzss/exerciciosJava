public class ContaPoupanca extends ContaBancaria{
    private double rendimento, selic;

    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }
    public double getRendimento(){
        return rendimento;
    }

    public void setSelic(double selic){
        this.selic = selic;
    }
    public double getSelic(){
        return selic;
    }

    public void calcularRendimento(){
        if(selic>8.5){
            rendimento = 0.005 * saldo;
            System.out.println("Seu rendimento é de 0.5% por mês, valor do rendimento: R$" + rendimento);
        } else{
            rendimento = 0.007 * selic * saldo;
            System.out.println("Seu rendimento é de 70% da selic, valor do rendimento: R$" + rendimento);

        }
    }
}
