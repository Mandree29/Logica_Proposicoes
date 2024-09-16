import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//  Interface.run();

        TabelaVerdade tv = new TabelaVerdade(1);
        tv.criarNaoP();
        tv.mostrarTabelaVerdade();
        tv.tabela_verdade.get(0).mostrar_Proposicao();
        tv.tabela_verdade.get(1).mostrar_Proposicao();
        tv.SelecionarPorNome("p");
        tv.SelecionarPorNome("~p");













    }
}