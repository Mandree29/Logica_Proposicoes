import java.util.Scanner;

public class controle1 {

    static String cmd = "";
    private static Scanner input = new Scanner(System.in);
    public TabelaVerdade tv = new TabelaVerdade(1);
    void iniciar_Estudo(){
        for (int i = 0; i < 10; i++){
            System.out.println("");
        }

        this.tv.tabela_verdade.get(0).mostrarTudo();

        while(!cmd.equals("sair")){
            System.out.print("comando>");
            cmd = input.nextLine();

            switch (cmd){
                case("voltar"):
                    Interface.run();
                    break;
                case("mostrar p proposição"):
                    this.tv.tabela_verdade.get(0).mostrar_Proposicao();
                    break;
                case("mostra p tabela_verdade"):
                case("criar ~p"):
                    tv.criarNaoP();
                    break;
                case("mostrar ~p"):
                    System.out.println("Mostrar nao p");
            }


        }
    }

}
