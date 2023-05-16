package Day04.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*Go to https://www.w3schools.com/
When we write an e-mail without the @ sign in the e-mail box and press enter.
Let's test the "Invalid email address" warning.*/
    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.id("modalusername"));
        button.sendKeys("hzdkvexample.com");
        button.submit();

    }

}
