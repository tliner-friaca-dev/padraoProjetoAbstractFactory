package br.com.projeto.padraoProjetoAbstractFactory.financiamento;

public class FinanciamentoPrivado implements Financiamento {

    @Override
    public String criarFinanciamento() {

        return "Financiamento Privado criado - ";

    }
    
}
