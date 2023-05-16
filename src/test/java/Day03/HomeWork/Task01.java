package Day03.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
/*• Set Path.
            • Create chrome driver.
• Maximize the window.
• Open google home page https://www.google.com/
            • Verify that you are Google in the title.*/
   @Test
   public void task1() {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      String actualTitle = driver.getTitle();
      Assert.assertEquals("Google", actualTitle);
      driver.close();


   }

}
