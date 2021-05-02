package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject
{


    @FindBy (name = "email")
    private WebElement InformarEmail;

    @FindBy (id = "continue")
    private WebElement BotaoContinuar;

    @FindBy (id = "ap_password")
    private WebElement InformarSenha;

    @FindBy (id = "signInSubmit")
    private WebElement BotaoSubmit;

    public void DigitarEmail (String email) {
        InformarEmail.sendKeys(email);
    }
    public void DigitarSenha (String senha){
        InformarSenha.sendKeys(senha);
    }
    public void ClicarSubmit (){
        this.BotaoSubmit.submit();

    }


 }

