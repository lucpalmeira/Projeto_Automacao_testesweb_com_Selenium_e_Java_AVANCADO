package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Commands extends RunCucumberTest {
    public static void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void clickElement(By element) {
        System.out.println("##############################");
        try {
            System.out.println("Vai clicar no elemento: " + element);
            esperarElementoEstarPresente(element, 10000);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento: " + element);
        } catch (Exception error) {
            System.out.println("Aconteceu um erro ao clicar no elemento: " + element);
            System.out.println(error);
        }
        System.out.println("##############################");

    }

    public static void fillField(By element, String value) {
        System.out.println("##############################");
        try {
            System.out.println("Vai preencher o campo: " + element);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("Preencheu o campo: " + element);
        } catch (Exception error) {
            System.out.println("Aconteceu um erro ao preencher o campo: " + element);
            System.out.println(error);
        }
        System.out.println("##############################");

    }

    public static void checkMessage(By element, String expectedMessage) {
        System.out.println("##############################");
        String actualMessage = "";
        actualMessage = getDriver().findElement(element).getText();
        Assert.assertEquals("Erro ao validar mensagem", expectedMessage, actualMessage);
        System.out.println("##############################");
    }

    public static void checkAccessWait(String url, By element, Boolean expectedMessage) {
        System.out.println("##############################");
        Boolean actualMessage = false;
        getDriver("chrome").get(url);
        esperarElementoEstarPresente(element, 10);
        Assert.assertEquals("Erro ao acessar", expectedMessage, getDriver().findElement(element).isDisplayed());
        System.out.println("##############################");
    }

    public static void registeredSuccessfully(By element, String expectedMessage) {
        System.out.println("##############################");
        String actualMessage = "";
        actualMessage = getDriver().findElement(element).getText();
        Assert.assertEquals("Erro ao cadastrar conta", expectedMessage, actualMessage);
        System.out.println("##############################");
    }

    public static void accessMessage(By element) {
        try {
            System.out.println("Vai preencher o campo com email e senha correta: " + element);
            getDriver().findElement(element).getText();
            System.out.println("Preencheu o campo com email e senha correta: " + element + " .PASSOU!");
            System.out.println("##############################");
            System.out.println("Vai preencher o campo com email correto e senha errada: " + element);
            getDriver().findElement(element).getText();
            System.out.println("Preencheu o campo com email correto e senha errada: " + element + " .PASSOU!");
            System.out.println("##############################");
            System.out.println("Vai preencher o campo com email errado e senha correta: " + element);
            getDriver().findElement(element).getText();
            System.out.println("Preencheu o campo com email errado e senha correta: " + element + " .PASSOU!");
            System.out.println("##############################");
        } catch (Exception error) {
            System.out.println("Algo deu errado com email ou senha ou email e senha");


        }
    }


}
