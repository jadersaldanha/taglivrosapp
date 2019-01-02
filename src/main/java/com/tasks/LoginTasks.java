package com.tasks;

import org.openqa.selenium.WebDriver;
import com.appObjects.LoginAppObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTasks {
	
	private final LoginAppObjects login;
	AppiumDriver<AndroidElement> driver;
	
	public LoginTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		this.login = new LoginAppObjects (driver); 
	}
	
	public void digitarEmailLogin (String email) {
		this.login.getEmailTextField().sendKeys(email);
	}
	
	public void digitarSenha (String senha) {
		this.login.getSenhaTextField().sendKeys(senha);		
	}
	
	public void clicarLogin () {
		this.driver.navigate().back();
		this.login.getLoginButton().click();		
	}

	public void clicarConhecerNovidades () {
		login.getBeginButton().click();		
	}
	
	public void clicarLogin2 () {
		login.getLogin2Button().click();
	}	

	public void pularNovidades () {
		login.getPularButton().click();
	}
}
