package Day06.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
/*Go to URL: https://demoqa.com/
Click on Elements.
Click on Checkbox.
Verify if Home checkbox is selected.
Verify that "You have selected" is visible*/

@Test
    public void task2(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/");
    driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
    //driver.findElement(By.xpath("//li[.='Check Box']")).isDisplayed();
    driver.findElement(By.xpath("//li[.='Check Box']")).click();
    WebElement home = driver.findElement(By.xpath("//span[@class='rct-title']\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n"));
    home.click();
    Assert.assertFalse(home.isSelected());


    WebElement visible = driver.findElement(By.xpath("//*[text()='You have selected :']"));
    Assert.assertTrue(visible.isDisplayed());
    driver.findElement(By.xpath("//*[text()='You have selected :']"));


    }







}
