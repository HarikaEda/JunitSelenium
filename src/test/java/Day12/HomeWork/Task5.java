package Day12.HomeWork;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Task5 extends Base {
  /*Go to n11.com.
Take Full Page Screenshot.
Take Page ScreenShot.
Spesific WebElement ScreenShot*/
    @Test
    public void test() throws IOException {
        driver.get("https://www.n11.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//img[@src='https://n11scdn.akamaized.net/a1/1180_440/23/05/02/74/33/91/94/76/17/37/31/99/18365145164747289117.jpg']"));
        element.click();
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(System.getProperty("user.dir")+"\\src\\main\\resources\\"));








    }






}
