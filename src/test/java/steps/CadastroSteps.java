package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("^que estou na tela de cadastro de usuário$")
    public void que_estou_na_tela_de_cadastro_de_usuário() {
        cadastroPage.paginaCadastro();
    }

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_todos_os_campos_obrigatórios() {
        cadastroPage.cadastraEmail();
        cadastroPage.cadastraSenha();

    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {

        cadastroPage.clicaCadastrar();
    }

    @Então("^vejo mensagem minha conta$")
    public void vejo_mensagem_minha_conta() {
        cadastroPage.cadastroSucesso();
    }

}
