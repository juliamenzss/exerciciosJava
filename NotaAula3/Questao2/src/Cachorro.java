public class Cachorro extends Animal{

    public Cachorro(String nome, String raca){
        super(nome, raca);
    }

    public void late(){
        System.out.println(this.nome + " esta latindo!");
    }
}
