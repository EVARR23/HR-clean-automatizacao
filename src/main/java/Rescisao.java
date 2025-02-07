import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rescisao {


    @Test
    public  void pesquisarGoogle(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver-win64\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        navegar.get("https://www.mobills.com.br/calculadoras/calculadora-rescisao/");

        navegar.findElement(By.id("gross-salary-rescisao")).click();
        navegar.findElement(By.id("gross-salary-rescisao")).sendKeys("4.0000", Keys.ENTER);
        navegar.findElement(By.id("dt-contratacao")).sendKeys("30/01/2024", Keys.ENTER);
        navegar.findElement(By.id("dt-demissao")).sendKeys("30/01/2025", Keys.ENTER);
        navegar.findElement(By.id("reason-rescisao")).sendKeys("Dispensa sem justa causa", Keys.ENTER);
        navegar.findElement(By.id("notice-rescisao")).sendKeys("Indenizado pelo empregador", Keys.ENTER);

         navegar.findElement(By.id("close_button_icon")).click();
         navegar.findElement(By.id("btn-clean-recisao")).click();

        navegar.findElement(By.cssSelector("a[href^='https://api.whatsapp.com/send']")).click();

        navegar.findElement(By.id("action-button")).click();


    }
    }



