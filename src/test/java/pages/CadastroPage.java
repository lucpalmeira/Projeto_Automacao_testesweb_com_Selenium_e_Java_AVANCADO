package pages;


import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

import static support.Commands.*;

public class CadastroPage extends RunCucumberTest {


    String URL = "http://lojaebac.ebaconline.art.br/minha-conta/";
    public By criandoNovoEmail = By.id("reg_email");
    public By criandoNovaSenha = By.id("reg_password");
    public By cadastroFeito = By.cssSelector("#customer_login > div:nth-child(2) > form > p:nth-child(4) > input.button");
    public By esperaBotao = By.cssSelector("#customer_login > div:nth-child(2) > form > p:nth-child(4) > input.button");
    public By verMinhaConta = By.cssSelector("#tbay-breadscrumb > div > div > ol > li.active");


    public void paginaCadastro() {
        checkAccessWait(URL, esperaBotao, true);
    }

    public void cadastraEmail() {
        fillField(criandoNovoEmail, Utils.getRandomEmail());
    }

    public void cadastraSenha() {
        fillField(criandoNovaSenha, Utils.getRandomSenha());
    }

    public void clicaCadastrar() {
        clickElement(cadastroFeito);
    }

    public void cadastroSucesso() {
        registeredSuccessfully(verMinhaConta, "Minha Conta");
    }


}
