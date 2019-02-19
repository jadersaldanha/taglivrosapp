package com.ineditos.tasks;

import com.ineditos.appObjects.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTasks {
	
	private final LoginAppObjects login;
	AppiumDriver<AndroidElement> driver;
	
	public LoginTasks (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
		this.login = new LoginAppObjects (driver); 
	}
	
	public void digitarEmailLogin (String email) throws Exception {
		login.getEmailTextField().sendKeys(email);
	}
	
	public void digitarSenha (String senha) throws Exception {
		login.getSenhaTextField().sendKeys(senha);		
	}
	
	public void clicarLogin () throws Exception {
		driver.navigate().back();
		login.getLoginButton().click();		
	}

	public void clicarConhecerNovidades () throws Exception {
		login.getConhecerNovidadesButton().click();	
	}
	
	public void clicarLogin2 () throws Exception {
		login.getLogin2Button().click();
	}	

	public void pularNovidades () throws Exception {
		login.getPularButton().click();
	}
	
	public void clicarFinalizarCadastro () throws Exception {
		login.getFinalizarCadastroButton().click();
	}
}
