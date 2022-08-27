package ELEMENTOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodosDeTeste {

	WebDriver driver;

	public void IniciarTeste() {

		String navegador = "Chrome";
		String Url = "https://www.amazon.com.br";

		if (navegador.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drive/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else {

			System.out.println("Digite Chrome");
		}
		driver.get(Url);
		driver.manage().window().maximize();

	}

	public void clicarPorPosicao(int posicao) {

		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[" + posicao + "]")).click();

	}

	public void validarSeTemEstoque() {

		By msgEstoque = By.xpath("//span[text()='    Em estoque.   ']");

		// implementar o metodo de vizualizar
	}

	public void validarSeguro(String opcao) {

		By sim = By.xpath("//input[@aria-labelledby='attachSiAddCoverage-announce']");
		By nao = By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");

		if (opcao.equalsIgnoreCase("sim")) {

			driver.findElement(sim).click();

		}

		else if (opcao.equalsIgnoreCase("não")) {

			driver.findElement(nao).click();

		}

		else {

			System.out.println("Digite sim ou não");

		}
	} // fim do corpo validarSeguro

	public void validarSeContemTexto(String texto) {

		String textoCaptura = driver.findElement(By.xpath("///span[@class='" + texto + "']")).getText();

	}

	public void preencher(String text, By elementos) {

		driver.findElement(elementos).sendKeys(text);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}
	public void fechar() {
		driver.quit();
	}
}