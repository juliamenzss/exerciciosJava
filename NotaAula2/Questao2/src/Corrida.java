public class Corrida {
    private double distancia, tarifaBase, fatorDemanda, valorFinal;
    private int tempoEspera;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getDistancia() {
        return distancia;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void calcularValorCorrida() {
        valorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase  * fatorDemanda);
    }

    public void exibirDetalhesCorrida() {
        calcularValorCorrida();
        System.out.printf("O valor da corrida foi de: %.2f. \n", valorFinal);
        System.out.printf("A distancia foi de %.2fKM, o tempo de espera foi de %dmin, a tarifa base foi de R$%.2f e o fator de demanda foi R$%.2f.", distancia, tempoEspera, tarifaBase, fatorDemanda);
    }
}
