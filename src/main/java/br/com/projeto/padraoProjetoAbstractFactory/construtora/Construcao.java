package br.com.projeto.padraoProjetoAbstractFactory.construtora;

import br.com.projeto.padraoProjetoAbstractFactory.financiamento.Financiamento;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObra;

public class Construcao {

    private Financiamento financiamento;
    private MaoDeObra maoDeObra;

    public Construcao(ConstrutoraFabrica construtoraFabrica) {
        this.financiamento = construtoraFabrica.criarFinanciamento();
        this.maoDeObra = construtoraFabrica.criarMaoDeObra();
    }

    public String construir() {

        String retorno;

        retorno = this.financiamento.criarFinanciamento();
        retorno += this.maoDeObra.criarMaoDeObra();

        return retorno;
    }
    
}
