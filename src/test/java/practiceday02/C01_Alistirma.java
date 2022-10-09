package practiceday02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Alistirma {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //https://www.gmibank.com/ sayfasina gidin
        driver.get("https://www.gmibank.com");

        // Sign in butonuna tiklayin
        driver.findElement(By.xpath("(//*[@class='dropdown-toggle nav-link'])[2]")).click();
        driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();


        //Usename:Batch81,Password:Batch81+
        driver.findElement(By.cssSelector("#username")).sendKeys("Batch81");
        driver.findElement(By.cssSelector("#password")).sendKeys("Batch81+", Keys.ENTER);

        driver.close();






    }
}
