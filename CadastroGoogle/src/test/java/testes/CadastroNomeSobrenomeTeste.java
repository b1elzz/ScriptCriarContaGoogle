package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastroEmail;
import pages.CadastroInformacoes;
import pages.CadastroNomeSobrenomePages;
import pages.CadastroSenha;

public class CadastroNomeSobrenomeTeste {
	
	  static WebDriver driver;
	  static CadastroNomeSobrenomePages nomeSobrenome;
	  static CadastroInformacoes dia;
	  static CadastroEmail email;
	  static CadastroSenha senha;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "C:/chromedriver-win64/chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=pt");
		driver.manage().window().maximize();
		nomeSobrenome = new CadastroNomeSobrenomePages(driver);
		dia = new CadastroInformacoes(driver);
		email = new CadastroEmail(driver);
		senha = new CadastroSenha(driver);
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		
		nomeSobrenome.preencherCampoNome();
		nomeSobrenome.preencherCampoSobrenome();
		nomeSobrenome.proximoNomeSobrenome();
		Thread.sleep(5000);
		dia.preencherDia();
		dia.preencherAno();
		dia.Genero();
		dia.preencherGenero();
		dia.Mes();
		dia.preencherMes();
		dia.proximoInformacoes();
		Thread.sleep(5000);
		email.preencherEmail();
		email.proximoEmail();
		Thread.sleep(5000);
		senha.preencherSenha();
		senha.preencherReptirSenha();
		senha.proximaSenha();
		
	}

}
