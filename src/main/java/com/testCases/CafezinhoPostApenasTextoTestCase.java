package com.testCases;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.appium.Appium;
import com.aventstack.extentreports.Status;
import com.support.Config;
import com.support.Generator;
import com.support.Report;
import com.support.Screenshot;
import com.tasks.CafezinhoPostTasks;
import com.tasks.LoginTasks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CafezinhoPostApenasTextoTestCase {
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private LoginTasks login;
	private AppiumDriver<AndroidElement> driver;
	private CafezinhoPostTasks cafezinho;

	@Before
	public void setUp() {
		Report.startTest("Login App Curadoria");
		driver = Appium.startAndroid("Moto G5", "app-curadoria-release.apk");
		login = new LoginTasks (driver);
		cafezinho = new CafezinhoPostTasks (driver);
	}

	@Test
	public void testMain() throws InterruptedException, IOException {		    
		login.digitarEmailLogin("eduardo.dornel@hotmail.com");
		String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		Screenshot.Tirar(driver, screenshotArquivo1);
		Report.log(Status.PASS, "Digitou e-mail", screenshotArquivo1);
		
		String screenshotArquivo2 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		login.digitarSenha("taglivros");
		Screenshot.Tirar(driver, screenshotArquivo2);
		Report.log(Status.PASS, "Digitou senha", screenshotArquivo2);
		
		String screenshotArquivo3 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		login.clicarLogin();
		Screenshot.Tirar(driver, screenshotArquivo3);
		Report.log(Status.PASS, "Voltou o teclado e clicou em entrar.", screenshotArquivo3);

		String screenshotArquivo4 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
		login.clicarConhecerNovidades();
		Screenshot.Tirar(driver, screenshotArquivo4);
		Report.log(Status.PASS, "Clicou em conhecer novidades.", screenshotArquivo4);
		
		login.pularNovidades();
	    cafezinho.novoPost();
	    cafezinho.editarPost();
	    cafezinho.spoilerNao();
	    cafezinho.submitPost();
	}

	@After
	public void tearDown() {
		Report.close();
		// this.driver.quit();
	}

}
