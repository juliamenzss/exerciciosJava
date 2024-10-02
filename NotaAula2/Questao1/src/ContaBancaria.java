public class ContaBancaria {
    protected String titular;
    protected double saldo = 0, valor;

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }

    public void depositar(){
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: " + saldo);
    }
    public void sacar(){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atualizado: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
