package com.ineditos.tasks;

import com.aventstack.extentreports.Status;
import com.ineditos.appObjects.CafezinhoPostAppObjects;
import com.utils.Config;
import com.utils.Generator;
import com.utils.Report;
import com.utils.Screenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CafezinhoPostTasks {
	private final CafezinhoPostAppObjects login;
	private AppiumDriver<AndroidElement> driver;
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	
	public CafezinhoPostTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		this.login = new CafezinhoPostAppObjects (driver); 
	}
	
	public void novoPost () throws Exception {
		login.getNovoPostButton().click();
	}
	
	public void inserirImagensCameraeGaleria () throws Exception {
		login.getCameraButton().click();
	}
	
	public void galeriaNovoPost () throws Exception {
		login.getGaleriaNovoPostButton().click();
	}
	
	public void galeriaCameraPasta () throws Exception {
		login.getGaleriaScreenshotsButton().click();
	}
	
	public void clicarCamera () throws Exception {
		login.getCameraButton().click();
	}
	
	public void primeiraFotoGaleria () throws Exception {
		login.getPrimeiraFotoGaleriaScreenshotsButton().click();
	}
	
	public void segundaFotoGaleria () {
		login.getSegundaFotoGaleria().click();
	}
	
	public void terceiraFotoGaleria () {
		login.getSegundaFotoGaleria().click();
	}
	
	public void concluirSubmeterFotoGaleria () throws Exception {
		login.getSubmeterFotoGaleriaButton().click();
	}
	
	public void editarPost () throws Exception {
		login.getPostEditButton().sendKeys("Eu amo usar chinelos.");
	}
	
	public void editarPostMais3000Caracteres () throws Exception {
		login.getPostEditButton().sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text");
	}
	
	public void spoilerNao () throws Exception {
		login.getSpoilerCheckBoxNaoButton().click();
	}
	
	public void spoilerSim () throws Exception {
		login.getSpoilerCheckBoxSimButton().click();
	}
	
	public void marcarSpoilerPrimeiroMes () throws Exception {
		login.getListaMesSpoiler().click();
	}
	
	public void submitPost () throws Exception {
		login.getSubmitButton().click();
	}
	
	public void permitirGaleria () throws Exception {
		login.getPermitirBotaoGaleriaButton().click();
	}

	public void permitirCamera () throws Exception {
		login.getPermitirBotaoGaleriaButton().click();
	}
	
	public void entendi () {
		login.getEntendiButton().click();
	}
}
