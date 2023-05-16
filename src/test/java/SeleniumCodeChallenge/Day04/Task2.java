package SeleniumCodeChallenge.Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Task2 {
    //http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html sitesine gidin
//Baskentleri ulkelere surukleyip birakin
//Oslo ve Norway in arkaplan renginin yesil oldugunu dogrulayin
    static WebDriver driver;
    Actions actions = new Actions(driver);

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void dragAndDrop() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement cophenhag = driver.findElement(By.id("box4"));
        WebElement seul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement norvey = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement unitedStates = driver.findElement(By.id("box103"));
        WebElement Denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        actions.dragAndDrop(oslo, norvey).perform();
        actions.dragAndDrop(washington, unitedStates).perform();
        actions.dragAndDrop(stockholm, sweden).perform();
        actions.dragAndDrop(rome, italy).perform();
        actions.dragAndDrop(madrid, spain).perform();
        actions.dragAndDrop(cophenhag, Denmark).perform();
        actions.dragAndDrop(seul, southKorea).perform();
        System.out.println(oslo.getAttribute("style"));
        Assert.assertTrue(oslo.getAttribute("style").contains("background-color: rgb(0, 255, 0)"));

    }}