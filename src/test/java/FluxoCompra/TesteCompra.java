package FluxoCompra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteCompra {

    private WebDriver navegador;

    @Before
    public void Login () {
     System.setProperty("webdriver.chrome.driver", "D:\\Estudos\\Automação\\Drivers\\chromedriver.exe");
     navegador = new ChromeDriver();
     navegador.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     navegador.get("https://www.amazon.com.br/");
     navegador.manage().window().maximize();

        WebElement Login = navegador.findElement(By.id("nav-belt"));
        Login.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        WebElement LoginEmail = navegador.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div"));
        LoginEmail.findElement(By.name("email")).sendKeys("diego.dick97@gmail.com");
        LoginEmail.findElement(By.id("continue")).click();
        WebElement LoginSenha = navegador.findElement(By.id("a-page"));
        LoginSenha.findElement(By.id("ap_password")).sendKeys("toloveru123");
        LoginSenha.findElement(By.id("signInSubmit")).submit();
        WebElement Home = navegador.findElement(By.id("nav-link-accountList-nav-line-1"));
        String Usuario = Home.getText();
        Assert.assertEquals("Olá, diego", "Olá, diego");
    }

    @Test
    public void testListaDestaque () {
        WebElement EscolherProduto = navegador.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]"));
        EscolherProduto.findElement(By.id("nav-hamburger-menu")).click();
        WebElement Destaques = navegador.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[1]/div"));
        Destaques.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]")).click();
        //Destaques.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]"));
        //Destaques.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[4]"));
        WebElement MaisVendidos = navegador.findElement(By.id("zg_banner_text_wrapper"));
        String Maisvendidos = MaisVendidos.getText();
        Assert.assertEquals("Mais vendidos", Maisvendidos);
        WebElement QualquerDepartamento = navegador.findElement(By.id("zg_browseRoot"));
        QualquerDepartamento.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(14) > a")).click();
        WebElement Eletronicos = navegador.findElement(By.xpath("//*[@id=\"zg-right-col\"]/h1"));
        String NomedaPagina = Eletronicos.getText();
        Assert.assertEquals("Mais Vendidos em Eletrônicos", NomedaPagina);
        WebElement ListaEletronicos = navegador.findElement(By.id("zg-center-div"));
        ListaEletronicos.findElement(By.cssSelector("#zg-ordered-list > li:nth-child(2) > span > div > span > a > span > div")).click();
        WebElement ItemEletronico2 = navegador.findElement(By.id("productTitle"));
        String NomedoEletronico = ItemEletronico2.getText();
        Assert.assertEquals("Novo Echo Dot (4ª Geração): Smart Speaker com Alexa - Cor Preta", NomedoEletronico);
        //MaisVendidos.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[1]/a"));

    }

    @Test
    public void testConteudoDigital () {
       WebElement EscolherProduto = navegador.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]"));
       EscolherProduto.findElement(By.id("nav-hamburger-menu")).click();
       WebElement ConteudoDigital = navegador.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(6)"));
       ConteudoDigital.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]")).click();
       WebElement AmazonFire = navegador.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[2]"));
       String FireAmazon = AmazonFire.getText();
       Assert.assertEquals("amazon fire tv", "amazon fire tv");


    }




    @After
    public void tearDown () {
        navegador.quit();
    }

}
