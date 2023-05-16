package Day09.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle4 extends Base {
   /*Go to URL: https://demoqa.com/browser-windows
Click on the windows - "WindowButton"
Click on all the child windows.
Print the text present on all the child windows in the console.
Print the heading of the parent window in the console.*/
    @Test
    public void testWindowHandle4() {
     driver.get("https://demoqa.com/browser-windows");
        WebElement WindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
        Actions action = new Actions(driver);
        action.click(WindowButton).perform();
        //WebElement childWindows = driver.findElement(By.xpath(""));
        //action.click(childWindows).perform();
        WebElement newMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        action.click(newMessage).perform();
        newMessage.getText();





    }




}
