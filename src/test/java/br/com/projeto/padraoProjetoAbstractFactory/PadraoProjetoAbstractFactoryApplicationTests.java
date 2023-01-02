package br.com.projeto.padraoProjetoAbstractFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projeto.padraoProjetoAbstractFactory.construtora.Construcao;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraBasica;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraFabrica;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraPremium;

@SpringBootTest
class PadraoProjetoAbstractFactoryApplicationTests {

	// private Construcao construcao;
	
	@Test
	void criarConstrucaoBasica_quandoSucesso() {

		ConstrutoraFabrica construtoraFabrica = new ConstrutoraBasica();

		Construcao construcao = new Construcao(construtoraFabrica);

		String retorno = construcao.construir();

		assertEquals("Financiamento Estatal criado - Mão de Obra Carteira Assinada criada", retorno);

	}

	@Test
	void criarConstrucaoPremium_quandoSucesso() {

		ConstrutoraFabrica construtoraFabrica = new ConstrutoraPremium();

		Construcao construcao = new Construcao(construtoraFabrica);

		String retorno = construcao.construir();

		assertEquals("Financiamento Privado criado - Mão de Obra Empreitada criada", retorno);

	}

}
