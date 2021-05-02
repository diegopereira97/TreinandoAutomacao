package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;

public class HomePageObject {

    private WebDriver navegador;

    public HomePageObject(WebDriver navegador) {
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement MoverMouseLogin;

    @FindBy(id = "nav-flyout-ya-signin")
    private WebElement ClickLogin;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement InserirPesquisa;

    @FindBy(id = "nav-search-submit-button")
    private WebElement BotãoPesquisa;

    public void MoverMouse(){
        Actions actions = new Actions(navegador);
        actions.moveToElement(MoverMouseLogin);
    }

    public void ClicarLogin(){
    ClickLogin.click();
    }
    public void FazerPesquisa(String TermodeBusca){
        TermodeBusca = TermodeBusca.toLowerCase();
        InserirPesquisa.sendKeys(TermodeBusca);
        BotãoPesquisa.click();
    }

    }


