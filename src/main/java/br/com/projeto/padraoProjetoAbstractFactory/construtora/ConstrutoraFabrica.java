package br.com.projeto.padraoProjetoAbstractFactory.construtora;

import br.com.projeto.padraoProjetoAbstractFactory.financiamento.Financiamento;
import br.com.projeto.padraoProjetoAbstractFactory.maoDeObra.MaoDeObra;

public interface ConstrutoraFabrica {

    public Financiamento criarFinanciamento();
    public MaoDeObra criarMaoDeObra();
    
}
