package com.ineditos.cafezinho.testCases;

import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ineditos.appium.Appium;
import com.ineditos.tasks.CafezinhoPostTasks;
import com.ineditos.tasks.DenunciarPostApenasImagemImproprioTasks;
import com.ineditos.tasks.LoginTasks;
import com.utils.Config;
import com.utils.Report;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LiberarSpoilereDenunciarPostImagemTextoTestCase {
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private LoginTasks login;
	private AppiumDriver<AndroidElement> driver;
	private CafezinhoPostTasks cafezinho;
	WebDriver driver2;
	private DenunciarPostApenasImagemImproprioTasks denunciar;

	@Before
	public void setUp() {
		Report.startTest("Denunciar Post com Imagens Improprio TestCase");
		driver = Appium.startAndroid("Moto G5", "app-ineditos-debug.apk");
		driver2 = (WebDriver) driver;
		login = new LoginTasks(driver);
		cafezinho = new CafezinhoPostTasks(driver);
		denunciar = new DenunciarPostApenasImagemImproprioTasks(driver);
	}

	@Test
	public void testMain() throws Exception {
		login.digitarEmailLogin("christina@aguilera.comk");
		login.digitarSenha("taglivros");
		login.clicarLogin();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/finish_button"))));

		login.clicarFinalizarCadastro();
		login.clicarConhecerNovidades();
		login.pularNovidades();

		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/more_button"))));

		MobileElement topCharts = driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]"));
		Point point = topCharts.getLocation();

		int startY = 1594;
		int endY = 593;

		int startX = 551;
		int endX = 538;

		TouchAction actions = new TouchAction(driver);

		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, endY)).release().perform();

		do {
			actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(endX, endY)).release().perform();
			actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(endX, endY)).release().perform();
			actions.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
					.moveTo(PointOption.point(endX, endY)).release().perform();

			try {
				driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/layout_spoiler")).isDisplayed();
				denunciar.liberarPostSpoiler();
				driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/square_image_view")).isDisplayed();
				driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/text_post")).isDisplayed();
				denunciar.clicarMenuReticiencias();
				denunciar.clicarConteudoImprorioInapropriado();
				break;
			} catch (NoSuchElementException e) {
				actions.press(PointOption.point(startX, startY))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
						.moveTo(PointOption.point(endX, endY)).release().perform();
			}

		} while (driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/more_button")).isDisplayed());

	}

	@After
	public void tearDown() {
		Report.close();
		// this.driver.quit();
	}

}
