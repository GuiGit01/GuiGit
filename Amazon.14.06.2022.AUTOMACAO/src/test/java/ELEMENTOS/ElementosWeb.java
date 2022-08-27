package ELEMENTOS;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']"); // e incapsulado (private) para nao alterar outras classes, o by e uma classe do selenium
	                                                                        //  para guardar um elemento 
	
	private By lupa = By.xpath("//input[@id='nav-search-submit-button']");

	private By addCarinho = By.xpath("//input[@id='add-to-cart-button']");


	
	//embaixo e o metodo retorno
	
	public By getPesquisar() {
		return pesquisar;
	}

	public By getLupa() {
		return lupa;
	}

	public By getAddCarinho() {
		return addCarinho;
	}

}