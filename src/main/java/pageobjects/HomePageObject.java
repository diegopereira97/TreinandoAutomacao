package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {

    private WebDriver navegador;

    public HomePageObject(WebDriver navegador) {
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement moverMouseLogin;

    @FindBy(css = "#nav-signin-tooltip > div > a")
    private WebElement comeceAqui;

    @FindBy(id = "nav-signin-tooltip")
    private WebElement clickLogin;

    @FindBy(id = "createAccountSubmit")
    private WebElement criarNovaConta;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement inserirPesquisa;

    @FindBy(id = "nav-search-submit-button")
    private WebElement botãoPesquisa;


    public void moverMouse(){
        Actions actions = new Actions(navegador);
        actions.moveToElement(moverMouseLogin);
    }
    public void clicarComeceAqui (){comeceAqui.click();}

    public void clicarLogin(){
    clickLogin.click();
    }
    public void clicarNovaConta(){criarNovaConta.click();}

    public void fazerPesquisa(String termodeBusca){
        termodeBusca = termodeBusca.toLowerCase();
        inserirPesquisa.sendKeys(termodeBusca);
        botãoPesquisa.click();
    }

}


