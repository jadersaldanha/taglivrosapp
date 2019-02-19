package com.curadoria.appObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CafezinhoPostAppObjects {
	
private AppiumDriver<AndroidElement> driver;
	
	public  CafezinhoPostAppObjects (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;	
	}	
	
	public AndroidElement getEmailTextField () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/email_edit_text");
	}
	
	public AndroidElement getSenhaTextField () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/password_edit_text");
	}
	
	public AndroidElement getLoginButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/login_button");
	}
	
	public AndroidElement getBeginButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/begin_button");
	}
	
	public AndroidElement getPularButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/email_edit_text");
	}
	
	public AndroidElement getNovoPostButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/text_new_post");
		
	}
	
	public AndroidElement getPostEditButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/post_edit_text");
	}
	
	public AndroidElement getSpoilerCheckBoxSimButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_yes_check_box");
	}
	
	public AndroidElement getSpoilerCheckBoxNaoButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_no_check_box");
	}

	public AndroidElement getCameraButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/camera_button");
	}

	public AndroidElement getFecharButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_close");
	}

	public AndroidElement getSubmitButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
	}

	public AndroidElement getCafezinhoButton () {
		return driver.findElementById("android.support.v7.app.ActionBar.Tab[@content-desc=\"CAFEZINHO\"]/android.widget.TextView");
	}
	
	public AndroidElement getEstanteButton () {
		return driver.findElementById("android.support.v7.app.ActionBar.Tab[@content-desc=\"ESTANTE\"]/android.widget.TextView");
	}
	
	public AndroidElement getGaleriaButton () {
		return driver.findElementById("android.support.v7.app.ActionBar.Tab[@content-desc=\"GALERIA\"]/android.widget.TextView");
	}

	public AndroidElement getPerfilButton () {
		return driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView");
	}
	
	public AndroidElement getLogin2Button () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/login_button");
	}
	
	public AndroidElement getGaleriaNovoPostButton () {
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/text_gallery_label");
	}
	
	public AndroidElement getGaleriaScreenshotsButton () {
		
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	}
	
	public AndroidElement getPrimeiraFotoGaleriaScreenshotsButton () {
		//return driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	}
	
	public AndroidElement getSubmeterFotoGaleriaButton () {
		//return driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
	}
	
	public AndroidElement getPermitirBotaoGaleriaButton () {
		//return driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
		return driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	}


}
