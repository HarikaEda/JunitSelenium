package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {
    //webDriverManager clası kullanılarak istenilen browser in driver binary leri otomatik olarak indirilir.
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
     //Driver objesi oluşturulur
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.youtube.com/");
















    }
}
