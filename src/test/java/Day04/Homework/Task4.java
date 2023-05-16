package Day04.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    /*https://id.heroku.com/login sayfasına gidiniz.
 Bir mail adresi giriniz.
 Bir password giriniz.
 Login butonuna tıklayınız.
 "There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
 Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
 Tüm sayfaları kapatınız.*/
    @Test
            public void login() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://id.heroku.com/login");

        WebElement emailText = driver.findElement(By.xpath("//input[@id = 'email']"));
        emailText.sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@name = 'commit']")).submit();
        WebElement gorunenText = driver.findElement(By.xpath("//div[.='There was a problem with your login.']"));
        String s = gorunenText.isDisplayed() ? "kayit yapilamadi " + gorunenText.getText()  : "kayit yapildi..";
        System.out.println("s = " + s);

        driver.close();
    
}
}