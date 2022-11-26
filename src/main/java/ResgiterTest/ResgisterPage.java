package ResgiterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ResgisterPage {
    WebDriver driver;
                  // Medoto construtor (inicio).
    public ResgisterPage (WebDriver driverParametro){
        driver = driverParametro;
        // Medoto construtor (Fim).
    }
    private String firstName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input";
    private String lastName = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input";
    private String Adress = "//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea";
    private String emailAdress = "//*[@id=\"eid\"]/input";
    private String phone = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input";
    private String gender = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input";
    private String hobbies = "checkbox2";
    private String skills = "Skills";

    private String Country = "//*[@id=\"select2-country-results\"]/li[11]";
    private String selectCountry1 = "//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span";
    private String selectCountry2= "//*[@id=\"select2-country-results\"]/li[3]";
    private String year = "yearbox";
    private String month = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select";
    private String day = "daybox";
    private String PassWord = "//*[@id=\"firstpassword\"]";
    private String Senha = "secondpassword";


    public void PreencherNome(String Nome) {
        driver.findElement(By.xpath(firstName)).sendKeys(Nome); // Buscar texto.
    }

    public void PreencherSobrenome(String sobreNome) {
        driver.findElement(By.xpath(lastName)).sendKeys(sobreNome); // Buscar texto.
    }

    public void PreencherEndereço(String endereco) {
        driver.findElement(By.xpath(Adress)).sendKeys(endereco); // Buscar texto.
    }

    public void PreencherEmail(String email) {
        driver.findElement(By.xpath(emailAdress)).sendKeys(email); // Buscar texto.
    }

    public void PreencherTelefone(String telefone) {
        driver.findElement(By.xpath(phone)).sendKeys(telefone); // Buscar texto.
    }

    public void PreencherGender() {
        driver.findElement(By.xpath(gender)).click();
    }

    public void PreencherHobbe() {
        driver.findElement(By.id(hobbies)).click(); // Para clicar no objeto
    }

    public void PreencherSkills(String Java) {
        Select Skills = new Select(driver.findElement(By.id(skills)));
        Skills.selectByVisibleText(Java);
    }

    public void clicarCountry(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
        driver.findElement(By.xpath(selectCountry1)).click();
        driver.findElement(By.xpath(selectCountry2)).click();
    }

    public void PreencherAno(String Ano) {
        Select ano = new Select(driver.findElement(By.id(year)));
        ano.selectByVisibleText(Ano);
    }

    public void PreencherMes(String Mes) {
        Select mes = new Select(driver.findElement(By.xpath(month)));
        mes.selectByVisibleText(Mes);
    }

    public void PreencherDia(String diia) {
        Select dia = new Select(driver.findElement(By.id(day)));
        dia.selectByVisibleText(diia);
    }
    public void PreencherPasswor (String passWord){
        driver.findElement(By.xpath(PassWord)).sendKeys(passWord);
    }
    public void PreencherSenha (String senha){
        driver.findElement(By.id(Senha)).sendKeys(senha);
    }
}

