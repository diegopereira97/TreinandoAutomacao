package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //Abrindo navegador
        System.setProperty("webdriver.chrome.driver", "D:\\Estudos\\Automacao\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        navegador.get("https://www.amazon.com.br/");
        navegador.manage().window().maximize();

        return navegador;
    }
}