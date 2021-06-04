package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject
{

    protected final WebDriver navegador;

    public LoginPageObject(WebDriver navegador) {
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
    }

    @FindBy (name = "email")
    private WebElement informarEmail;

    @FindBy (id = "continue")
    private WebElement botaoContinuar;

    @FindBy (id = "ap_password")
    private WebElement informarSenha;

    @FindBy (id = "signInSubmit")
    private WebElement botaoSubmit;

    //Login com sucesso.
    public void digitarEmail (String email) {
        informarEmail.sendKeys(email);
    }
    public void clicarContinuar (){

        botaoContinuar.click();
    }
    public void digitarSenha (String senha) {
        informarSenha.sendKeys(senha);
    }
    public void clicarSubmit () {
        this.botaoSubmit.submit();
    }


}





