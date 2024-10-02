public class Animal {
    protected String nome, raca;

    public Animal(){}

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }
    public void caminha(){
        System.out.println(this.nome + " esta caminhando agora!");
    }
}
