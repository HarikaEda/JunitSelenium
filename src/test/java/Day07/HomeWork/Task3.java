package Day07.HomeWork;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task3 extends Base {
/*Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser.*/
    /*Tarayıcıyı başlatın. "https:demoqa.comselect-menu" öğesini açın.
     Öğe kimliğini kullanarak Standart Çoklu Seçimi seçin.
     Öğenin çoklu seçim olduğu doğrulanıyor.
     Dizini kullanarak 'Opel'i seçin ve dizini kullanarak aynı seçimi kaldırın.
     Değer kullanarak 'Saab'ı seçin ve aynı kullanım değeri seçimini kaldırın.
     Tüm seçeneklerin seçimini kaldırın.
     Tarayıcıyı kapatın.
     */
    @Test
    public void task3() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement multiSelect = driver.findElement(By.id("cars"));
        Select select = new Select(multiSelect);
        Assert.assertTrue(select.isMultiple());
        select.selectByVisibleText("Opel");
        Thread.sleep(1000);
        select.deselectByVisibleText("Opel");
        Thread.sleep(1000);
        select.selectByVisibleText("Saab");
        Thread.sleep(1000);
        select.deselectByVisibleText("Saab");
        Thread.sleep(1000);
        select.deselectAll();
        Thread.sleep(1000);
        driver.quit();

    }



}
