package org.texo.page;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.texo.steps.Hook.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FormularioPage {

    public FormularioPage() {
		
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement cookies;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement campoNome;

    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement campoSobrenome;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement campoEmail;

    @FindBy(xpath = "//*[@id='contact']/form/div/div/div[1]/div[2]/div/div[4]/div[1]")
    private WebElement campoSetor;

    @FindBy(xpath = "//*[@id='contact']/form/div/div/div[1]/div[2]/div/div[4]/div[2]/div[1]/span")
    private WebElement bancoVarejo;

    @FindBy(xpath = "//*[@id='contact']/form/div/div/div[1]/div[2]/div/div[5]/textarea")
    private WebElement campoMenssagem;

    @FindBy(xpath = "//*[@id='contact']/form/div/div/div[1]/div[2]/div/button")
    private WebElement botaoEnviar;

    @FindBy(xpath = "//*[@id='contact']/form/div/div/div[1]/div[2]/div/div[2]")
    private WebElement textoValidar;

    public void preencherFormulario(){
        cookies.click();
        campoNome.sendKeys("TESTE GFT");
        campoSobrenome.sendKeys("Davi Goncalves");
        campoEmail.sendKeys("teste@gft.com");
        campoSetor.click();        
        bancoVarejo.click();
        campoMenssagem.sendKeys("TESTE GFT");
    }

    public void enviarContato(){        
        botaoEnviar.click();
    }

    public void validarEnvio() throws InterruptedException{
        //Inseri a Thread de 5 segundos apenas para dar tempo de mostrar a validação no teste
        Thread.sleep(5000);

        String texto = textoValidar.getText();
        assertEquals("Obrigado! A equipe da GFT entrará em contato com você em breve.", texto);
       
    }
    
}
