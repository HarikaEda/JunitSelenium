package SeleniumCodeChallenge.Day04;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
// https://testpages.herokuapp.com/styled/events/javascript-events.html sayfasina gidin
//Butun butonlari trigger edin
public class Task1 {
    static WebDriver driver;
    Actions actions = new Actions(driver);
    @BeforeClass
    public static void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
    public void clickEvents() {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        WebElement onBlurButton = driver.findElement(By.xpath("//button[@id='onblur']"));
        WebElement onClickButton = driver.findElement(By.xpath("//button[@id='onclick']"));
        WebElement onContextMenuButton = driver.findElement(By.xpath("//button[@id='oncontextmenu']"));
        WebElement onDoubleClickButton = driver.findElement(By.xpath("//button[@id='ondoubleclick']"));
        WebElement onFocusButton = driver.findElement(By.xpath("//button[@id='onfocus']"));
        WebElement onKeyDownButton = driver.findElement(By.xpath("//button[@id='onkeydown']"));
        WebElement onKeyUpButton = driver.findElement(By.xpath("//button[@id='onkeyup']"));
        WebElement onKeyPressButton = driver.findElement(By.xpath("//button[@id='onkeypress']"));
        WebElement onMouseOverButton = driver.findElement(By.xpath("//button[@id='onmouseover']"));
        WebElement onMouseLeaveButton = driver.findElement(By.xpath("//button[@id='onmouseleave']"));
        WebElement onMouseDownButton = driver.findElement(By.xpath("//button[@id='onmousedown']"));
        onBlurButton.click();
        onClickButton.click();
        onClickButton.click();
        actions.contextClick(onContextMenuButton).
                doubleClick(onDoubleClickButton).
                click(onFocusButton).
                click(onKeyDownButton).
                sendKeys(Keys.ENTER).
                click(onKeyUpButton).sendKeys(Keys.ENTER).
                click(onKeyPressButton).sendKeys(Keys.ENTER).
                moveToElement(onMouseOverButton).
                moveToElement(onMouseLeaveButton).
                moveToElement(onMouseOverButton).
                click(onMouseDownButton).perform();
    }
}