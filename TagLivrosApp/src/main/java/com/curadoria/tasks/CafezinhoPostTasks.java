package com.curadoria.tasks;

import com.curadoria.appObjects.CafezinhoPostAppObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CafezinhoPostTasks {
	private final CafezinhoPostAppObjects login;
	private AppiumDriver<AndroidElement> driver;
	
	public CafezinhoPostTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		this.login = new CafezinhoPostAppObjects (driver); 
	}
	
	public void novoPost () {
		login.getNovoPostButton().click();
	}
	
	public void camera () {
		login.getCameraButton().click();
	}
	
	public void galeriaNovoPost () {
		login.getGaleriaNovoPostButton().click();
	}
	
	public void galeriaScreenshotPasta () {
		login.getGaleriaScreenshotsButton().click();
	}
	
	public void primeiraFotoGaleria () {
		login.getPrimeiraFotoGaleriaScreenshotsButton().click();
	}
	
	public void concluirSubmeterFotoGaleria () {
		login.getSubmeterFotoGaleriaButton().click();
	}
	
	public void editarPost () {
		login.getPostEditButton().sendKeys("Este eh um exemplo de post com apenas texto.");
	}
	
	public void spoilerNao () {
		login.getSpoilerCheckBoxNaoButton().click();
	}
	
	public void submitPost () {
		login.getSubmitButton().click();
	}
	
	public void permitirGaleria () {
		login.getPermitirBotaoGaleriaButton().click();
	}

}
