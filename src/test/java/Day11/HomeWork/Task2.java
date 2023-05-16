package Day11.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task2 extends Base {
  /*
    Go to URL: https://www.monsterindia.com/seeker/registration
Upload file.

   */
    @Test
    public void task2() throws InterruptedException {
        driver.get("https://www.monsterindia.com/seeker/registration");
        String path=System.getProperty("user.dir")+System.getProperty("file.separator")+"fileExists.txt";
        System.out.println("path = " + path);

        WebElement uploadFileExists= driver.findElement(By.xpath("//div[@class='contentTitle']"));
        uploadFileExists.click();


/*
    Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
    Shift 34 units to the up and 34 units to the down on the vertical axis.
*//*
        @Test
        public void dragSliderDown ()
        {
            driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
            WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));
            WebElement value = driver.findElement(By.id("sliderOutput2"));
            Actions act = new Actions (driver);
            act.dragAndDropBy(slider, 0, 34).perform();
            System.out.println("What Is The Value After Dragging The Slider Down? " + value.getText()); //32
        }
        @Test
        public void dragSliderUp () {
            driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
            WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));
            WebElement value = driver.findElement(By.id("sliderOutput2"));
            Actions act = new Actions(driver);
            act.dragAndDropBy(slider, 0, -34).perform();
            System.out.println("What Is The Value After Dragging The Slider Up? " + value.getText()); //70
        }

*/


    }


}
