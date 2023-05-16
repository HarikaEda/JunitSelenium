package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_Actions extends Base {
@Test
    public void test1(){
   driver.get("https://www.google.com");
   //arama kısmına chatGPT yaz
    WebElement search = driver.findElement(By.name("q"));
    // Mouse hareketlerinde basili tutma islemi clickAndHold() methodu ile yapilir
    // Basili tutma islemi release() methodu ile sonlandirilir.

    // keyDown() klavyede bir tusa basili tutmayi saglar
    // keyUp() ise basili tutma islemini sonlandirir

    actions.
            moveToElement(search).
            click().
            sendKeys("chat").
            keyDown(Keys.SHIFT).//basılı tuttuk
            sendKeys("gpt").//yazımızı yazdık
            keyUp(Keys.SHIFT).//shıftı bıraktık
            perform();





    }




}
