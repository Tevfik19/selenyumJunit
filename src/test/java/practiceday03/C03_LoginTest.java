package practiceday03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LoginTest {
    //https://qa-environment.koalaresorthotels.com/
    //https://www.koalaresorthotels.com/ sayfasina gidiniz
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1(){
        driver.get("https://www.koalaresorthotels.com/");

        //login
        driver.findElement(By.xpath("(//*[@class='nav-link'])[7]")).click();
      //driver.findElement(By.cssSelector("#navLogon")).click();
      //driver.findElement(By.xpath("//*[@id='navLogon']")).click();
      //driver.findElement(By.xpath("//*[text()='Log in']")).click();
        //login ekranina girdiginizi 4 farkli web elementi kullanarak dogrulayiniz
        //1
      //  Assert.assertTrue(driver.getTitle().contains("Log in") );
//2
        String expectedUrl="https://www.koalaresorthotels.com/Account/Logon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals("Login Ekranina Giris Yapilmadi",expectedUrl,actualUrl);

        // III)
        WebElement L3=driver.findElement(By.xpath("//*[@id='btnSubmit']"));
        Assert.assertTrue(L3.isDisplayed());


        // IV)

        Assert.assertTrue("URL yanlis", driver.getCurrentUrl().contains("Logon"));

        /*
        asserttrue --> dogruysa  onayla geç,      yanlişsa çalışma dur, hata ver, notumu goster.
assertFalse --> yanlışsa onayla geç,     doğruysa çalışma dur, hata ver, notumu goster
assertEquals --> eşitse onayla gec,    eşit değilse çalışma dur, hata ver, notumu goster
assertNotEquals --> eşit değilse onayla geç,     eşitse çalışma dur, hata ver, notumu goster.
         */
    }
}
