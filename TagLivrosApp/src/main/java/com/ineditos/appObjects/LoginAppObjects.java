package com.ineditos.appObjects;

import com.aventstack.extentreports.Status;
import com.utils.Config;
import com.utils.Generator;
import com.utils.Report;
import com.utils.Screenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginAppObjects {

	private AppiumDriver<AndroidElement> driver;
	private static final String IMAGEPATH = Config.get("screenshot.pasta");

	public LoginAppObjects(AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public AndroidElement getEmailTextField() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/email_edit_text");
			String screenshotArquivo0 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo0);
			Report.log(Status.PASS, "Digitou e-mail no campo de login.", screenshotArquivo0);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu digitar email no campo.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/email_edit_text");
	}

	public AndroidElement getSenhaTextField() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/password_edit_text");
			String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo1);
			Report.log(Status.PASS, "Digitou senha no campo de login.", screenshotArquivo1);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu digitar senha no campo.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/password_edit_text");
	}

	public AndroidElement getLoginButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/login_button");
			String screenshotArquivo2 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo2);
			Report.log(Status.PASS, "Clicou no botão de login", screenshotArquivo2);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de login.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/login_button");
	}

	public AndroidElement getConhecerNovidadesButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/begin_button");
			String screenshotArquivo3 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo3);
			Report.log(Status.PASS, "Clicou no botão de conhecer novidades.", screenshotArquivo3);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de conhecer novidades.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/begin_button");
	}

	public AndroidElement getPularButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/skip_button");
			String screenshotArquivo4 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo4);
			Report.log(Status.PASS, "Clicou no botão de pular.", screenshotArquivo4);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de pular.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/skip_button");
	}

	public AndroidElement getNovoPostButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/text_new_post");
			String screenshotArquivo5 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo5);
			Report.log(Status.PASS, "Clicou no botão de novo post.", screenshotArquivo5);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de novo post.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/text_new_post");

	}

	public AndroidElement getPostEditButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/post_edit_text");
			String screenshotArquivo6 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo6);
			Report.log(Status.PASS, "Clicou na área de texto para digitar texto.", screenshotArquivo6);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu digitar texto na área selecionada.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/post_edit_text");
	}

	public AndroidElement getSpoilerCheckBoxSimButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_yes_check_box");
			String screenshotArquivo7 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo7);
			Report.log(Status.PASS, "Clicou na área para marcar o post como spoiler.", screenshotArquivo7);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para spoiler.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_yes_check_box");
	}

	public AndroidElement getSpoilerCheckBoxNaoButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_no_check_box");
			String screenshotArquivo8 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo8);
			Report.log(Status.PASS, "Clicou na área para marcar o post como não sendo spoiler.", screenshotArquivo8);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de identificar spoiler.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/spoiler_no_check_box");
	}

	public AndroidElement getCameraButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/camera_button");
			String screenshotArquivo9 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo9);
			Report.log(Status.PASS, "Clicou no elemento de interface para acesso a postagem de fotos.",
					screenshotArquivo9);

		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para acesso a postagem de fotos.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/camera_button");
	}

	public AndroidElement getFecharButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/action_close");
			String screenshotArquivo10 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo10);
			Report.log(Status.PASS, "Clicou no elemento de interface para fechar.", screenshotArquivo10);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para fechar.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_close");
	}

	public AndroidElement getSubmitButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
			String screenshotArquivo11 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo11);
			Report.log(Status.PASS, "Clicou no elemento de interface para submeter.", screenshotArquivo11);

		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para submeter.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
	}

	public AndroidElement getCafezinhoButton() throws Exception {
		try {
			driver.findElementById(
					"android.support.v7.app.ActionBar.Tab[@content-desc=\"CAFEZINHO\"]/android.widget.TextView");
			String screenshotArquivo12 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo12);
			Report.log(Status.PASS, "Clicou no elemento de interface para acessar o cafezinho.", screenshotArquivo12);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface do cafezinho.");
			throw (e);
		}
		return driver.findElementById(
				"android.support.v7.app.ActionBar.Tab[@content-desc=\"CAFEZINHO\"]/android.widget.TextView");
	}

	public AndroidElement getEstanteButton() throws Exception {
		try {
			driver.findElementById(
					"android.support.v7.app.ActionBar.Tab[@content-desc=\"ESTANTE\"]/android.widget.TextView");
			String screenshotArquivo13 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo13);
			Report.log(Status.PASS, "Clicou no elemento de interface para acessar a estante.", screenshotArquivo13);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para acesso a estante.");
			throw (e);
		}
		return driver.findElementById(
				"android.support.v7.app.ActionBar.Tab[@content-desc=\"ESTANTE\"]/android.widget.TextView");
	}

	public AndroidElement getGaleriaButton() throws Exception {
		try {
			driver.findElementById(
					"android.support.v7.app.ActionBar.Tab[@content-desc=\"GALERIA\"]/android.widget.TextView");
			String screenshotArquivo14 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshotArquivo14);
			Report.log(Status.PASS, "Clicou no elemento de interface para acessar a estante.", screenshotArquivo14);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de entrar.");
			throw (e);
		}
		return driver.findElementById(
				"android.support.v7.app.ActionBar.Tab[@content-desc=\"GALERIA\"]/android.widget.TextView");
	}

	public AndroidElement getPerfilButton() throws Exception {
		try {
			driver.findElementById(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView");
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de entrar.");
			throw (e);
		}
		return driver.findElementById(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.ImageView");
	}

	public AndroidElement getLogin2Button() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/login_button");
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de entrar.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/login_button");
	}

	public AndroidElement getGaleriaNovoPostButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/text_gallery_label");
			String screenshot = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot);
			Report.log(Status.PASS, "Clicou no elemento de interface para criar novo post com foto da galeria.", screenshot);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para novo post da galeria.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/text_gallery_label");
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

	public AndroidElement getSubmeterFotoGaleriaButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
			String screenshot17 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot17);
			Report.log(Status.PASS, "Clicou no elemento de interface para submeter foto da galeria.", screenshot17);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento para submeter a foto da galeria.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.taglivros.debug:id/action_submit");
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

	public AndroidElement getFinalizarCadastroButton() throws Exception {
		try {
			driver.findElementById("br.com.taglivros.tagineditos.debug:id/finish_button");
			String screenshot20 = IMAGEPATH + Generator.dataHoraParaArquivo() + ".png";
			Screenshot.Tirar(driver, screenshot20);
			Report.log(Status.PASS, "Clicou no elemento de interface para finalizar o cadastro.", screenshot20);
		} catch (Exception e) {
			Report.log(Status.FAIL, "Não conseguiu acessar o elemento de interface para finalizar cadastro.");
			throw (e);
		}
		return driver.findElementById("br.com.taglivros.tagineditos.debug:id/finish_button");
	}

}
