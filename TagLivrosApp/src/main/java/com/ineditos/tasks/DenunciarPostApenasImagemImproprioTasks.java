package com.ineditos.tasks;

import com.ineditos.appObjects.DenunciarPostApenasImagemImproprioAppObjects;
import com.ineditos.appObjects.LoginAppObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class DenunciarPostApenasImagemImproprioTasks {
	private final DenunciarPostApenasImagemImproprioAppObjects denunciar;
	AppiumDriver<AndroidElement> driver;

	public DenunciarPostApenasImagemImproprioTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		denunciar = new DenunciarPostApenasImagemImproprioAppObjects (driver); 
	}

	public void clicarMenuReticiencias() {
		denunciar.getMenuReticencias().click();
	}
	
	public void clicarConteudoImprorioInapropriado () {
		denunciar.getConteudoImproprio().click();
	}
	
	public void clicarEhSpoilerButton () {
		denunciar.getEhSpoilerButton().click();
	}
	
	public void liberarPostSpoiler () {
		denunciar.getPostSpoiler().click();
	}
	
}
