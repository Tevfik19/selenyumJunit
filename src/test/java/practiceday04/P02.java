package practiceday04;

import org.junit.Assert;
import org.junit.Test;
import utulities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class P02 extends TestBaseBeforeAfter {
    @Test
    public void test() {
        //Verify that we have pom.xml file in our project => please try in 4 min s

          //  String dosyaYolu ="pom.xml";

            String path="C:\\com.Batch81JUnit\\pom.xml";
            Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
