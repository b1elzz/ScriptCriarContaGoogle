package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroInformacoes {
	
	static WebDriver driver;

	public CadastroInformacoes(WebDriver driver) {
		this.driver = driver;;
	}
	
	public void preencherDia() {
		 WebElement dia = driver.findElement(By.name("day"));
		 dia.sendKeys("10");
	 }
	
	public void preencherAno() {
		 WebElement ano = driver.findElement(By.id("year"));
		 ano.sendKeys("1998");
	 }
	
	public void Mes() {
		WebElement mes = driver.findElement(By.id("month"));
		mes.click();
	}
	
	public void preencherMes() {
		WebElement mes = driver.findElement(By.xpath("//option[contains(text(), 'Janeiro')]"));
		mes.click();
		mes.click();
	}
	
	public void Genero() {
		WebElement genero = driver.findElement(By.id("gender"));
		genero.click();
	}
	
	public void preencherGenero() {
		WebElement genero = driver.findElement(By.xpath("//option[contains(text(), 'Mulher')]"));
		genero.click();
		genero.click();
	}
	
	public void proximoInformacoes() {
		 WebElement proximo = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
		 proximo.click();
	 }
	
	

}
