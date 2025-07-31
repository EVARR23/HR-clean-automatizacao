import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Automationtesting {


    @Test
    public  void pesquisarGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver-win64\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        navegar.get("https://demo.automationtesting.in/Register.html");

        navegar.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Clarinda");
        navegar.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Gomes");
        navegar.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Rua das Flores, 123");
        navegar.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("teste@gmail.com");
        navegar.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("1282351425");
        navegar.findElement(By.cssSelector("input[ng-model='radiovalue']")).click();

        navegar.findElement(By.cssSelector("input[value='FeMale']")).click();
        navegar.findElement(By.cssSelector("input[value='Cricket']")).click();

        // Linguagens
        navegar.findElement(By.id("msdd")).click();
        navegar.findElement(By.xpath("//a[text()='Portuguese']")).click();
        navegar.findElement(By.xpath("//a[text()='English']")).click();
        navegar.findElement(By.cssSelector("body")).click(); // Fecha o menu

        // Skills
        Select skills = new Select(navegar.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        // País alternativo (select2)
        navegar.findElement(By.xpath("//span[@role='combobox']")).click();
        navegar.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
        navegar.findElement(By.xpath("//li[contains(text(),'India')]")).click();

        // Data de Nascimento
        Select year = new Select(navegar.findElement(By.id("yearbox")));
        year.selectByVisibleText("1990");

        Select month = new Select(navegar.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("May");

        Select day = new Select(navegar.findElement(By.id("daybox")));
        day.selectByVisibleText("10");

        // Senha
        navegar.findElement(By.id("firstpassword")).sendKeys("SenhaSegura123");
        navegar.findElement(By.id("secondpassword")).sendKeys("SenhaSegura123");

        // Botão de envio (não é necessário clicar para testar o preenchimento)
        // driver.findElement(By.id("submitbtn")).click();

        System.out.println("Todos os campos foram preenchidos com sucesso!");




    }
    }



