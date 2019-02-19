package com.ineditos.appObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class DenunciarPostApenasImagemImproprioAppObjects {
	
	private AppiumDriver<AndroidElement> driver;
	
	public DenunciarPostApenasImagemImproprioAppObjects (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;	
	}	
	
	public AndroidElement getEmailTextField () {
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/email_edit_text");
	}

	public AndroidElement getMenuReticencias () {
		return driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/more_button"));
	}
	
	public AndroidElement getConteudoImproprio () {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
	}
	
	public AndroidElement getEhSpoilerButton () {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
	}
	
	public AndroidElement getPostSpoiler () {
		return driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/layout_spoiler"));
	}
}
