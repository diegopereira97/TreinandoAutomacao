package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CommonPageObject;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import pageobjects.ResultadodaPesquisaPageObject;
import utils.Web;

public class PesquisaTest {

    private WebDriver navegador;

@BeforeMethod
    public void abrirNavegador(){
        Web navegar = new Web();
        navegador = Web.createChrome();
    }

@Test
    public void fazerPesquisa () throws InterruptedException{
        String termoDePesquisa = "Echo Dot 8";

        CommonPageObject CommonPage = new CommonPageObject(navegador);
        CommonPage.moverMouse();
        CommonPage.clicarLogin();

        LoginPageObject LoginPage = new LoginPageObject(navegador);
        LoginPage.digitarEmail("testeautomacao97@gmail.com");
        LoginPage.clicarContinuar();
        LoginPage.digitarSenha("Toloveru123");
        LoginPage.clicarSubmit();

        HomePageObject HomePage = new HomePageObject(navegador);
        HomePage.pesquisaInserir(termoDePesquisa);

        ResultadodaPesquisaPageObject PesquisaPage = new ResultadodaPesquisaPageObject(navegador);
        PesquisaPage.palavraChaveDoTermoDeUso(termoDePesquisa);
        PesquisaPage.ordemDoResultado();
        boolean resultado = PesquisaPage.validarResultados(termoDePesquisa);

        Assert.assertTrue(resultado);

    }
@AfterMethod
    public void fecharNavegador(){
        navegador.close();
        navegador.quit();
    }


}
