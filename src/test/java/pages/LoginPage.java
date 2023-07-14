package pages;


import org.openqa.selenium.By;
import runner.RunCucumberTest;
import static support.Commands.*;


public class LoginPage extends RunCucumberTest {


    private String url = "http://lojaebac.ebaconline.art.br/minha-conta/";
    public By create_email_field = By.id("username");
    public By create_password_field = By.id("password");
    public By creating_button_click = By.className("button");
    public By creating_success_access = By.className("page-title");
    public By creating_logout_click = By.cssSelector("#tbay-topbar > div > div > div > ul > li:nth-child(2) > a");
    public By creating_wrong_password = By.className("woocommerce-error");
    public By creating_wrong_email = By.className("woocommerce-error");
    public By waitSite = By.id("customer_login");


    public void acessarPagina() {
        checkAccessWait(url, waitSite, true);
    }

    public void inserirEmail() {
        fillField(create_email_field, "test@test.com");
    }

    public void inserirSenha() {
        fillField(create_password_field, "123456");
    }

    public void clicarNoBotao() {

        clickElement(creating_button_click);
    }

    public void acessoSucesso() {
        accessMessage(creating_success_access);
    }

    public void logout() {
        clickElement(creating_logout_click);
    }

    public void inserirSenhaErrada() {
        fillField(create_password_field, "1234567");
    }

    public void mensagemSenhaIncorreta() {
        accessMessage(creating_wrong_password);
    }

    public void inserirEmailErrado() {
        fillField(create_email_field, "test@test.comx");
    }

    public void mensagemEmailIncorreto() {
        accessMessage(creating_wrong_email);
    }


}
