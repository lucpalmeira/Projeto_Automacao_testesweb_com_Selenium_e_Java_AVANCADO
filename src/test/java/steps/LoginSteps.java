package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que eu esteja na página de login do site ebac$")
    public void que_eu_esteja_na_página_de_login_do_site_ebac() {
        loginPage.acessarPagina();

    }

    @Quando("^insiro meu email e senha$")
    public void insiro_meu_email_e_senha() {
        loginPage.inserirEmail();
        loginPage.inserirSenha();
    }

    @Quando("^clico no botão login$")
    public void clico_no_botão_login() {
        loginPage.clicarNoBotao();
    }

    @Então("^eu vejo minha conta$")
    public void eu_vejo_minha_conta() {
        loginPage.acessoSucesso();
        loginPage.logout();
    }

    @Quando("^insiro meu email e senha errada$")
    public void insiro_meu_email_e_senha_errada() {
        loginPage.inserirEmail();
        loginPage.inserirSenhaErrada();
    }

    @Então("^eu vejo a mensagem de erro$")
    public void eu_vejo_a_mensagem_de_erro() {
        loginPage.mensagemSenhaIncorreta();
    }

    @Quando("^insiro meu email errado e senha$")
    public void insiro_meu_email_errado_e_senha() {
        loginPage.inserirEmailErrado();
        loginPage.inserirSenha();
    }

    @Então("^eu vejo a mensagem de erro de email$")
    public void eu_vejo_a_mensagem_de_erro_de_email() {
        loginPage.mensagemEmailIncorreto();
    }




}


