package day11;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeAfter;

public class C03_Faker extends TestBaseBeforeAfter {
    @Test
    public void test() {
        //"https://facebook.com"  Adresine gidin
        driver.get("https://www.facebook.com");
        //“create new account”  butonuna basin
        driver.findElement(By.xpath("(//*[@class='_6ltg'])[2]")).click();
        //“firstName” giris kutusuna bir isim yazin
        Faker faker=new Faker();
        WebElement isim=driver.findElement(By.xpath("(//*[@type='text'])[2]"));
        String email=faker.internet().emailAddress();// Aynı mail adresini girmesi için String bir değişkene atama yaptık
        /*
        Faker classını kullanma amacımız form doldurmamız gereken web sitelerde defalarca kendi üreteceğimiz veriler yerine
        bizim için rondom veriler üretir ve işimizi kolaylaştırır
        Faker classını kullanmak için mvnrepository.com adresinden java-faker kütüphanesini aratır ve ençok kullanılanı
        pom.xml dosyamıza ekleriz. Ve faker class'ından bir obje oluşturup;
        email için faker.internet() methodunu kullanarak emailAddress() methodunu seçeriz.
        password içinde aynı internet methodunu kullanırız.
        İsim ve soyisimler için faker.name() methodu ile firstname() ve lastname() methodunu kullanırız
         */

        actions.click(isim).sendKeys(faker.name().firstName())
        .sendKeys(Keys.TAB).
        sendKeys(faker.name().lastName()).
        sendKeys(Keys.TAB).
        sendKeys(email).
        sendKeys(Keys.TAB).
        sendKeys(email).
        sendKeys(Keys.TAB).
        sendKeys(faker.internet().password()).
        sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys("1").sendKeys(Keys.TAB).sendKeys("Tem").
        sendKeys(Keys.TAB).sendKeys("1982").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys(Keys.RIGHT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        .sendKeys(Keys.ENTER).perform();
        //“surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin
        //“email” onay kutusuna emaili tekrar yazin
        //Bir sifre girin
        //Tarih icin gun secin
        //Tarih icin ay secin
        //Tarih icin yil secin
        //Cinsiyeti secin
        //Kaydol butonuna basın
        //Sayfayi kapatin
    }
}
