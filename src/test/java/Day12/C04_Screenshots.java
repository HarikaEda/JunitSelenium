package Day12;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

public class C04_Screenshots extends Base {
    @Test
    public void test() throws IOException {
   //ekran görüntüsü alma objesi oluşturuyoruz
      driver.get("https://www.linkedin.com/");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./test-output/photo.png"));
        //"./test-output/photo.png" bu adresi biz dosya oluşturmak için kendimiz elle ayzdık
        //FileHandler.copyFile(source,new File("./test-output/photo2.png")); 2.yol




    }




}
