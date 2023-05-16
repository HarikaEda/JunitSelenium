package Day04.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
  /*Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the ORIGINAL CONTENTS
Click on Alerts
Print the URL
Navigate back
Print the URL
Click on Basic Ajax
Print the URL
Enter value 20 and Enter
And then verify Submitted Values is displayed open page
Close driver.*/

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element= driver.findElement(By.xpath("//a[@id='alerts']"));
        element.click();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.navigate().back();
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        WebElement element2= driver.findElement(By.xpath("//a[@id='basicajax']"));
        Thread.sleep(3000);
        element2.click();
        String url3= driver.getCurrentUrl();
        System.out.println(url3);
        driver.findElement(By.xpath("//input[@type='text' and @id='lteq30']")).sendKeys("20"+ Keys.ENTER );
        Thread.sleep(2000);
        WebElement display =driver.findElement(By.xpath("//div[@id='_id']//..//p"));
        Assert.assertTrue(display.isDisplayed());
        driver.quit();


    }
}