package Day04.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.*/
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("Green Mile");
        element.submit();
        System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());



    }
    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("Premonition");
        element.submit();
        System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());


    }
    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("The Curious Case of Benjamin Button");
        element.submit();
        System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());


    }
}