package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageobjects.CadastroPageObject;
import pageobjects.CommonPageObject;
import utils.Web;

public class CadastroTest {

    private WebDriver navegador;

@BeforeMethod
    public void abrirNavegador(){
        Web navegar = new Web();
        navegador = Web.createChrome();
    }

@Test
    public void fazerCadastro (){
        CommonPageObject CommonPage = new CommonPageObject(navegador);
        CommonPage.moverMouse();
        CommonPage.clicarComeceAqui();

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
