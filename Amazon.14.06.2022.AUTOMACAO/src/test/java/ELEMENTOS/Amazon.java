package ELEMENTOS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Amazon {

	MetodosDeTeste Metodos = new MetodosDeTeste();
	ElementosWeb Elementos = new ElementosWeb();

	@Before
	public void setUp() throws Exception {

		Metodos.IniciarTeste();

	}

	@After
	public void tearDown() throws Exception {

		Metodos.fechar();
	}

	@Test
	public void validarProdutoCarrinho() {
		Metodos.preencher("Iphone", Elementos.getPesquisar());
		Metodos.clicar(Elementos.getLupa());
		Metodos.clicarPorPosicao(3);
		Metodos.clicar(Elementos.getAddCarinho());
	
	}
	}