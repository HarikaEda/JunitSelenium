package Day12;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C05_ScreenShots extends Base {
    @Test
    public <FİLE> void test() throws IOException {
        driver.get("https://www.linkedin.com/");

        WebElement username = driver.findElement(By.id("session_key"));
        File source = username.getScreenshotAs(OutputType.FILE);

        String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
        //şu anki tarihi versin diye new date yaptık,ne zaman çalıştırırsak o zamanın date ini verecek
        //bu sayede screenshotlar hiçbir zaman birbirinin üzerine yazılmayacak
        System.out.println("date = " + date);

        String path = ".\\test-output\\screenshot"+ date +".png";
//screenshot dosyanın adı
        File destination = new File(path);
        FileHandler.copy(source, destination);
    }
}














