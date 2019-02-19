package com.ineditos.appObjects;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
import com.utils.Config;
import com.utils.Generator;
import com.utils.Report;
import com.utils.Screenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class CafezinhoPostAppObjects {
	
	private AppiumDriver<AndroidElement> driver;
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	
	public  CafezinhoPostAppObjects (AppiumDriver<AndroidElement> driver) {
		this.driver = driver;	
	}		
	
	public AndroidElement getNovoPostButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/text_new_post");
			String screenshotArquivo5 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo5);
			Report.log(Status.PASS, "Clicou no botão de novo post.", screenshotArquivo5);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de novo post.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/text_new_post");
	}
	
	public AndroidElement getPostEditButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/post_edit_text");
			String screenshotArquivo6 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo6);
			Report.log(Status.PASS, "Clicou na área de texto para digitar texto.", screenshotArquivo6);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu digitar texto na área selecionada.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/post_edit_text");
	}
	
	public AndroidElement getSpoilerCheckBoxSimButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/spoiler_yes_check_box");
			String screenshotArquivo7 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo7);
			Report.log(Status.PASS, "Clicou na área para marcar o post como spoiler.", screenshotArquivo7);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para spoiler.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/spoiler_yes_check_box");
	}
	
	public AndroidElement getListaMesSpoiler () throws Exception {		
		try {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
			String screenshotLista = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotLista);
			Report.log(Status.PASS, "Clicou na área para marcar o post como spoiler.", screenshotLista);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para spoiler.");
			throw (e);
		}
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
	}
	
	public AndroidElement getSpoilerCheckBoxNaoButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/spoiler_no_check_box");
			String screenshotArquivo8 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo8);
			Report.log(Status.PASS, "Clicou na área para marcar o post como não sendo spoiler.", screenshotArquivo8);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de identificar spoiler.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/spoiler_no_check_box");
	}

	public AndroidElement getCameraButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/camera_button");
			String screenshotArquivo9 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo9);
			Report.log(Status.PASS, "Clicou no elemento de interface para acesso a postagem de fotos.",
					screenshotArquivo9);

		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para acesso a postagem de fotos.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/camera_button");
	}

	public AndroidElement getFecharButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_close");
			String screenshotArquivo10 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo10);
			Report.log(Status.PASS, "Clicou no elemento de interface para fechar.", screenshotArquivo10);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para fechar.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_close");
	}

	public AndroidElement getSubmitButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_submit");
			String screenshotArquivo11 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo11);
			Report.log(Status.PASS, "Clicou no elemento de interface para submeter.", screenshotArquivo11);

		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para submeter.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_submit");
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
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/login_button");
	}
	
	public AndroidElement getGaleriaNovoPostButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/text_gallery_label");
			String screenshot = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot);
			Report.log(Status.PASS, "Clicou no elemento de interface para criar novo post com foto da galeria.", screenshot);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para novo post da galeria.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/text_gallery_label");
	}
	
	public AndroidElement getGaleriaScreenshotsButton() throws Exception {
		try {
			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
			String screenshot15 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot15);
			Report.log(Status.PASS, "Clicou no elemento de interface para selecionar pasta de screenshot.", screenshot15);
		} catch (Exception e) {
			Report.log(Status.FAIL,
					"Não conseguiu acessar o elemento de interface para acessar a pasta da galeria de screenshot.");
			throw (e);
		}
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	}
	
	public AndroidElement getPrimeiraFotoGaleriaScreenshotsButton() throws Exception {
		try {
			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
			String screenshot16 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot16);
			Report.log(Status.PASS, "Clicou no elemento de interface para selecionar primeira foto da galeria.", screenshot16);
		} catch (Exception e) {
			Report.log(Status.FAIL,
					"Não conseguiu acessar o elemento de interface que seleciona a primeira foto da galeria.");
			throw (e);
		}
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	}
	
	public AndroidElement getSegundaFotoGaleria () {
		return driver.findElement(By.id("image_device"));
		//return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView"));
	}
	
	public AndroidElement getTerceiraFotoGaleria () {
		return driver.findElement(By.id("image_device"));
	}
	
	public AndroidElement getSubmeterFotoGaleriaButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_submit");
			String screenshot17 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot17);
			Report.log(Status.PASS, "Clicou no elemento de interface para submeter foto da galeria.", screenshot17);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento para submeter a foto da galeria.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/action_submit");
	}
	
	public AndroidElement getPermitirBotaoGaleriaButton() throws Exception {
		try {
			driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			String screenshot19 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot19);
			Report.log(Status.PASS, "Clicou no elemento de interface para permitir botao da galeria.", screenshot19);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento para permitir o acesso a galeria.");
			throw (e);
		}
		return driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	}

	public AndroidElement getEntendiButton () {
		return driver.findElement(By.id("br.com.taglivros.tagineditos.debug:id/finish_button"));
	}
	
	
}
