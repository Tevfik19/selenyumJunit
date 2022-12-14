package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.TestBaseBeforeAfter;

public class A06_Actions extends TestBaseBeforeAfter {
    @Test
    public void test() {
        //https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe");

        // video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //videoyu izlemek icin Play tusuna basin

      //  WebElement iframe=driver.findElement(By.xpath("//iframe[@width='560']"));
       // driver.switchTo().frame(iframe);
     //   WebElement playTusu= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
      //  playTusu.click();

        //videoyu calistirdiginizi test edin

        /*
        sorunun cozumu

          // 1 Bir Class olusturalim KeyboardActions2
        // 2 https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        // 3 video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        // 4 videoyu izlemek icin Play tusuna basin
        WebElement iframe=driver.findElement(By.xpath("//iframe[@width='560']"));
        driver.switchTo().frame(iframe);
       WebElement playTusu= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
       playTusu.click();
        // 5 videoyu calistirdiginizi test edin
        Assert.assertFalse("Video Calismadi : ",playTusu.isDisplayed());

         */

    }


}
