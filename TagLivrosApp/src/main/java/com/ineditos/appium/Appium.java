package com.ineditos.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Appium {

	private static AppiumServer server;
	private static final String SERVER_URL = "http://127.0.0.1:4723/wd/hub";

	public static AppiumDriver<AndroidElement> startAndroid(String deviceName, String apkFile) {
		try {
			//initGenymotionServer(deviceName);
			initAppiumServer();

			String appFilePath = getApkFilePath(apkFile);
			URL serverUrl = new URL(SERVER_URL);

			AppiumDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(serverUrl,
					configCapabilities(deviceName, "C:\\Users\\Tag Livros\\Downloads\\app-ineditos-debug.apk"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
		} catch (MalformedURLException ex) {
			System.out.println("Invalid server URL: " + ex.getMessage());
			throw new RuntimeException(ex);
		}
	}

	public static void waitForLoading() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			System.out.println("WaitForLoading failure: " + ex.getMessage());
		}
	}

	public static void stop(AppiumDriver<AndroidElement> driver) {
		driver.quit();
		server.stopServer();
	}

//	    public static void stopGenymotionServer() {
//	        Genymotion.stopGenymotion();
//	    }

//	private static void initGenymotionServer(String deviceName) {
//		Genymotion.startGenymotion("deviceName");
//	}

	private static void initAppiumServer() {
		ServerArguments arguments = new ServerArguments();
		arguments.setArgument("--address", "127.0.0.1");
		arguments.setArgument("--port", "4723");
		arguments.setArgument("--no-reset", true);

		server = new AppiumServer(arguments);

		System.out.println("Situação do Appium Server: " + server.isServerRunning());

		server.startServer();

		System.out.println("Situação do Appium Server: " + server.isServerRunning());

		if (server.isServerRunning()) {
			System.out.println("Appium executando em 127.0.0.1 porta 4723!");
		} else {
			System.out.println("Appium não inicializado.");
		}
	}

//	private static DesiredCapabilities configCapabilities(String deviceName, String appFilePath) {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "8.0.0");
//		capabilities.setCapability("deviceName", "Galaxy J6");
//		capabilities.setCapability("app", "C:\\Users\\Tag Livros\\Downloads\\app-curadoria-release.apk");
//		capabilities.setCapability("appPackage", "br.com.taglivros.taglivros");
//		capabilities.setCapability("appActivity", "br.com.taglivros.ui.MainActivity");
//		return capabilities;
//	}
	
	private static DesiredCapabilities configCapabilities(String deviceName, String appFilePath) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("deviceName", "Moto G5");
		capabilities.setCapability("app", "C:\\Users\\Tag Livros\\Downloads\\app-ineditos-debug.apk");
		capabilities.setCapability("appPackage", "br.com.taglivros.tagineditos.debug");
		capabilities.setCapability("appActivity", "br.com.taglivros.ui.MainActivity");
		return capabilities;
	}

	private static String getApkFilePath(String apkFile) {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps/");
		File apk = new File(appDir, apkFile);
		return apk.getAbsolutePath();
	}

}
