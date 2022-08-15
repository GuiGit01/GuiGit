package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTeste;
import pages.AddUserPage;

public class AddUserTeste {

	AddUserPage page = new AddUserPage();
	Elementos el = new Elementos();
	MetodosDeTeste metodo = new MetodosDeTeste();

	@Dado("que selecione bootstrap v4")
	public void queSelecioneBootstrapV4() {

		page.selectVersion("Bootstrap V4 Theme");

	}

	@Dado("preencho o formulario")
	public void preenchoOFormulario() {

		page.cadastrar("test03","test01","test02");
		
		
	}

	@Quando("clico em salvar")
	public void clicoEmSalvar() {

		metodo.clicar(el.botaoSalvar);
	}

	@Entao("o sistema valida a mensagem")
	public void oSistemaValidaAMensagem() {

	}

}
