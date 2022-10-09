package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utulities.TestBaseBeforeAfter;

import java.io.File;

public class C04_GetScreenshot extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        // amazon sayfasina gidelim tum sayfanin resmini alalım
        driver.get("https://amazon.com");
        TakesScreenshot ts=(TakesScreenshot)driver;

        File tumSayfaResmi =ts.getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(tumSayfaResmi,new File(""));
    }
}
