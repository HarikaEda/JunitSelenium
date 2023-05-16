package Day07.HomeWork;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Task1 extends Base {
  /*  Go to URL: https://the-internet.herokuapp.com/dropdown
    Create method selectByIndexTest and Select Option 1 using index .
    Create method selectByValueTest Select Option 2 by value.
    Create method selectByVisibleTextTest Select Option 1 value by visible text.
    Create method printAllTest Print all dropdown value.
    Verify the dropdown has Option 2 text.
    Create method printFirstSelectedOptionTest Print first selected option.
    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.*/
/*
  method selectByIndexTest oluşturun ve index kullanarak Seçenek 1'i seçin.
  Yöntemi oluştur selectByValueTest Seçenek 2'yi değere göre seçin.
  Yöntem selectByVisibleTextTest oluşturun Görünür metinle Seçenek 1 değerini seçin.
  printAllTest yöntemini oluştur Tüm açılır değeri yazdır.
  Açılır listede Seçenek 2 metni olduğunu doğrulayın.
  Yöntem oluşturun printFirstSelectedOptionTest İlk seçilen seçeneği yazdırın.
  Açılır listenin boyutunu bulun, açılır listede 3 öğe yoksa "Beklenen Eşit Gerçek Değil" yazdırın.
 */
@Test
    public void herokuAppTest() {
   driver.get("https://the-internet.herokuapp.com/dropdown");
    WebElement select = driver.findElement(By.xpath("//select[@id='dropdown']"));
    select.click();
    selectByIndexTest(select,1);
    selectByValueTest(select,"2");
    selectByVisibleTextTest(select,"1");
    printAllTest(select);
    Assert.assertEquals(2,select.findElements(By.xpath("//option")).size());
    printFirstSelectedOptionTest(select);
    List<WebElement>optionList = select.findElements(By.xpath("//option"));
    Assert.assertEquals("Expected Is Not Equal Actual",optionList.get(1).getText());
    Assert.assertEquals("Expected Is Not Equal Actual",optionList.get(2).getText());
    Assert.assertEquals("Expected Is Not Equal Actual",optionList.get(3).getText());




}

    private void printFirstSelectedOptionTest(WebElement select) {
        Select select1 = new Select(select);
        List<WebElement> options = select1.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    private void printAllTest(WebElement select) {
        Select select1 = new Select(select);
        List<String> optionsList =new ArrayList<>();
        List<WebElement> options = select1.getOptions();
        for (WebElement option : options) {
            optionsList.add(option.getText());
        }


    }

    private void selectByVisibleTextTest(WebElement select, String s) {
    Select select1 = new Select(select);
    select1.selectByVisibleText(s);
    }

    private void selectByValueTest(WebElement select,String value) {
        Select select1 = new Select(select);
        select1.selectByValue(value);
    }

    private void selectByIndexTest(WebElement select,int index) {
        Select select1 = new Select(select);
        select1.selectByIndex(index);

    }

}
