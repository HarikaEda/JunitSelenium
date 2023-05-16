package Day13;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WebTables extends Base {
    // Webtable konusunda dikkat etmemiz gereken bazi noktalar
    // 1- Xpath locator unda ilgili seviyede index kullanirsak tek bir elemente isaret ederiz
    // 2-Xpath locator unda ilgili seviyede index kullanmazsak o seviyedeki tum elementleri isaret ederiz
    // 3- Satir sayisini istiyorsak int satirSayisi = driver.findElements(tr_locator).size()
    // 4- Sutun sayisini almak istersek oncelikle bir satiri locate edip o satirin altindaki tum hucrelerin sayisini almaliyiz
    //  int sutunSayisi = driver.findElements(By.xpath("//table//tr[1]//td")).size()
    @Test
    public void test1() {

        // table imiz sabit bir locator a sahip oldugu icin kodumuzu kisaltmak adina oncelikle tum tabloyu locate ettik

        driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement tabledata = driver.findElement(By.xpath("//table[@class='dataTable']//tbody"));
        WebElement row1cell = tabledata.findElement(By.xpath(".//tr[1]//td[3]"));//. koymak gerekir yoksa tüm sayfada arama yapar
        String text = row1cell.getText();
        System.out.println("text: " + text);

        // Tabloda gezinmek icin ic ice iki for dongusu yazmamiz gerekiyor ve bu donguler icin satir ve sutun sayilarina ihtiyacimiz var

        int satırsayisi = tabledata.findElements(By.xpath(".//tr")).size();
        int sutunsayisi = tabledata.findElements(By.xpath(".//tr[1]//td")).size();
        //.//tr[1]//td burada tr[1]dememizin sebebi ilk satırda kaç tane sutun varsa onu örnek alsın diye...

        // Ic ice dongulerdeki i degeri her bir gezinilen satiri j ise her bir sutunu temsil eder
        // bu yuzden en icteki for dongusunde bir element locate ederken bu satir ve sutun degerleri yerine i ve j yi kullaniriz

        for (int i = 1; i < satırsayisi + 1; i++) {
            System.out.println("-");
            for (int j = 1; j < sutunsayisi + 1; j++) {
                //tek bir hücreyi locate etmek için findElement,birden çok hücreyi locate etmek için findElements kullanırız unutmaaa!!!!
               WebElement currentcell = tabledata.findElement(By.xpath(".//tr[" + i + "]/td[" + j + "]"));
               String cellValue = currentcell.getText();
               System.out.println(currentcell.getText() + " -");
                //getTableCellValue(tabledata, i, j);//methodu çağırdım
            }
            System.out.println();
        }
        System.out.println(getTableCellValue(tabledata, 6, 1));
        //Devamli olarak tablolarda element locate ederken by locator yazmak can sikici olabilir.
        // Bu durumdan kacinmak icin bir defaligina method olusturup element locate ederken bu methodu cagirabiliriz
        //Asagidaki method 3 parametre alip ilk parametre olan tablonun belirtilen satir ve sutunlarindaki hucrenin text degerini bizlere verir.

    }

    public String getTableCellValue(WebElement table, int row, int cell) {
        By locator = By.xpath(".//tr[" + row + "]//td[" + cell + "]");
WebElement cell1=table.findElement(locator);
return cell1.getText();

    }
}