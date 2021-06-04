package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.CommonPageObject;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import utils.Web;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver navegador;

@BeforeMethod
    public void abrirNavegador(){
        Web navegar = new Web();
        navegador = Web.createChrome();
    }

@Test
    public void fazerLoginValido () throws InterruptedException {
        CommonPageObject CommonPage = new CommonPageObject(navegador);
        CommonPage.moverMouse();
        CommonPage.clicarLogin();

        LoginPageObject LoginPage = new LoginPageObject(navegador);
        LoginPage.digitarEmail("diego.dick97@gmail.com");
        LoginPage.clicarContinuar();
        LoginPage.digitarSenha("toloveru123");
        LoginPage.clicarSubmit();

        HomePageObject HomePage = new HomePageObject(navegador);
        HomePage.contaNome("Olá, diego");

    }

@AfterMethod
    public void fecharNavegador() {
        navegador.close();
        navegador.quit();
    }
}