package Day06.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /* Go to URL: https://demoqa.com/radio-button
     Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
     Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız*/
    @Test
    public void task3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadio = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        WebElement yesImpressive = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        WebElement yesNo = driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));

        Assert.assertTrue(!yesRadio.isSelected());
        Assert.assertTrue(!yesImpressive.isSelected());
        Assert.assertTrue(!yesNo.isSelected());
        Thread.sleep(2000);

        yesRadio.click();
        Assert.assertFalse(yesRadio.isSelected());
        Assert.assertTrue(!yesImpressive.isSelected());
        Assert.assertTrue(!yesNo.isSelected());
        Thread.sleep(2000);
        WebElement yes = driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println("yes.getText() = " + yes.getText());


        yesImpressive.click();
        Assert.assertTrue(!yesRadio.isSelected());
        Assert.assertFalse(yesImpressive.isSelected());
        Assert.assertTrue(!yesNo.isSelected());
        Thread.sleep(2000);
        WebElement impressive=driver.findElement(By.xpath("//p[@class='mt-3']"));
        System.out.println("impressive.getText() = " + impressive.getText());

        yesNo.click();
        Assert.assertTrue(!yesRadio.isSelected());
        Assert.assertTrue(!yesImpressive.isSelected());
        Assert.assertFalse(yesNo.isSelected());
        Thread.sleep(2000);
        System.out.println("yesNo.getText() = " + yesNo.getText());

driver.quit();
    }
}