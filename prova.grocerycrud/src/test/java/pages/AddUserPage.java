package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.MetodosDeTeste;

public class AddUserPage {

	MetodosDeTeste metodos = new MetodosDeTeste();
	Elementos elementos = new Elementos();
	
	private By contactName = By.xpath("//input[@id='field-contactFirstName']");
	private By NAME = By.xpath("//input[@id='field-customerName']");
	private By LastNam = By.xpath("//input[@id='field-contactLastName']");


	public void selectVersion(String versao) {

		metodos.escrever(elementos.version, versao);
	}

	public void cadastrar(String ContactFirstName, String Name, String LastName) {

		metodos.clicar(elementos.addCustomer);
		metodos.escrever(contactName, ContactFirstName);
		metodos.escrever(NAME, Name);
		metodos.escrever(LastNam, LastName);
	}
	
}
