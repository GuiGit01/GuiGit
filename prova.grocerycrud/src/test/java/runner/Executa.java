package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@test", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)

public class Executa extends DriversFactory {

	@BeforeClass
	public static void abrirNavegador() {
		String navegador = "Chrome";
		String url = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";

		if (navegador.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
}