package com.ineditos.tasks;

import com.ineditos.appObjects.DenunciarPostApenasImagemImproprioAppObjects;
import com.ineditos.appObjects.ExcluirPostAppObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class ExcluirPostTasks {
	private final ExcluirPostAppObjects excluir;
	AppiumDriver<AndroidElement> driver;

	public ExcluirPostTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		excluir = new ExcluirPostAppObjects (driver); 
	}

	public void clicarMenuReticiencias() {
		excluir.getMenuReticencias().click();
	}
	
	public void clicarDeletar () {
		excluir.getDeletarButton().click();
	}
	
	public void clicarEhSpoilerButton () {
		excluir.getEhSpoilerButton().click();
	}
	
	public void liberarPostSpoiler () {
		excluir.getPostSpoiler().click();
	}
	
	public void clicarSimDeletarPost () {
		excluir.getSimDeletarPost().click();
	}

}
