package Day09.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class WindowHandle3 extends Base {
    /*Go to URL: https://testproject.io/
    Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
            https://blog.testproject.io/ */
    @Test
    public void testWindowHandle3() {
        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW);

    }











}
