package br.com.projeto.padraoProjetoAbstractFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.padraoProjetoAbstractFactory.construtora.Construcao;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraBasica;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraFabrica;
import br.com.projeto.padraoProjetoAbstractFactory.construtora.ConstrutoraPremium;

@SpringBootApplication
public class PadraoProjetoAbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoAbstractFactoryApplication.class, args);

		System.out.println("----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------");

/*
		ConstrutoraFabrica construtoraFabrica = new ConstrutoraBasica();

		Construcao construcao = new Construcao(construtoraFabrica);

		String retorno = construcao.construir();

		System.out.println(retorno);
*/




		ConstrutoraFabrica construtoraFabrica = new ConstrutoraPremium();

		Construcao construcao = new Construcao(construtoraFabrica);

		String retorno = construcao.construir();

		System.out.println(retorno);



	}

}
