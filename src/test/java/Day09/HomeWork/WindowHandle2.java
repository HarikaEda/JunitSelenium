package Day09.HomeWork;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WindowHandle2 extends Base {
    /*Go to URL: https://the-internet.herokuapp.com/windows
Verify the text: “Opening a new window”
Verify the title of the page is “The Internet”
Click on the “Click Here” button
Verify the new window title is “New Window”
Go back to the previous window and then verify the title: “The Internet”*/

    /*Metni doğrulayın: "Yeni bir pencere açmak"
    Sayfanın başlığının "İnternet" olduğunu doğrulayın
     "Buraya Tıklayın" düğmesini tıklayın
      Yeni pencere başlığının "Yeni Pencere" olduğunu doğrulayın
      Önceki pencereye dönün ve ardından başlığı doğrulayın : "İnternet"
     */
    @Test
    public void testWindowHandle2() {
     driver.get("https://the-internet.herokuapp.com/windows");
     driver.switchTo().newWindow(WindowType.WINDOW);
        //WebElement internet = driver.findElement(By.xpath(""));
        //Assert.assertTrue(internet.isDisplayed());
        WebElement tıkla= driver.findElement(By.xpath(""));
        WebElement openingWindow = driver.findElement(By.xpath("//div[@class='example']"));
        Assert.assertTrue(openingWindow.isDisplayed());




    }




}
