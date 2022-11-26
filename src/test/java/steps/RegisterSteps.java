package steps;

import ResgiterTest.ResgisterPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    ResgisterPage resgisterPage;

    @Before("@register")
    public void abrirBrowser() {
        driver = new ChromeDriver(); // Instanciar ( Chamar Driver ).
        driver.manage().window().maximize();  // Menssagem para maximizar a tela
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Duração
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

    }
    @After("@register")
public void fecharBrowser (){
        driver.quit();
}
@AfterStep("@register")

public void print(){
    TakesScreenshot screenshot = ((TakesScreenshot) driver); // Convertendo o driver em TakesScreenshot
    byte[] printBytes = screenshot.getScreenshotAs(OutputType.BYTES);
    InputStream printStream = new ByteArrayInputStream(printBytes);
    Allure.addAttachment("CEP",printStream);

}
        @Dado("que eu acesso o site Register.")
        public void queEuAcessoOSiteRegister () {
            driver.get("https://demo.automationtesting.in/Register.html"); // Acessar o navegador
        }

        @Quando("preencho o campo nome com um valor {string}")
        public void preenchoOCampoNomeComUmValor (String nome){
            resgisterPage = new ResgisterPage(driver);
            resgisterPage.PreencherNome(nome);
        }

        @E("preencho o campo sobrenome com um valor {string}")
        public void preenchoOCampoSobrenomeComUmValor (String sobrenome){
        resgisterPage.PreencherSobrenome(sobrenome);
        }

        @E("preencho o campo do endereço com um valor {string}")
        public void preenchoOCampoDoEndereçoComUmValor (String endereco){
        resgisterPage.PreencherEndereço(endereco);
        }

        @E("preencho o campo do Email com um valor {string}")
        public void preenchoOCampoDoEmailComUmValor (String email){
        resgisterPage.PreencherEmail(email);
        }

        @E("preencho o numero do telefone com o valor {string}")
        public void preenchoONumeroDoTelefoneComOValor (String telefone){
       resgisterPage.PreencherTelefone(telefone);
        }

        @E("clico no checbox Male")
        public void clicoNoChecboxMale () {
        resgisterPage.PreencherHobbe();
        }

        @E("clico no checbox Movies")
        public void clicoNoChecboxMovies () {
        resgisterPage.PreencherGender();
        }

        @E("seleciono a Skills {string}")
        public void selecionoASkills (String skills){
        resgisterPage.PreencherSkills(skills);
        }

        @E("seleciono um country")
        public void selecionoUmCountry () {
        resgisterPage.clicarCountry();
        }

        @E("seleciono o ano {string}, o mês {string} e o dia {string}")
        public void selecionoOAnoOMêsEODia (String ano, String mes, String dia){
        resgisterPage.PreencherAno("1988");
        resgisterPage.PreencherMes("June");
        resgisterPage.PreencherDia("28");
        }

        @E("preencho o campo Passwor com um valor {string}")
        public void preenchoOCampoPassworComUmValor (String senha){
       resgisterPage.PreencherPasswor("947831489");
        }

        @E("preencho o campo Confirmação com um valor {string}")
        public void preenchoOCampoConfirmaçãoComUmValor (String comfirmacaoSenha){
        resgisterPage.PreencherSenha("947831489");
        }
    }

