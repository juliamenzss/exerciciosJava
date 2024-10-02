public class Gato extends Animal{

    public Gato(String nome, String raca){
        super(nome, raca);
    }

    public Gato(String nome) {
    }

    public void mia(){
        System.out.println(this.nome + " mia quando chama seu nome!");
    }
}
