package Day03.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    /*Go to Amazon homepage.
     Do the following tasks by creating 2 different test methods.
        1- Test if the URL contains Amazon.
        2- Test if the title does not contain Facebook.*/
    @Test
public void task2(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    String actualUrl = driver.getCurrentUrl();
    Assert.assertTrue(actualUrl.contains("amazon"));
    driver.close();

    }
    @Test
    public void task3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String actualTitle = driver.getTitle();
        Assert.assertFalse(actualTitle.contains("facebook"));
        driver.quit();


    }


}
