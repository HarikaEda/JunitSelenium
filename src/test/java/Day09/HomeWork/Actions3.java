package Day09.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions3 extends Base {
    /*Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
Shift 34 units to the right and 34 units to the left on the vertical axis.*/
    @Test
    public void testActions3(){
     driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
     WebElement kaydırDikey= driver.findElement(By.xpath("//div[@data-options='display_selector:#sliderOutput2;vertical:true;']"));
     Actions actions = new Actions(driver);
     actions.moveToElement(kaydırDikey).clickAndHold().moveByOffset(34, 34).release().perform();







    }



}
