package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.TestBaseBeforeAfter;

public class A08_OdevWebTable extends TestBaseBeforeAfter {


    @Test
    public void login() {
        //https://qa-environment.concorthotel.com/admin/HotelRoomAdmin adresine gidin
        driver.get("https://qa-environment.concorthotel.com/admin/HotelRoomAdmin");
        //Username : manager  ○ Password : Manager2!

        Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//*[@id='details-button']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='UserName']"));
        actions.click(userName).sendKeys("manager").
                sendKeys(Keys.TAB).sendKeys("Manager1!").
                sendKeys(Keys.SPACE).perform();// Enter yerine Space kullandık ona basınca da giriyor


    }
    //table( ) metodu oluşturun

    @Test
    public void table() {


        //Tüm table body'sinin boyutunu(sutun sayisi) bulun. /tbody
        
        //Table'daki tum body'i ve başlıkları(headers) konsolda yazdırın.
        //printRows( ) metodu oluşturun //tr
        //table body'sinde bulunan toplam satir(row) sayısını bulun.
        //Table body'sinde bulunan satirlari(rows) konsolda yazdırın.
        //4.satirdaki(row) elementleri konsolda yazdırın.
        //printCells( ) metodu oluşturun //td
        //table body'sinde bulunan toplam hücre(cell) sayısını bulun.
        //Table body'sinde bulunan hücreleri(cells) konsolda yazdırın.
        //printColumns( ) metodu oluşturun
        //table body'sinde bulunan toplam sutun(column) sayısını bulun.
        //Table body'sinde bulunan sutunlari(column) konsolda yazdırın.
        //5.column daki elementleri konsolda yazdırın.
    }
}
