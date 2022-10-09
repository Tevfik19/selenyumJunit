package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utulities.TestBaseBeforeAfter;

import java.time.Duration;

public class C03_BeklemeMethodlari extends TestBaseBeforeAfter {

    @Test
    public void test() {
        // 2. Iki tane metod olusturun : implicitWait() , explicitWait()
//    Iki metod icin de asagidaki adimlari test edin.

// 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
// 4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
// 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
        Assert.assertTrue(driver.findElement(By.id("flash-messages")).isDisplayed());


// 6. Add buttonuna basin
        driver.findElement(By.xpath("//*[text()='Add']")).click();
// 7. It's back mesajinin gorundugunu test edin
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='message']")).isDisplayed());

    }//implicitly wait testten once calsitirilir ve calistirilan testin tamamina etki eder
    //explicitly wait ise once obje olarak olusturulur sonra
    // sadece kullanildigi yerde ve belirlenen sarta gore calisir yıne max bekleme suresi koruz ancak islem bitincede islemi tmmlar
    // class yada test in tamamina uygulanmaz

    @Test
    public void explicitWaitTest() {
        // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
// 4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();
// 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement itsGoneWE=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        Assert.assertTrue(driver.findElement(By.id("flash-messages")).isDisplayed());

// 6. Add buttonuna basin
        driver.findElement(By.xpath("//*[text()='Add']")).click();
// 7. It's back mesajinin gorundugunu test edin
WebElement itsBackWE=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
Assert.assertTrue(itsBackWE.isDisplayed());


    }
}
