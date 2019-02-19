package com.ineditos.cafezinho.testCases;

import java.io.IOException;
import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.Status;
import com.ineditos.appium.Appium;
import com.ineditos.tasks.LoginTasks;
import com.utils.Config;
import com.utils.Generator;
import com.utils.Report;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class LoginAppTestCase {
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private LoginTasks login;
	private AppiumDriver<AndroidElement> driver;

	@Before
	public void setUp() {
		Report.startTest("Login App Ineditos Android");
		driver = Appium.startAndroid("Moto G5", "app-ineditos-debug.apk");
		login = new LoginTasks(driver);
	}

	@Test
	public void testMain() throws Exception {
		
		login.digitarEmailLogin("pri-3@tag.com");				
		login.digitarSenha("taglivros");
		login.clicarLogin();
		login.clicarFinalizarCadastro();
		login.clicarConhecerNovidades();
		
		//login.pularNovidades();
		
		//trecho de código para fazer swipe, retirado de stackoverflow
		// Get location of element you want to swipe
	    WebElement banner = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint = banner.getLocation();
	    // Get size of device screen
	    Dimension screenSize = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX = Math.toIntExact(Math.round(screenSize.getWidth() * 0.8));
	    int endX = 0;

	    TouchAction action = new TouchAction(driver);
	    action
	            .press(PointOption.point(startX, bannerPoint.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX, bannerPoint.getY()))
	            .release();
	    driver.performTouchAction(action);
	    
		// Get location of element you want to swipe
	    WebElement banner2 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint2 = banner2.getLocation();
	    // Get size of device screen
	    Dimension screenSize2 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX2 = Math.toIntExact(Math.round(screenSize2.getWidth() * 0.8));
	    int endX2 = 0;

	    TouchAction action2 = new TouchAction(driver);
	    action2
	            .press(PointOption.point(startX2, bannerPoint2.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX2, bannerPoint2.getY()))
	            .release();
	    driver.performTouchAction(action2);
	    
		// Get location of element you want to swipe
	    WebElement banner3 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint3 = banner3.getLocation();
	    // Get size of device screen
	    Dimension screenSize3 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX3 = Math.toIntExact(Math.round(screenSize3.getWidth() * 0.8));
	    int endX3 = 0;

	    TouchAction action3 = new TouchAction(driver);
	    action3
	            .press(PointOption.point(startX3, bannerPoint3.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX3, bannerPoint3.getY()))
	            .release();
	    driver.performTouchAction(action3);
	    
		// Get location of element you want to swipe
	    WebElement banner4 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint4 = banner4.getLocation();
	    // Get size of device screen
	    Dimension screenSize4 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX4 = Math.toIntExact(Math.round(screenSize4.getWidth() * 0.8));
	    int endX4 = 0;

	    TouchAction action4 = new TouchAction(driver);
	    action4
	            .press(PointOption.point(startX4, bannerPoint4.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX4, bannerPoint4.getY()))
	            .release();
	    driver.performTouchAction(action4);
	    
		// Get location of element you want to swipe
	    WebElement banner5 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint5 = banner5.getLocation();
	    // Get size of device screen
	    Dimension screenSize5 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX5 = Math.toIntExact(Math.round(screenSize5.getWidth() * 0.8));
	    int endX5 = 0;

	    TouchAction action5 = new TouchAction(driver);
	    action5
	            .press(PointOption.point(startX5, bannerPoint5.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX5, bannerPoint5.getY()))
	            .release();
	    driver.performTouchAction(action5);
	    
		// Get location of element you want to swipe
	    WebElement banner6 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint6 = banner2.getLocation();
	    // Get size of device screen
	    Dimension screenSize6 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX6 = Math.toIntExact(Math.round(screenSize6.getWidth() * 0.8));
	    int endX6 = 0;

	    TouchAction action6 = new TouchAction(driver);
	    action6
	            .press(PointOption.point(startX6, bannerPoint6.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX6, bannerPoint6.getY()))
	            .release();
	    driver.performTouchAction(action6);
	    
		// Get location of element you want to swipe
	    WebElement banner7 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint7 = banner7.getLocation();
	    // Get size of device screen
	    Dimension screenSize7 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX7 = Math.toIntExact(Math.round(screenSize7.getWidth() * 0.8));
	    int endX7 = 0;

	    TouchAction action7 = new TouchAction(driver);
	    action7
	            .press(PointOption.point(startX7, bannerPoint7.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX7, bannerPoint7.getY()))
	            .release();
	    driver.performTouchAction(action7);
	    
		// Get location of element you want to swipe
	    WebElement banner8 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint8 = banner8.getLocation();
	    // Get size of device screen
	    Dimension screenSize8 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX8 = Math.toIntExact(Math.round(screenSize8.getWidth() * 0.8));
	    int endX8 = 0;

	    TouchAction action8 = new TouchAction(driver);
	    action8
	            .press(PointOption.point(startX8, bannerPoint8.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX8, bannerPoint8.getY()))
	            .release();
	    driver.performTouchAction(action8);
	    
		// Get location of element you want to swipe
	    WebElement banner9 = driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/preview_image_view"));
	    Point bannerPoint9 = banner9.getLocation();
	    // Get size of device screen
	    Dimension screenSize9 = driver.manage().window().getSize();
	    // Get start and end coordinates for horizontal swipe
	    int startX9 = Math.toIntExact(Math.round(screenSize9.getWidth() * 0.8));
	    int endX9 = 0;

	    TouchAction action9 = new TouchAction(driver);
	    action9
	            .press(PointOption.point(startX9, bannerPoint9.getY()))
	            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
	            .moveTo(PointOption.point(endX9, bannerPoint9.getY()))
	            .release();
	    driver.performTouchAction(action9);	    
	    login.clicarLogin2();
}

	@After
	public void tearDown() {
		Report.close();
		// this.driver.quit();
	}

}
