package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownLoad extends Base {
   @Test
   public void test() throws Exception {
      /* Go to URL:https://the-internet.herokuapp.com/download
       Login page valid credentials.
       Download sample CSV file.
       Verify if the file downloaded successfully.*/
driver.get("https://the-internet.herokuapp.com/download");
driver.findElement(By.xpath("//h3[.='File Downloader']")).click();
Thread.sleep(2000);

//download location
String path=System.getProperty("user.home")+
        System.getProperty("file.separator")+
        "Downloads"+
        System.getProperty("file.separator")+
        "testing.pdf";
boolean isExist= Files.exists(Paths.get(path));
Assert.assertTrue(isExist);
driver.quit();







   }



}
