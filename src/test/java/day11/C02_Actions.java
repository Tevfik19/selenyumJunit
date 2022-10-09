package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.TestBaseBeforeAfter;

public class C02_Actions extends TestBaseBeforeAfter {

    @Test
    public void test1() {

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        // 2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("(//*[@class='_6ltg'])[2]")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
       // Actions actions=new Actions(driver); bu objeyide utulities de extend ettik
        WebElement isim=driver.findElement(By.xpath("(//*[@type='text'])[2]"));

    //    actions.click(isim).sendKeys("Tevfik") bu sekilde baslayablir 25 satirdan devam edebiliriz
        isim.sendKeys("Tevfik");
        actions.sendKeys(Keys.TAB).
                sendKeys("Aykac").
                sendKeys(Keys.TAB).
                sendKeys("aykac@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("aykac@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("544").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys("1").sendKeys(Keys.TAB).sendKeys("Tem").
                sendKeys(Keys.TAB).sendKeys("1982").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.RIGHT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                      .sendKeys(Keys.ENTER).perform();

        // 4- Kaydol tusuna basalim
    }
}
