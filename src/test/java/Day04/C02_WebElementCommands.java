package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebElementCommands {

  //    sendKeys() command,elementimize gönderilen değerleri yazarmış gibi gönderir.
 //    isDisplayed() command,(görüntülendi mi?)bize boolean değeri gönderir.Elementin sayfada görüntülenip görüntülenmediği bilgisini verir
 //    isSelected() command,(seçili mi?)bize elemntin seçili olup olmadığı bilgisini verir(checkbox,radio)
 //    isEnabled() command,(aktif mi?)bize elemntin aktif olup olmadığı bilgisini verir.buton ve girdi yapılan elementlede kullanılablilir.
 //    submit() command,ENTER tusunun görevini görür.bu method formları submit etmemize yani göndermemize yardımcı olur.
 //    click() command,bir elemente sol tıklamamızı sağlar
 //    getLocation() command,bize elementin konumunu verir(pek kullanılmaz)
 //    clear() command,input alanlarındaki yazıların temizlenmesini sağlar
 //    getText() command,sık kullanılır,elementin contentini bize verir.
 //    getAttribute(String key) command,bize elementin istediğimiz attribut değerini verir.
//    getSize() command,elementin boyutunıu verir
     @Test
     public void webElementCommands(){

         WebDriverManager.chromedriver().setup();
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.amazon.com/");

         WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

         searchBox.sendKeys("Ilk selenium kodumuzdan merhabalar");
         //searchBox.submit();
         WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

         searchButton.click();
        // searchBox.clear();bazı elementlerde clear çalışmayabiliyor.

     }



 }

