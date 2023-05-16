package Day09.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandle1 extends Base {
  /*Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
Print the existing windowHandles ids by clicking all the links on the page.
Click on the links that open a new page.
Close other pages other than the home page.
Set the driver back to the main page.*/
  /* URL'ye gidin: https:www.toolsqa.comselenium-webdriverwindow-handle-in-selenium
   Sayfadaki tüm bağlantılara tıklayarak mevcut windowHandles kimliklerini yazdırın.
   Yeni bir sayfa açan bağlantılara tıklayın.
   Ana sayfa dışındaki diğer sayfaları kapatın.
    Sürücüyü ana sayfaya geri ayarlayın.
   */

    @Test
    public void testWindowHandle1() {
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
        ChromeOptions op=new ChromeOptions();
        op.addArguments("disaabl-popup-blocking");
        //daha sonra kullanabilmek için ana sayfa id mizi saklıyoruz.
        String homePageID=driver.getWindowHandle();



//yeni sekmeler oluşturmak adına target=_blank olan linklerin 2 tanesine tıklayalım.
        //sayfada yeni windov açan linkleri bulmak için target=_blank attribute-value olan a(link)
        //taglarını bulalım
        //a[@target="_blank"]
        List<WebElement>links=driver.findElements(By.xpath("//a[@target='_blank']"));
       /* for(WebElement link:links){
            System.out.println(link.getAttribute("href"));
            link.click();
        }
*/
        System.out.println(links.size());
        links.get(0).click();
        links.get(1).click();
        //iterate etmek için tüm tab ve window id lerini bir set iinde saklıyoruz
        Set<String >window=driver.getWindowHandles();
        //gezinmek için iterator objesi oluşturuyoruz.
        Iterator<String> it=window.iterator();
        //gezinme işlemi
        while(it.hasNext()){//herbir gezinilen id kullanılarak o anki sekmeye sw,tch ediyoruz
            driver.switchTo().window(it.next());
               if (driver.getWindowHandle().equals(homePageID)) {
                   continue;
               }
            }
        driver.close();

    }







}
