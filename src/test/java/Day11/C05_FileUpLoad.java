package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.imageio.spi.ImageInputStreamSpi;
import java.util.LinkedList;

public class C05_FileUpLoad extends Base {
    @Test
    public void fileUpload() {
        //Go to URL: https://the-internet.herokuapp.com/upload
        //Find the path of the file that you want to upload.
        //Click on Upload button.
        //Verify the upload message.

        driver.get("https://the-internet.herokuapp.com/upload");

        String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "fileExists.txt";

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();

        WebElement infoMessage = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(infoMessage.isDisplayed());
       //locator geçmez failed olursa findelements ile hatayı handle etmeye çalışırız
       // List<WebElement> infoMessage= driver.findElements(By.xpath("//h3[.='']"));
       // Assert.assertEquals(1,infoMessage.size(),1);
       // Assert.assertTrue("",infoMessage.get(0).isDisplayed());
       //bu kısmı daha sonra tekrar göreceğiz...

    }
}


