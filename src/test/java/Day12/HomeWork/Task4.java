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

public class Task4 extends Base {
/*Go to amazon.com.
Take Page ScreenShot.
Spesific WebElement ScreenShot*/
    @Test
    public void test() throws IOException {
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    TakesScreenshot ts=(TakesScreenshot)driver;
    WebElement photo=driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2022/February/DashboardCards/Fuji_dash_dress_1X._SY304_CB626369146_.jpg']"));
    FileUtils.copyFile(photo.getScreenshotAs(OutputType.FILE),new File("src/test/resources/screenshots/task4.png"));
    File source=ts.getScreenshotAs(OutputType.FILE);
/*    @Test
    public void takeFullPageSS() throws IOException {
        driver.get("https://www.amazon.com./");
        TakesScreenshot  ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy-MM-dd- hh-mm-ss").format(new Date());
        FileUtils.copyFile(source,new File(".\\test-output\\Screenshots"  + date + ".png"));
    }
    @Test
    public void takeSpesificWESS() throws IOException {
        driver.get("https://www.amazon.com./");
        WebElement amazonBox = driver.findElement(By.xpath("//div/span[@id = 'nav-cart-count']"));
        //TakesScreenshot  ts = (TakesScreenshot) driver;
        File source = amazonBox.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyy-MM-dd- hh-mm-ss").format(new Date());
        FileUtils.copyFile(source,new File(".\\test-output\\Screenshots\\amazonBox" + date + ".png"));
    }
}
*/













    }













}
