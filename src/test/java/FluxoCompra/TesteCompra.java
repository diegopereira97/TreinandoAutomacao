package FluxoCompra;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TesteCompra {

    private WebDriver navegador;

    @Test
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

    }

    @After
    public void tearDown () {
        navegador.quit();
    }

}
