package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BeforeAfter {
    WebDriver driver;
    @Before
    public void setup(){
        // @Before kullaniyorsak method icin istedigimiz ismi kullanabiliriz ancak genel olarak kullanımı setUp seklindedir
        //@Before kullandığımızda testlerimizden önce yapmak zorunda oldugumuz driver objelerini yazmak yerine @Before ile bir kere yazarız
        //yani her testten önce burayı calıstır, sonra testlerimizi calıstır.
        // diğer testlerimizde rahat kullanabilmek icin bunu class seviyesinde tanımlamamız gerekir.
        //driver objesini direk kullanabilmek icin class seviyesine WebDriver driver yaz!!
        WebDriverManager.chromedriver().setup();
       driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void method1(){
        // bir defa before methodu calisir
        driver.get("https://amazon.com");
        //burada 1 defa da after methodu calısır.
    }
    @Test
    public void method2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //techproeducation sayfasina gidelim
        driver.get("https://www.techproeducation.com/");
    }
    @Test
    public void method3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //trendyol sayfasina gidelim
        driver.get("https://www.hepsiburada.com");
    }
    @After
    public void tearDown() {
        //en son kullanacağımız methodlar icin @After kullanırız.
        //bunu en basada atsak sıkıntı olmaz
        //genelde bunun icin method ismi tearDown kullanilir
        driver.quit();
    }
}
