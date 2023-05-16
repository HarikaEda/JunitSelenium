package Day07.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends Base {
/*Launch the browser.
 Open "https://demoqa.com/select-menu".
 Select the Old Style Select Menu using the element id.
 Print all the options of the dropdown.
 Select 'Purple' using the index.
 After that, select 'Magenta' using visible text.
 Select an option using value.
 Close the browser.*/

/*Tarayıcıyı başlatın. "https:demoqa.comselect-menu" öğesini açın.
 Öğe kimliğini kullanarak Eski Stil Seçim Menüsünü seçin.
  Açılır listedeki tüm seçenekleri yazdırın.
  Dizini kullanarak 'Mor'u seçin.
   Bundan sonra, görünür metni kullanarak 'Macenta'yı seçin.
    Değeri kullanarak bir seçenek belirleyin.
     Tarayıcıyı kapatın.
 */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);

        select.selectByIndex(4);
        Thread.sleep(1000);
        select.selectByVisibleText("Magenta");
        Thread.sleep(1000);
        select.selectByValue("red");
        Thread.sleep(1000);
        driver.close();







    }



}
