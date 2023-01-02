package br.com.projeto.padraoProjetoAbstractFactory.construtora;

import br.com.projeto.padraoProjetoAbstractFactory.financiamento.Financiamento;
import br.com.projeto.padraoProjetoAbstractFactory.financiamento.FinanciamentoEstatal;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObra;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObraCarteiraAssinada;

public class ConstrutoraBasica implements ConstrutoraFabrica {

    @Override
    public Financiamento criarFinanciamento() {
        return new FinanciamentoEstatal();
    }

    @Override
    public MaoDeObra criarMaoDeObra() {
        return new MaoDeObraCarteiraAssinada();
    }
    
}
