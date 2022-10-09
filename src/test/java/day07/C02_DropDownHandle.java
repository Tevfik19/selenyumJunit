package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropDownHandle {
    /*
            ● Bir class oluşturun: C3_DropDownAmazon(acılır Pencere ) DropDown da tag olarak select gormemiz gerek
            ● https://www.amazon.com/ adresine gidin.
            - Test 1
            Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
            oldugunu test edin
            -Test 2
            1. Kategori menusunden Books secenegini secin
            2. Arama kutusuna Java yazin ve aratin
            3. Bulunan sonuc sayisini yazdirin
            4. Sonucun Java kelimesini icerdigini test edin
       */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // ● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");;
    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void Test1() {

        //- Test 1
        //  Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //  oldugunu test edin
        WebElement menu = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(menu);
        List<WebElement> listMenu = select.getOptions();
        int adet = listMenu.size();
        Assert.assertFalse(adet == 45);
        //1. Kategori menusunden Books secenegini secin
        WebElement ddm = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        ddm.sendKeys("Computers");
    }
}
