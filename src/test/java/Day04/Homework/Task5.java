package Day04.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
  /*Navigate to https://testpages.herokuapp.com/styled/indx.html
Click on Calculate under Micro Apps.
Type any number in the first input.
Type any number in the second input.
Click on Calculate.
Get the result.
Print the result.*/

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element = driver.findElement(By.id("calculatetest"));
        element.click();
        WebElement element2 = driver.findElement(By.id("number1"));
        element2.sendKeys("12");
        element2.submit();
        WebElement element3 = driver.findElement(By.id("number2"));
        element3.sendKeys("5");
        element3.submit();
        WebElement button = driver.findElement(By.id("calculate"));
        button.submit();
        WebElement yazdır = driver.findElement(By.xpath("//span[@id='answer']"));
        yazdır.click();
        System.out.println(yazdır.getText());






    }
}