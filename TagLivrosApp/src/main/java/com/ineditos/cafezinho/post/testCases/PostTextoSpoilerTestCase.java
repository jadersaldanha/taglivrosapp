package com.ineditos.cafezinho.post.testCases;

import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;

import com.aventstack.extentreports.Status;
import com.ineditos.appium.Appium;
import com.ineditos.tasks.*;
import com.utils.Config;
import com.utils.Generator;
import com.utils.Report;
import com.utils.Screenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class PostTextoSpoilerTestCase {
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private LoginTasks login;
	private AppiumDriver<AndroidElement> driver;
	private CafezinhoPostTasks cafezinho;

	@Before
	public void setUp() {
		Report.startTest("Post no Cafezinho Apenas com Texto e Marcado como Spoiler.");
		driver = Appium.startAndroid("Moto G5", "app-ineditos-debug.apk");
		login = new LoginTasks (driver);
		cafezinho = new CafezinhoPostTasks (driver);
	}

	@Test
	public void testMain() throws Exception {		    
		login.digitarEmailLogin("juliatolezano@jout.com");
		login.digitarSenha("taglivros");
		login.clicarLogin();		
		login.clicarFinalizarCadastro();		
		login.clicarConhecerNovidades();		
		login.pularNovidades();	
		cafezinho.novoPost();
		
		MobileElement topCharts = driver
				.findElement(MobileBy.id("br.com.taglivros.tagineditos.debug:id/square_image_view"));
		Point point = topCharts.getLocation();

		int startY = 709;
		int endY = 694;

		int startX = 1001;
		int endX = 116;

		TouchAction actions = new TouchAction(driver);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo6 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo6);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo6);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo8 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo8);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo8);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo9 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo9);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo9);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo10 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo10);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo10);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo11 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo11);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo11);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo12 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo8);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo8);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo13 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo13);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo13);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		String screenshotArquivo14 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
		Screenshot.Tirar(driver, screenshotArquivo14);
		Report.log(Status.PASS, "Clicou em novo post", screenshotArquivo14);

		cafezinho.entendi();		
	    cafezinho.editarPost();		
	    cafezinho.spoilerSim();		
		cafezinho.marcarSpoilerPrimeiroMes();		
	    cafezinho.submitPost();
	}

	@After
	public void tearDown() {
		Report.close();
		// this.driver.quit();
	}

}
