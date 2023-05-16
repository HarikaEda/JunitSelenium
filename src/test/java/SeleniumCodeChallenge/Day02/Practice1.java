package SeleniumCodeChallenge.Day02;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice1 extends Base {
 //Kaynak https://www.techlistic.com/p/selenium-tutorials.html

//    1. Open this url  http://automationpractice.pl/index.php
//    2. Click on sign in link.
//    3. Verify sign in page
//    3. Enter your email address in 'Create and account' section.
//    4. Click on Create an Account button.
//    5. Enter your Personal Information, Address and Contact info.
//    6. Click on Register button.
//    7. Validate that user is created
    @Test
    public void practice1() {
        // driver.get("https://www.techlistic.com/p/selenium-tutorials.html");
        driver.get("http://automationpractice.pl/index.php");
//vaid case(geçerli durum) ve invalid caseleri iyi belirlemek gerekli
        WebElement  loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        WebElement emailcreate= driver.findElement(By.xpath("//input[@id='email_create']"));
        emailcreate.sendKeys(email);
        WebElement emailsubmit= driver.findElement(By.id("SubmitCreate"));
        emailsubmit.click();
        String fakefirstname=faker.name().firstName(); ;
        String fakelastname=faker.name().lastName() ;
        String fakepassword=faker.internet().password() ;
        String fakedayInput=String.valueOf(faker.date().birthday());
        String fakemonthInput=String.valueOf(faker.date().birthday());
        String fakeyearInput=String.valueOf(faker.date().birthday());
        WebElement fakefirstname1 = driver.findElement(By.id("customer_firstname"));
        fakefirstname1.sendKeys(fakefirstname);
        WebElement fakelastname1 = driver.findElement(By.id("customer_lastname"));
        fakelastname1.sendKeys(fakelastname);
        WebElement fakepassword1 = driver.findElement(By.id("passwd"));
        fakepassword1.sendKeys(fakepassword);
        WebElement fakedayInput1 = driver.findElement(By.id("days"));
        fakedayInput1.sendKeys(fakedayInput);
        WebElement fakemonthInput1 = driver.findElement(By.id("months"));
        fakemonthInput1.sendKeys(fakemonthInput);
        WebElement fakeyearInput1 = driver.findElement(By.id("years"));
        fakeyearInput1.sendKeys(fakeyearInput);
/*@Test
public void signIn() {
    driver.get("http://automationpractice.pl/index.php");

    //    2. Click on sign in link.
    WebElement loginButton = driver.findElement(By.cssSelector(".login"));
    loginButton.click();

    //    3. Verify sign in page
    Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));

    //    4. Enter your email address in 'Create and account' section.
    fakemail = faker.internet().emailAddress();
    WebElement emailCreate = driver.findElement(By.id("email_create"));
    emailCreate.sendKeys(fakemail);
    //    4. Click on Create an Account button.
    WebElement emailSubmit = driver.findElement(By.id("SubmitCreate"));
    emailSubmit.click();

    //    5. Enter your Personal Information, Address and Contact info.
    driver.findElement(By.id("uniform-id_gender1")).click();
    WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
    WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
    WebElement passwordInput = driver.findElement(By.id("passwd"));
    WebElement dayInput = driver.findElement(By.id("days"));
    WebElement monthInput = driver.findElement(By.id("months"));
    WebElement yearInput = driver.findElement(By.id("years"));
    fakeFirstName = faker.name().firstName();
    fakeLastName = faker.name().lastName();
    fakePassword = faker.internet().password();
    firstNameInput.sendKeys(fakeFirstName);
    lastNameInput.sendKeys(fakeLastName);
    passwordInput.sendKeys(fakePassword);
    dayInput.sendKeys("1");
    monthInput.sendKeys("January");
    yearInput.sendKeys("2001");
    driver.findElement(By.id("submitAccount")).click();
    Assert.assertTrue(driver.findElement(By.cssSelector(".alert-success")).isDisplayed());

    //    8. Go to your homepage
    driver.findElement(By.cssSelector(".icon-home")).click();*/


    }
}