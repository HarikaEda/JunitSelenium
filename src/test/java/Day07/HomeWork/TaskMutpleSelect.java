package Day07.HomeWork;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class TaskMutpleSelect extends Base {
   /* Go to URL: https://demoqa.com/select-menu
    Select options in Standard multiple select*/
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement cars = driver.findElement(By.id("cars"));
        Select select = new Select(cars);
        select.selectByIndex(3);
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("saab");
        Thread.sleep(2000);
        select.selectByVisibleText("Opel");
        Thread.sleep(2000);
        List<WebElement> options = select.getOptions();
        List<String> optionvalues = options.stream().map(x -> x.getAttribute("value")).collect(Collectors.toList());
        System.out.println(optionvalues);// [volvo, saab, opel, audi]
    }
@Test
        public void test2() {
    driver.get("https://demoqa.com/select-menu");
    WebElement cars = driver.findElement(By.xpath("//select[@name = 'cars']"));
    Select select = new Select(cars);
    select.selectByValue("volvo");
    select.selectByVisibleText("Saab");
    select.selectByValue("opel");
    select.selectByIndex(3);
}
    @Test
    public void multipleSelectTest2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars = driver.findElement(By.xpath("//select[@name = 'cars']"));
        Select select = new Select(cars);
        if(select.isMultiple()) {
            select.selectByIndex(1);
            Thread.sleep(2000);
            select.selectByIndex(2);
            Thread.sleep(2000);
            select.selectByValue("opel");
            Thread.sleep(2000);
        }


        }






    }

