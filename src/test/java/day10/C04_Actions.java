package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04_Actions extends TestBaseBeforeAfter {

    @Test
    public void test1(){
        //Yeni bir class olusturalim: MouseActions1
        //https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // 3- Cizili alan uzerinde sag click yapalim
        WebElement ciziliAlan =driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions actions=new Actions(driver);
        actions.contextClick(ciziliAlan).perform();// contextClick(ciziliAlan) sag click yapar
        //Alert’te cikan yazinin “You selected a context menu” oldugunu test edelim
        String expectedAlertyazisi="You selected a context menu";
        String actualAlertyazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertyazisi,actualAlertyazisi);
        //2.yol
        //  Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

        //Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        driver.navigate().refresh();
        //Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String>windowlist=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowlist.get(1));
        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        Assert.assertEquals("Elemental Selenium",driver.findElement(By.xpath("//h1")).getText());


    }
}
