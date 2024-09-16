import java.util.Scanner;

public class proposicao_logica {

        String nome;
        String[] tabela_verdade;
        String proposicao;
        private Scanner input = new Scanner(System.in);

        proposicao_logica(String nome, int quantidade){

            if(nome.equals("p") && quantidade == 1)
            {
                this.nome = "p";
                this.tabela_verdade = new String[]{"V", "F"};
                System.out.print("Digite a proposicao: ");
                this.proposicao = input.nextLine();

            }
            else if (nome.equals("p") && quantidade ==  2)
            {
                this.nome = "p";
                this.tabela_verdade = new String[]{"V","V","F","F"};
                System.out.print("Digite a proposicao: ");
                this.proposicao = input.nextLine();
            }
            else if (nome.equals("p") && quantidade == 3)
            {
                this.nome = "p";
                this.tabela_verdade = new String[]{"V","V","V","V","F","F","F","F"};
                System.out.print("Digite a proposicao: ");
                this.proposicao = input.nextLine();
            }

        }

        proposicao_logica(String nome, String[] tabela_verdade, String proposicao){
            this.nome = nome;
            this.tabela_verdade = tabela_verdade;
            this.proposicao = proposicao;

        }

        public void mostrar_Proposicao(){
            System.out.println("p: " + this.proposicao);
        }

        public void mostrarTabelaVerdade(){
            System.out.println(this.nome);
            for(int i = 0; i < this.tabela_verdade.length; i++){
                System.out.println(this.tabela_verdade[i]);
            }
        }

        public void mostrarTudo(){
            mostrar_Proposicao();
            System.out.println("____________________________________");
            mostrarTabelaVerdade();
            System.out.println("____________________________________");
        }


}
