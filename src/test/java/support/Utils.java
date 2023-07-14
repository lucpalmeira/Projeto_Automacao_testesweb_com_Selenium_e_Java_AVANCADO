package support;

import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {


    public static String getRandomEmail() {
        String email_init = "testando_";
        String email_final = "@test.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo - minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String getRandomSenha() {
        String senha_init = "ABCxyz";
        String senha_final = "@#$&";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo - minimo) + minimo;

        return senha_init + resultado + senha_final;
    }


}
