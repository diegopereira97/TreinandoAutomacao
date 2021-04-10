package FluxoCompra;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCompra {

    private WebDriver navegador;

    @Test
    public void Login () {
     System.setProperty("webdriver.chrome.driver", "D:\\Estudos\\Automação\\Drivers\\chromedriver.exe");
     navegador = new ChromeDriver();
     navegador.get("https://www.amazon.com.br/");

        WebElement Login = navegador.findElement(By.id("nav-belt"));
        Login.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Login.findElement(By.id("nav-flyout-ya-signin")).click();



    }


}
