package Day08.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;

public class Task1 extends Base {
   /*Go to URL: http://demo.automationtesting.in/Alerts.html
Click "Alert with OK" and click 'click the button to display an alert box:’
Accept Alert(I am an alert box!) and print alert on console.
Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
Cancel Alert  (Press a Button !)
Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
And then sendKeys «BootcampCamp» (Please enter your name)
Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.
*/
    /*
    URL'ye gidin: http:demo.automationtesting.
    inAlerts.html "Tamam ile Uyarı"ya tıklayın ve
    "bir uyarı kutusu görüntülemek için düğmeyi tıklayın:
    " Uyarıyı Kabul Et(Ben bir uyarı kutusuyum!) ve uyarıyı konsolda yazdırın.
     "Tamam ve İptal ile Uyarı"yı tıklayın ve "bir onay kutusu görüntülemek için düğmeyi tıklayın"
     Uyarıyı İptal Et (Bir Düğmeye Basın!)
     BootcampCamp» (Lütfen adınızı giriniz)
     Son olarak konsola bu mesajı yazdırın
     "Merhaba BootcampCamp Bugün Nasılsınız" bu mesajı onaylayın.
     */
@Test
    public void task1() throws InterruptedException {
    driver.get("http://demo.automationtesting.in/Alerts.html");
    driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    Thread.sleep(2000);
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(" //button[@class='btn btn-primary']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    driver.switchTo().alert().sendKeys("Hello BootcampCamp!! How are you today?");
    driver.switchTo().alert().accept();
    driver.quit();

}

}
