package SeleniumCodeChallenge.Day02;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Practice2 extends Base {
//    Actions Class ile Test Case - Automate 'Search Product' feature of e-commerce website with Selenium.
//    Steps to Automate:
//   1. Open link http://automationpractice.pl/index.php
//   2. Move your cursor over Women's link.
//   3. Click on sub menu 'T-shirts'
//   4. Get Name/Text of the first product displayed on the page.
//  5. Now enter the same product name in the search bar present on top of page and click search button.
//  6. Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.

@Test
    public void practice2() {
    driver.get("http://automationpractice.pl/index.php");
    Actions actions = new Actions(driver);
    WebElement wommenTab=driver.findElement(By.xpath("//a[@title='Women']"));
    actions.moveToElement(wommenTab).perform();
    wommenTab.click();
    WebElement tshirtButton=driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]//a[.='T-shirts']"));
    tshirtButton.click();
    WebElement tshirtText = driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]"));
    String tshirtTextOutput = tshirtText.getText();
    System.out.println("tshirtTextOutput = " + tshirtTextOutput);
    WebElement searchBar = driver.findElement(By.id("search_query_top"));
    searchBar.sendKeys(tshirtTextOutput);
    System.out.println("tshirtTextOutput = " + tshirtTextOutput);
    WebElement searchButtonTop = driver.findElement(By.id("search_query_top"));
    searchButtonTop.sendKeys(Keys.ENTER);
    System.out.println("tshirtTextOutput = " + tshirtTextOutput);


}




}
