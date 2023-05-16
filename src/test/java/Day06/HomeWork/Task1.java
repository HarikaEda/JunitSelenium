package Day06.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*Go to https://the-internet.herokuapp.com/checkboxes
    Locate the elements of checkboxes.
    Then click on checkbox 1 if box is not selected.
    Then click on checkbox 2 if box is not selected.
    Then verify that checkbox 1 is checked.*/
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        Assert.assertFalse(checkbox1.isSelected());
        checkbox1.click();
        Assert.assertTrue(checkbox2.isSelected());
        checkbox2.click();
        Assert.assertTrue(checkbox1.isSelected());





    }
}