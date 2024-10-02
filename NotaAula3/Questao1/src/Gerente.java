public class Gerente extends Funcionario{
    private String projeto;

    public void setProjeto(String projeto){
        this.projeto = projeto;
    }
    public String getProjeto(){
        return projeto;
    }

    public void informarProjeto(){
        System.out.println("O nome do projeto é " + projeto);
    }
}
