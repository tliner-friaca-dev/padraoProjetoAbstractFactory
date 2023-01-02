package br.com.projeto.padraoProjetoAbstractFactory.construtora;

import br.com.projeto.padraoProjetoAbstractFactory.financiamento.Financiamento;
import br.com.projeto.padraoProjetoAbstractFactory.financiamento.FinanciamentoPrivado;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObra;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObraEmpreitada;

public class ConstrutoraPremium implements ConstrutoraFabrica {

    @Override
    public Financiamento criarFinanciamento() {
        return new FinanciamentoPrivado();
    }

    @Override
    public MaoDeObra criarMaoDeObra() {
        return new MaoDeObraEmpreitada();
    }
    
}
