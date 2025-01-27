package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroNomeSobrenomePages {
	
	 private static WebDriver driver;
	 
	 public CadastroNomeSobrenomePages(WebDriver driver) {
		 
		 this.driver = driver;
	 }
	 
	 public void preencherCampoNome() {
		 WebElement campoNome = driver.findElement(By.name("firstName"));
		 campoNome.sendKeys("Gabriel");
		 
	 }
	 
	 public void preencherCampoSobrenome() {
		 WebElement campoSobrenome = driver.findElement(By.name("lastName"));
		 campoSobrenome.sendKeys("Dias");
	 }
	 
	 public void proximoNomeSobrenome() {
		 WebElement proximo = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		 proximo.click();
	 }
	 
	 
	 
	
	
}
