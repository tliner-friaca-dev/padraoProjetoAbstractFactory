package br.com.projeto.padraoProjetoAbstractFactory.financiamento;

public class FinanciamentoEstatal implements Financiamento {

    @Override
    public String criarFinanciamento() {

        return "Financiamento Estatal criado - ";

    }
    
}
