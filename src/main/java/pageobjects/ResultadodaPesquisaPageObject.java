package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ResultadodaPesquisaPageObject {

    protected WebDriver navegador;

    public ResultadodaPesquisaPageObject(WebDriver navegador){
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
    }


    @FindBy(css = "#search > span > div > span > h1 > div > div.sg-col-14-of-20.sg-col.s-breadcrumb.sg-col-10-of-16.sg-col-6-of-12")
    private WebElement palavraChaveDoTermoDeUso;

    @FindBy(id = "a-popover-4")
    private WebElement ordemDoResultado;

    @FindBy(css = "#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row")
    private List<WebElement> resultados;

    @FindBy(css = "#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(61) > span > div > div > ul")
    private WebElement paginacao;

    public void palavraChaveDoTermoDeUso(String termoDePesquisa) throws InterruptedException{
        termoDePesquisa =termoDePesquisa.toLowerCase();
        Assert.assertEquals(termoDePesquisa, this.palavraChaveDoTermoDeUso.getText());
        Thread.sleep(2000);
    }

    public void ordemDoResultado() throws InterruptedException {
        Select selecionarOrdem = new Select(ordemDoResultado);
        //selecionarOrdem.selectByVisibleText("Destaques");
        //selecionarOrdem.selectByVisibleText("Preço: baixo a alto");
        selecionarOrdem.selectByVisibleText("Preço: alto a baixo");
        //selecionarOrdem.selectByVisibleText("Avaliação dos clientes (média)");
        //selecionarOrdem.selectByVisibleText("Produtos mais novos");
        Thread.sleep(5000);
    }

    public boolean validarResultados(String termoDePesquisa) {
        for (int i = 0; i < resultados.size(); i++){
            String resultado = resultados.get(i).getText().toLowerCase();

            if (resultado.contains(termoDePesquisa)){
                return true;
            }
        }
        return false;
    }



}
