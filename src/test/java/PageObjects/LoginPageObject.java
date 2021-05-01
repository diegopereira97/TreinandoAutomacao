package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

    private final String Email = "diego.dick97@gmail.com";
    private final String Senha = "toloveru@123";

    @FindBy (id = "nav-link-accountList-nav-line-1")
    private WebElement ClickLogin;

    @FindBy (name = "email")
    private WebElement InformarEmail;

    @FindBy (id = "continue")
    private WebElement BotaoContinuar;

    @FindBy (id = "ap_password")
    private WebElement InformarSenha;

    @FindBy (id = "signInSubmit")
    private WebElement BotaoSubmit;

    public void DigitarEmail () {
        this.InformarEmail.sendKeys(Email);
    }
    public void DigitarSenha (){
        this.InformarSenha.sendKeys(Senha);
    }
    public void ClicarSubmit (){
        this.BotaoSubmit.submit();

    }





    }

