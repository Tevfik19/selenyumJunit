package odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A01_Odev01 {
      /*
        1. http://zero.webappsecurity.com/ Adresine gidin
        2. Sign in butonuna basin
        3. Login kutusuna "username" yazin
        4. Password kutusuna "password." yazin
        5. Sign in tusuna basin
        6. Pay Bills sayfasina gidin
        7. "Purchase Foreign Currency" tusuna basin
        8. "Currency" drop down menusunden Eurozone'u secin
        9. "amount" kutusuna bir sayi girin
        10. "US Dollars" in secilmedigini test edin
        11. "Selected currency" butonunu secin
        12. "Calculate Costs" butonuna basin sonra "purchase" butonuna basin
        13. "Foreign currency cash was successfully purchased." yazisinin ciktigini kontrol edin.
         */
      public static void main(String[] args) {
          WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          //  1. http://zero.webappsecurity.com/ Adresine gidin
          driver.get("http://zero.webappsecurity.com/");
          //        2. Sign in butonuna basin
          driver.findElement(By.xpath("//*[@id='signin_button']")).click();
          //        3. Login kutusuna "username" yazin
driver.findElement(By.xpath("//*[@name='user_login']")).sendKeys("username");
          //        4. Password kutusuna "password." yazin
          driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
          //        5. Sign in tusuna basin

          //        6. Pay Bills sayfasina gidin
          //        7. "Purchase Foreign Currency" tusuna basin
          //        8. "Currency" drop down menusunden Eurozone'u secin
          //        9. "amount" kutusuna bir sayi girin
          //        10. "US Dollars" in secilmedigini test edin
          //        11. "Selected currency" butonunu secin
          //        12. "Calculate Costs" butonuna basin sonra "purchase" butonuna basin
          //        13. "Foreign currency cash was successfully purchased." yazisinin ciktigini kontrol edin.

      }


}
