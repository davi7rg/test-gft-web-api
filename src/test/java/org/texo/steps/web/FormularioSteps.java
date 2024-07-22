package org.texo.steps.web;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

import org.texo.page.FormularioPage;
import static org.texo.steps.Hook.driver;

public class FormularioSteps extends FormularioPage {

    @Dado("que acesso a pagina do formulario {string}")
    public void queAcessoAPagina(String url){
        driver.get(url);
    }

    @E("preencha o formulario na página")
    public void preenchoFormulario(){
        preencherFormulario();
    }

    @Quando("clico no botao enviar")
    public void enviarFormularioContato(){
        enviarContato();
    }

    @Então("valido que o contato foi enviado corretamente")
    public void validarContatoEnviado() throws InterruptedException{
        validarEnvio();
    }
    
}
