package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeAfter;

public class A04IframevDeneme extends TestBaseBeforeAfter {

    @Test
    public void test1(){
        driver.get("https://html.com/tags/iframe/");
        // List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        WebElement iframemiz = driver.findElement
                (By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframemiz);
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
        driver.switchTo().defaultContent();//girilen ıframe den cikmak icin kullanilir
        driver.switchTo().parentFrame();// ic ice ıframe lerde bir usttekine gecmek icin kullanilir
        driver.findElement(By.linkText("Adam Wood")).click();
    }
}
