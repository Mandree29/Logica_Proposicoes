import java.util.ArrayList;
import java.util.HashMap;

public class TabelaVerdade {

    ArrayList<proposicao_logica> tabela_verdade = new ArrayList<>();
    int quantidade_proposicao;
    proposicao_logica p;
    proposicao_logica q;
    proposicao_logica r;

    TabelaVerdade(int quantidade_proposicao) {
        this.quantidade_proposicao = quantidade_proposicao;
        if (this.quantidade_proposicao == 1) {
            this.p = new proposicao_logica("p", this.quantidade_proposicao);
            tabela_verdade.add(this.p);
        }
    }

    public void criarNaoP() {
        if (this.quantidade_proposicao == 1) {
            String[] tabela_verdade = new String[]{"F", "V"};
            String proposicao = negacao_da_proposicao(this.p.proposicao);
            proposicao_logica naop = new proposicao_logica("~p", tabela_verdade, proposicao);
            this.tabela_verdade.add(naop);
        }
    }

    public String negacao_da_proposicao(String proposicao) {
        return "Nao é verdade que {" + proposicao + "}";
    }

    public void mostrarTabelaVerdade() {

        for (int i = 0; i < this.tabela_verdade.size(); i++) {
            System.out.print(this.tabela_verdade.get(i).nome + " ");
        }
        System.out.println("");

        for (int i = 0; i < this.tabela_verdade.size(); i++) {
            int x = 0;
            while (x < this.tabela_verdade.size()) {
                System.out.print(this.tabela_verdade.get(i).tabela_verdade[x] + " ");
                x++;
            }

            System.out.println("");
        }

    }

    public void SelecionarPorNome(String nome) {
        for (int i = 0; i < this.tabela_verdade.size(); i++) {
            if (this.tabela_verdade.get(i).nome.equals(nome)) {
                this.tabela_verdade.get(i).mostrarTudo();
            }
        }
    }


}




