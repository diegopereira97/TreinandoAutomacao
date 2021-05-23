package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPageObject {

    private WebDriver navegador;

    public CadastroPageObject(WebDriver navegador){
        PageFactory.initElements(navegador,this);
        this.navegador = navegador;
    }

    @FindBy(id = "ap_customer_name")
    private WebElement informarNome;

    @FindBy(id = "ap_email")
    private WebElement novoEmail;

    @FindBy(id = "ap_password")
    private WebElement informarNovaSenha;

    @FindBy(id = "ap_password_check")
    private WebElement confirmarNovaSenha;

    @FindBy(id = "continue")
    private WebElement submitNovaConta;



    public void digitarNome (String nome){
        informarNome.sendKeys(nome);}

    public void digitarNovoEmail (String novoEMail) {
        novoEmail.sendKeys(novoEMail);}

    public void digitarNovaSenha (String novaSenha) {
        informarNovaSenha.sendKeys(novaSenha);}

    public void confirmarSenha (String maisUmaVezSenha) {
        confirmarNovaSenha.sendKeys(maisUmaVezSenha);}

    public void submitCadastro (){
        submitNovaConta.submit(); }


}
