public class Produto {
    private String nome, cor;
    private int codigo, qntEstoque, qntVendida;
    private double tamanho, peso, valor, valorTotal, valorEspecie, valorTroco, valorParcela;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public double getValorEspecie() {
        return valorEspecie;
    }

    public void setValorEspecie(double valorEspecie) {
        this.valorEspecie = valorEspecie;
    }

    public double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(double valorTroco) {
        this.valorTroco = valorTroco;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int codigo(){
        return codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQntVendida() {
        return qntVendida;
    }
    public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    public double getTamanho(){
        return tamanho;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }

    public void cadastrarProduto(){
        System.out.println("Informações do produto cadastrado:");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho em cm: " + tamanho + " gramas");
        System.out.println("Peso: " + peso + "cm");
        System.out.println("Valor: R$" + valor);
        System.out.println("Quantidade inserido: " + qntEstoque);
    }

    public void vendaProduto(){
        if(qntVendida <= this.getQntEstoque()) {
            valorTotal = qntVendida * this.getValor();
            System.out.printf("Valor total é de R$%.2f\n", valorTotal);

            System.out.println("Formas de pagamento:");
            System.out.println("1. Pix, tranferência ou débito - Ganhe 5% de desconto");
            System.out.println("2. Dinheiro em espécie - Ganhe 5% de desconto");
            System.out.println("3. Crédito parcelado em 3x sem juros");
        } else {
            System.out.println("Quantidade insuficiente no estoque!");
        }


    }
        public void atualizarEstoque() {
            this.qntEstoque -= this.qntVendida;
        }

        public void calcularTroco() {
            valorTroco = valorEspecie - (valorTotal *= 0.95);
            System.out.printf("Seu troco é de R$%.2f\n", valorTroco);
        }

        public void valorDaParcela() {
            valorParcela = valorTotal/3;
            System.out.printf("3 parcelas de R$%.2f cada.\n", valorParcela);
        }

}
