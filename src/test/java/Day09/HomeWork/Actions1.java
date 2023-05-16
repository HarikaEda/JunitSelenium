package Day09.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions1 extends Base {//mause ile hareket
   /*Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.*/


/*URL'ye gidin: http:demo.guru99.comtestdrag_drop.
html BORÇ TARAFINDAN BANKA düğmesini sürükleyip bırakın,
SATIŞ düğmesini KREDİ TARAFINDAN Hesap bölümüne sürükleyip bırakın.
 BORÇ TARAFI İkinci 5000 düğmesini KREDİ TARAFINDAN MİKTAR bölümüne sürükleyip bırakın
 Mükemmel metnin görünürlüğünü doğrulayın.
 */
    @Test
    public void testActions1() {
        Actions actions = new Actions(driver);
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement bank = driver.findElement(By.xpath("//a[@class='button button-orange'][5]"));

        WebElement sales= driver.findElement(By.xpath("//a[@class='button button-orange'][6]"));

        WebElement account= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][3]"));

        WebElement amount= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][4]"));

        WebElement account2= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][5]"));

        WebElement amount2= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][6]"));

        WebElement debitSide= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][1]"));

        WebElement creditSide= driver.findElement(By.xpath("//h3[@class='ui-widget-header'][2]"));

        actions.dragAndDrop(bank,account ).perform();
        actions.dragAndDrop(sales,account ).perform();
        actions.dragAndDrop(amount,debitSide ).perform();
        actions.dragAndDrop(amount,creditSide ).perform();

/*@Test
    public void test() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement bank = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
        WebElement sales = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement num5000 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
        WebElement num5000second = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
        WebElement bankAccount = driver.findElement(By.xpath("//ol[@id='bank']"));
        WebElement bankAmount = driver.findElement(By.xpath("//ol[@id='amt7']"));
        WebElement creditAccount = driver.findElement(By.xpath("//ol[@id='loan']"));
        WebElement creditAmount = driver.findElement(By.xpath("//ol[@id='amt8']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(bank, bankAccount).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(sales, creditAccount).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(num5000, bankAmount).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(num5000second, creditAmount).perform();
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        // WebElement perfectTxt = driver.findElement(By.linkText("\"Perfect!\""));
        WebElement perfectTxt = driver.findElement(By.xpath("//a[.='Perfect!']"));
        Assert.assertTrue(perfectTxt.isDisplayed());*/




    }





}
