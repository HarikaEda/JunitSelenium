package Day10;

public class Day10 {
/*Selenium Day 10
--------------------------------------------------------------------------------------------------
ACTIONS
    Actions actions = new Actions(driver);
    -Klavye methodlari-
        1-keyDown(Keys.SHIFT); -> bir tusa basili tutar.
            1-keyDown(Webelement element, Keys.SHIFT);
        2-keyUp(Keys.SHIFT); -> basili tutma islemini sonlandirir.
            2-keyUp(Webelement element, Keys.SHIFT);
        3-sendKeys(CharSequence...);
        3-sendKeys(Webelement element, CharSequence...);
JSEXECUTOR

    JSExecutor Selenium komutlarinin yetersiz oldugu noktada browser icine bizzat JS komutlarini 'inject' ederek aksiyonun gerceklestirilmesini saglar. Aksiyon gerceklestirmek disinda element manipulasyonu da yapilabilir.
    Data return edebilir veya sadece aksiyon gerceklestirebilir.
    JavascriptExecutor jse = (JavascriptExecutor) driver;
        -scroll -> jse.executeScript("arguments[0].scrollIntoView()", element);
        -click ->  jse.executeScript("arguments[0].click()", element);
        -getText -> String text = (String) jse.executeScript("return arguments[0].innerHTML", element);

*/



}
