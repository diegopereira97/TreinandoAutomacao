package pageobjects;

import javafx.css.CssMetaData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePageObject {

    protected WebDriver navegagor;

    public HomePageObject(WebDriver navegador) {
        PageFactory.initElements(navegador, this);
        this.navegagor = navegador;

    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement contaNome;

    @FindBy(id = "searchDropdownBox")
    private WebElement tipoDePesquisaSelecionar;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement pesquisaInserir;

    @FindBy(id = "nav-search-submit-button")
    private WebElement pesquisaClicar;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement todosClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(2)")
    private WebElement vendaNaAmazonClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(3)")
    private WebElement maisVendidosClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(4)")
    private WebElement eBooksKindleClicar;

    @FindBy(css = "#nav-link-prime")
    private WebElement primeClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(6)")
    private WebElement lancamentosClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(7)")
    private WebElement gamesClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(8)")
    private WebElement livrosClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(9)")
    private WebElement ofertasDoDiaClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(10)")
    private WebElement alimentosBebidasClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(11)")
    private WebElement eletronicosClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(12)")
    private WebElement computadoresClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(13)")
    private WebElement comprarNovamenteClicar;

    @FindBy(css = "#nav-xshop > a:nth-child(14)")
    private WebElement ideiasParaPresentes;

    @FindBy(css = "#nav-xshop > a:nth-child(15)")
    private WebElement atendimentoClienteClicar;

    @FindBy(id = "nav-your-amazon")
    private WebElement contaDiegoClicar;

    @FindBy(id = "nav-orders")
    private WebElement pedidosClicar;

    @FindBy(id = "nav-cart-count-container")
    private WebElement carrinhoClicar;


    public void contaNome(String nomeDaConta) {
        assertEquals(nomeDaConta, this.contaNome.getText());
        }

    public void tipoDePesquisaSelecionar() throws InterruptedException {
        //tipoDePesquisaSelecionar.click();
        Select itemSelecionar = new Select(tipoDePesquisaSelecionar);
        itemSelecionar.selectByVisibleText("Todos os departamentos");
        //itemSelecionar.selectByVisibleText("Alexa Skills");
        //itemSelecionar.selectByVisibleText("Alimentos e Bebidas");
        //itemSelecionar.selectByVisibleText("Apps e Jogos");
        //itemSelecionar.selectByVisibleText("Automotivo");
        //itemSelecionar.selectByVisibleText("Bebês");
        //itemSelecionar.selectByVisibleText("Beleza");
        //itemSelecionar.selectByVisibleText("Bolsas, Malas e Mochilas");
        Thread.sleep(5000);

    }

    public void pesquisaInserir(String termoDePesquisa) throws InterruptedException {
        termoDePesquisa = termoDePesquisa.toLowerCase();
        pesquisaInserir.sendKeys(termoDePesquisa);
        pesquisaClicar.click();
        Thread.sleep(3000);
    }

    public void todosClicar() throws InterruptedException{
        todosClicar.click();
        Thread.sleep(2000);
    }

    public void vendaNaAmazonClicar() throws InterruptedException{
        vendaNaAmazonClicar.click();
        Thread.sleep(2000);
    }

    public void maisVendidosClicar() throws InterruptedException{
        maisVendidosClicar.click();
        Thread.sleep(2000);
    }

    public void eBooksKindleClicar() throws InterruptedException{
        eBooksKindleClicar.click();
        Thread.sleep(2000);
    }

    public void primeClicar() throws InterruptedException{
        primeClicar.click();
        Thread.sleep(2000);
    }

    public void lancamentosClicar() throws InterruptedException{
        lancamentosClicar.click();
        Thread.sleep(2000);
    }

    public void gamesClicar() throws InterruptedException{
        gamesClicar.click();
        Thread.sleep(2000);
    }

    public void livrosClicar() throws InterruptedException{
        livrosClicar.click();
        Thread.sleep(2000);
    }

    public void ofertasdoDiaClicar() throws InterruptedException{
        ofertasDoDiaClicar.click();
        Thread.sleep(2000);
    }

    public void alimentosBebidasClicar() throws InterruptedException{
        alimentosBebidasClicar.click();
        Thread.sleep(2000);
    }

    public void eletronicosClicar() throws InterruptedException{
        eletronicosClicar.click();
        Thread.sleep(2000);
    }

    public void computadoresClicar() throws InterruptedException{
        computadoresClicar.click();
        Thread.sleep(2000);
    }

    public void comprarNovamenteClicar() throws InterruptedException{
        comprarNovamenteClicar.click();
        Thread.sleep(2000);
    }

    public void ideiasParaPresentes() throws InterruptedException{
        ideiasParaPresentes.click();
        Thread.sleep(2000);
    }

    public void atendimentoClienteClicar() throws InterruptedException{
        atendimentoClienteClicar.click();
        Thread.sleep(2000);
    }

    public void contaDiegoClicar() throws InterruptedException{
        contaDiegoClicar.click();
        Thread.sleep(2000);
    }

    public void pedidosClicar() throws InterruptedException{
        pedidosClicar.click();
        Thread.sleep(2000);
    }

    public void carrinhoClicar() throws InterruptedException{
        carrinhoClicar.click();
        Thread.sleep(2000);
    }


}