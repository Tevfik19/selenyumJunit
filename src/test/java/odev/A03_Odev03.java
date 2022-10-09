package odev;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeAfter;

public class A03_Odev03 extends TestBaseBeforeAfter {
    @Test
    public void test() {
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
