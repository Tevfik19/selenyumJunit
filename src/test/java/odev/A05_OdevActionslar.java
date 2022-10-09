package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeAfter;

public class A05_OdevActionslar extends TestBaseBeforeAfter {
    @Test
    public void test() throws InterruptedException {
        //1 "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");

        //  Hover over Me First" kutusunun ustune gelin
        WebElement hoverOver=driver.findElement(By.xpath("(//*[@class='dropbtn'])[1]"));
actions.moveToElement(hoverOver).perform();
        //Link 1" e tiklayin 1.yol
        actions.moveToElement(hoverOver).
                sendKeys(Keys.ARROW_DOWN).//aşağı ok(arrow) link bire tıklayin in birinci yolu
                click(hoverOver).perform();

        //Link 1" e tiklayin
        //2.yol
      // WebElement tikla =driver.findElement(By.xpath("(//*[text()='Link 1'])[1]"));
      //  tikla.click();
        Thread.sleep(3000);
        //Popup mesajini yazdirin
        System.out.println("popup mesaji = " + driver.switchTo().alert().getText());
        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //"Click and hold" kutusuna basili tutun
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement basVeTut = driver.findElement(By.xpath("//*[@id='click-box']"));
        actions.clickAndHold(basVeTut).perform();

        //7-"Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(basVeTut.getText());

        //8- "Double click me" butonunu cift tiklayin
        WebElement ciftTikla = driver.findElement(By.xpath("//*[text()='Double Click Me!']"));
        actions.doubleClick(ciftTikla).perform();



    }

}
