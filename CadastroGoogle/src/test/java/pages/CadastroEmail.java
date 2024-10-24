package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroEmail {

	
	static WebDriver driver;

	public CadastroEmail(WebDriver driver) {
		this.driver = driver;;
	}
	
	public void preencherEmail() {
		 WebElement email = driver.findElement(By.name("Username"));
		 email.sendKeys("sadbasuidosadas12");
	 }
	
	public void proximoEmail() {
		 WebElement proximo = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		 proximo.click();
	 }
	
}
