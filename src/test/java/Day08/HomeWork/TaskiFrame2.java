package Day08.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;

public class TaskiFrame2 extends Base {
 /*Go to URL: http://demo.guru99.com/test/guru99home/
Find the number of iframes on the page.
Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
Exit the iframe and return to the main page.
*/
    /*URL'ye gidin: http:demo.guru99.comtestguru99home
    Sayfadaki iframe sayısını bulun.
    Dördüncü iframe bağlantısı (JMeter Made Easy) (https:www.guru99.comlive selenium project.html)
    buraya tıklayın.
     iframe'den çıkın ve ana sayfaya dönün.
    */
@Test
    public void taskiFrame2() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        int count = driver.findElements(By.tagName("iframe")).size();
        System.out.println("count : "+count);
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("html/body/a")).click();
        driver.switchTo().defaultContent();





    }

}
