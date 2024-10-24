package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroSenha {
	
	static WebDriver driver;

	public CadastroSenha(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherSenha() {
		 WebElement senha = driver.findElement(By.name("Passwd"));
		 senha.sendKeys("Senha@123_@");
	 }
	
	public void preencherReptirSenha() {
		 WebElement senha = driver.findElement(By.name("PasswdAgain"));
		 senha.sendKeys("Senha@123_@");
	 }
	
	public void proximaSenha() {
		 WebElement proximo = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		 proximo.click();
	 }

}
