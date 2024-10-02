public class Programador extends Funcionario {
        private String linguagem;

        public void setLinguagem(String linguagem){
            this.linguagem = linguagem;
        }
        public String getLinguagem(){
            return linguagem;
        }

        public void informarLinguagem(){
            System.out.println("O nome do linguagem é " + linguagem);
        }
    }
