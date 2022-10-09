package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertions {

   // Bir Class olusturalim YanlisEmailTesti
    //    http://automationpractice.com/index.php sayfasina gidelim
    //    Sign in butonuna basalim
    //    Email kutusuna @isareti olmayan bir mail yazip enter’a
    //    bastigimizda “Invalid email address” uyarisi ciktigini test edelim
   static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationpractice.com/index.php");

    }

    @AfterClass
    public static void tearDown(){
        // driver.close();
    }
    @Test
    public void test1(){
        //http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");
        //    Sign in butonuna basalim
        driver.findElement(By.xpath("//*[@class='login']")).click();
        //    Email kutusuna @isareti olmayan bir mail yazip enter’a
        WebElement emailKutusu= driver.findElement(By.xpath("//*[@id='email_create']"));
        emailKutusu.sendKeys("aykacgmail.com", Keys.ENTER);

        //    bastigimizda “Invalid email address” uyarisi ciktigini test edelim
        WebElement uyariYazisi=driver.findElement(By.id("create_account_error"));


        //1.yol
        //  Assert.assertTrue(uyariYazisi.isDisplayed());

        //2.yol
        String  gercekYazi= uyariYazisi.getText();
        String beklenUyari="Invalid email address";
        Assert.assertTrue(gercekYazi.contains(beklenUyari));



    }

}
