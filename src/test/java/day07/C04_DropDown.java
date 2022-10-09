package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C04_DropDown {
    /*
1- Bir class oluşturun: DropDown
2- https://the-internet.herokuapp.com/dropdown adresine gidin.
3- Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
4- Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
5- Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
6- Tüm dropdown değerleri(value) yazdırın
7- Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse False yazdırın.
  */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void Test1() {
        //  https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //3- Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement ddm=driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());//.getFirstSelectedOption() en son sectigimiz option u getirir

        //4- Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
     select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());// bu kez de son sectigimiz  selectByValue("2"); olduugn
        //5- Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        //6- Tüm dropdown değerleri options lari yazdırın
        System.out.println("***********");
        List<WebElement> tumOpsionlar=select.getOptions();
        for (WebElement w:tumOpsionlar
             ) {
            System.out.println(w.getText());

        }
        //7- Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse False yazdırın.
        int dropDownBoyut=tumOpsionlar.size();
        if (dropDownBoyut==4){
            System.out.println("true");

        }else System.out.println("false");

    }
}
