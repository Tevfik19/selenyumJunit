package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeAfter;

import java.util.List;

public class A04_OdevIframe extends TestBaseBeforeAfter {
    @Test
    public void test1() {


        //http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home");
        //sayfadaki iframe sayısını bulunuz.

        List<WebElement> Iframe = driver.findElements(By.tagName("iframe"));
        System.out.println("iframe sayısı = " + Iframe.size());

        //ilk iframe'deki (Youtube) play butonuna tıklayınız.

        //ilk iframe'den çıkıp ana sayfaya dönünüz
        //ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html)
        //tıklayınız

        /*
        sorunun cozumu
          @Test
    public void test1() throws InterruptedException {
   //     1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
  //      2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> Iframe = driver.findElements(By.tagName("iframe"));
        System.out.println("iframe sayısı = " + Iframe.size());
//        3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        String acilacakIframe = driver.findElement(By.xpath("(//*[@frameborder='0'])[1]")).getText();
        driver.switchTo().frame(Iframe.get(0));
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
        Thread.sleep(5000);
//         4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
//5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().frame(Iframe.get(1));
        driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
        //ana sayfaya dönün(hash code)
        List<String> hashListesi = new ArrayList<>(driver.getWindowHandles());
Thread.sleep(3000);
        driver.switchTo().window(hashListesi.get(0));
    }
         */

    }


}
