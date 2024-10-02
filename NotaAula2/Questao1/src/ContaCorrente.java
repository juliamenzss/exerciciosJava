public class ContaCorrente extends ContaBancaria{

    public void chequeEspecial(){
        if(valor <= 1000 + saldo){
            saldo -= valor;
            System.out.println("Cheque especial utilizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Limite de cheque especial excedido.");
        }
    }
}
