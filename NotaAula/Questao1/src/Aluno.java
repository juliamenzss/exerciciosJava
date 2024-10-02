public class Aluno {
    private double nota1, nota2, nota3, media;
    private String nome;

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2(){
        return nota2;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    public double getNota3() {
        return nota3;
    }
    public void setMedia(double media){
        this.media = media;
    }
    public double getMedia(){
        return media;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return  nome;
    }

    public void calcularMedia(){
        media = (nota1+nota2+nota3) /3;
    }

    public void verificarAprovacao(){
        if (media >= 70){
            System.out.println("Aluno aprovado!");
        } else if(media < 40){
            System.out.println("Aluno reprovado!");
        } else{
            System.out.println("Aluno na final!");
        }
    }

    public void detalhesAluno(){
        System.out.printf("Aluno %s tem media de %.2f. \n", this.nome, this.media);
        verificarAprovacao();
    }
}
