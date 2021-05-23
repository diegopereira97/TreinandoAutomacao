package tests;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageobjects.CadastroPageObject;
import pageobjects.HomePageObject;
import utils.Web;

public class TestCadastroComSucesso {

    private WebDriver navegador;

@BeforeMethod
    public void abrirNavegador(){
        Web navegar = new Web();
        navegador = Web.createChrome();
    }

@Test
    public void fazerCadastro (){
        HomePageObject HomePage = new HomePageObject(navegador);
        HomePage.moverMouse();
        HomePage.clicarComeceAqui();

        CadastroPageObject CadastroPage = new CadastroPageObject(navegador);
        CadastroPage.digitarNome("Nome dome");
        CadastroPage.digitarNovoEmail("novoEmail");
        CadastroPage.digitarNovaSenha("novaSenha");
        CadastroPage.confirmarSenha("maisUmaVezSenha");

    }

@AfterMethod
    public void fecharNavegador(){
    navegador.close();
    navegador.quit();
    }


}
