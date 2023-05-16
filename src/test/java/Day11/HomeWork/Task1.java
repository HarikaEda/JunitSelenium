package Day11.HomeWork;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class Task1 extends Base {
    /*Go to URL: http://facebook.com
getCookies,
addCookie,
deleteCookieNamed,
deleteAllCookies.
*/
    public void printCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();

        Iterator<Cookie> i = cookies.iterator();

        // Print all cookies
        while(i.hasNext()){
            Cookie currentCookie = i.next();

            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("Name = " + name + ", Value = " + value);
        }
        System.out.println("\n");
    }

    @Test
    public void test1() {
        driver.get("http://facebook.com");
        Cookie cookie = new Cookie("fruit", "cherry");
        driver.manage().addCookie(cookie);
        printCookies();
        driver.manage().deleteCookieNamed("fruit");
        printCookies();
        driver.manage().deleteAllCookies();

/*@Before
    public void launchUp (){
        driver.get("http://facebook.com");
    }
    @Test
    public void getCookies(){
        System.out.println("get cookies");
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void addCookie(){
        System.out.println("add cookies");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void deleteCookieNamed(){
        System.out.println("delete cookie named");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        driver.manage().deleteCookieNamed("this is my cookie");
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
    }
    @Test
    public void deleteAllCookies(){
        System.out.println("delete all cookies");
        Cookie name = new Cookie("this is my cookie","12345");
        driver.manage().addCookie(name);
        driver.manage().deleteAllCookies();
        Set <Cookie> cookie = driver.manage().getCookies();
        for (Cookie c:cookie) {
            System.out.println("***" +c);
        }
        System.out.println(driver.manage().getCookies().size());
    }
*/







    }


}
