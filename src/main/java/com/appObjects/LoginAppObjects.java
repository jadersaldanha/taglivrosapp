package com.appObjects;

import com.appium.Appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginAppObjects {
	
	private AppiumDriver<AndroidElement> driver;
	
	public LoginAppObjects (AppiumDriver<AndroidElement> driver) {
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
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/skip_button");
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
	
	// 
	// 	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView 
	
	//br.com.taglivros.taglivros.debug:id/text_gallery_label
	
	//	
	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView
	// //perfil

	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView
	// //notificações

	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView

	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ImageView
	// //encontros

	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ImageView
	// //home

	// br.com.taglivros.taglivros:id/iv_add_meeting //novo encontro

	// br.com.taglivros.taglivros:id/cet_meeting_title // titulo novo encontro

	// br.com.taglivros.taglivros:id/cet_meeting_place //local

	// br.com.taglivros.taglivros:id/cet_meeting_city //cidade

	// br.com.taglivros.taglivros:id/cet_meeting_date //data evento

	// br.com.taglivros.taglivros:id/cet_meeting_time //horario

	// br.com.taglivros.taglivros:id/cet_meeting_description //descricao evento

	// br.com.taglivros.taglivros:id/ctv_change_state //trocar

	// br.com.taglivros.taglivros:id/button_chat //novo chat

	// br.com.taglivros.taglivros:id/edit //

	// br.com.taglivros.taglivros:id/button_send //enviar mensagem chat

	// //android.widget.ImageButton[@content-desc="Navegar para cima"] //botao
	// voltar

	// br.com.taglivros.taglivros:id/button_camera // botao enviar foto

	// br.com.taglivros.taglivros:id/button_image // enviar imagem

	// br.com.taglivros.taglivros:id/input // campo de digitar mensagem

	// br.com.taglivros.taglivros:id/action_button //editar perfil

	// br.com.taglivros.taglivros:id/toolbar_save //salvar

	// br.com.taglivros.taglivros:id/toolbar_edit_settings //configurações

	// br.com.taglivros.taglivros:id/btn_gallery_adapter //galeria

	// br.com.taglivros.taglivros:id/btn_book_adapter // livros

	// br.com.taglivros.taglivros:id/toolbar_search // buscar


}
