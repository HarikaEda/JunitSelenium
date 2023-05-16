package Day05.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*https://www.teknosa.com/ adresine gidiniz.
    Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
    Sonuç sayısını yazdırınız.
    Çıkan ilk ürüne tıklayınız.
    Sepete ekleyiniz.
    Sepetime gite tıklayınız.
            Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
    Alışverişi tamamlayınız.
    Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
    Driver’ı kapatınız.*/
    @Test
    public void task1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.teknosa.com/");
        WebElement element= driver.findElement(By.xpath("//input[@id='search-input']"));
        element.sendKeys("oppo");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement element1= driver.findElement(By.xpath("//div[@class='plp-info']"));
        WebElement sonuc = driver.findElement(By.xpath("//div[@class='plp-info']"));
        sonuc.click();
        System.out.println("bulunan sonuc = " + sonuc.getText());
        WebElement ilkurun= driver.findElement(By.xpath("//div[@class='swiper-slide responsive-image-swiper-slide swiper-slide-active']"));
        ilkurun.click();
        Thread.sleep(1000);
        WebElement sepeteEkle= driver.findElement(By.xpath("//button[@id='addToCartButton']"));
        sepeteEkle.click();
        Thread.sleep(1000);
        WebElement sepeteGit= driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        sepeteGit.click();
        Thread.sleep(1000);
       // WebElement siparisOzeti= driver.findElement(By.xpath(""));
        //System.out.println("sipariş özeti ="+siparisOzeti.getText());
        //Thread.sleep(1000);
        WebElement siparisTamamla= driver.findElement(By.xpath("//span[text()='Alışverişi Tamamla']"));
        siparisTamamla.click();
        Thread.sleep(1000);
       // WebElement hosGeldiniz= driver.findElement(By.xpath(""));
        //System.out.println("Hoşgeldiniz"+hosGeldiniz.getText());
        //Thread.sleep(1000);
        driver.quit();


    }



}
