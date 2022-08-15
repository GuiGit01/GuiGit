package metodos;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;

public class MetodosDeTeste extends DriversFactory {

	public void clicar(By elementos) {

		driver.findElement(elementos).click();

	}

	public void escrever(By elementos, String text) {

		driver.findElement(elementos).sendKeys(text);

	}

	public void validarTexto(By elementos, String textoEsperado) {

		String textoCapiturado = driver.findElement(elementos).getText();
		assertTrue(textoCapiturado.contains(textoEsperado));

	}

	public void pausaTempo(int tempo) {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void esperarTempo(By elemento) {

	WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(elemento));
	}
}
