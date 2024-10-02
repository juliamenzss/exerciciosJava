
public class Funcionario {
    protected String nome;
    protected int nasc, idade;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void informarSalario(){
        System.out.println("Seu sálario é: R$ " + salario);
    }

    public void calcularIdade(){
        idade = 2024 - nasc;
        System.out.println("A idade é " + idade);
    }
}
