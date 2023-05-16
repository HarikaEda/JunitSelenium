package Day08;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_BasicAuthentication extends Base {
    @Test
    public void test1() {
      driver.get("https://the-internet.herokuapp.com/basic_auth");
        WebElement congrats = driver.findElement(By.tagName("p"));
        Assert.assertTrue(congrats.getText().contains("Congratulations"));
//şifre ve kimlik bilgileri gibi bilgileri doğrular BasicAuthentication



    }





}
