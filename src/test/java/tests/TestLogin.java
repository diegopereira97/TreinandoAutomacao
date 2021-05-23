package tests;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import utils.Web;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin {

    private WebDriver navegador;

@BeforeMethod
    public void abrirNavegador(){
        Web navegar = new Web();
        navegador = Web.createChrome();
    }

@Test
    public void fazerLoginValido () {
        HomePageObject HomePage = new HomePageObject(navegador);
        HomePage.moverMouse();
        HomePage.clicarLogin();

        LoginPageObject LoginPage = new LoginPageObject(navegador);
        LoginPage.digitarEmail("diego.dick97@gmail.com");
        LoginPage.clicarContinuar();
        LoginPage.digitarSenha("toloveru123");
        LoginPage.clicarSubmit();

    }

@AfterMethod
    public void fecharNavegador() {
        navegador.close();
        navegador.quit();
    }
}