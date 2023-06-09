package SeleniumCodeChallenge;

public class Recap {
/*1-BROWSER CONTROL COMMANDS:
1.1: getTitle() gecerli sekmenin title ini verir. String return eder.
        driver.get("https://www.google.com/");
1.2: getCurrentURL() gecerli sekmedeki sitenin URL ini verir. String return eder.
1.3: getPageSource() gecerli sayfanin kaynak html kodunu getirir. String return eder.
1.4: close() gecerli olan sekmeyi kapatir. Eger tek sekme aciksa browser i da kapatir
1.5: quit() ise tum sekmeleri ve browser i kapatir.
1.6: getPosition() browser imizin suanki pozisyonunu verir. Point objesi return eder
        Point currentPoint = driver.manage().window().getPosition();
1.7: setPosition(Point point)
        driver.manage().window().setPosition(point);
1.8: getSize() browser imizin suanki en ve boyunu verir
        Dimension currentSize = driver.manage().window().getSize();
1.9: setSize(Dimension dimension)
        driver.manage().window().setSize(new Dimension(500,500));
2-NAVIGATION COMMANDS:
2.1: back() bir onceki sayfayi acar
        driver.navigate().back();
2.2: forward() geri gelindikten sonra bir sonraki sayfayi acar
2.3: refresh() sayfayi yeniler
2.4: to() - get() method u ile tamamen ayni islevi yapar
3-WINDOW COMMANDS:
3.1: minimize() pencerenin minimize haline gelmesini saglar (Soldaki cizgi butonu)
        driver.manage().window().minimize();
3.2: maximize() pencerenin maximize edilmesini saglar (Ortadaki kare butonu)
3.3: fullscreen() pencerenin tam ekran olmasini saglar (F11 fullscreen)
4-WEB DRİVER MANAGER:
  Webdrivermanager class i kullanilarak istenilen browser in driver binary leri otomatik olarak indirilir.
  WebDriver driver = new ChromeDriver();
5-TEST CLASS ()
public class C02_FirstTestClass
    public static void beforeClassMethods(){sout}
    @Before
    public void beforeTestMethod(){sout}
    @Test
    public void test01(){sout}
    @Test
    public void test02(){sout}
    @Ignore
    @Test
    public void test03(){sout}
    @BeforeClass
    @AfterClass
    public static void afterClassMethods(){sout}
6.A- ASSERTIONS
    public int divide(int a, int b){return a/b;}
    @Test
    public void scenario1(){
    int expected = 5;
    int actual = divide(10,2);
    Assert.assertEquals(expected, actual);
    @Test
    public void scenario2(){
    double expected = 2.5;
    int actual = divide(5,2);
    Assert.assertTrue(expected == actual);
6.B- ASSERTIONS METHODS ( EN ÇOK KULLANILANLAR)
    @Test
    public void assertEqualsTest(){
        // 2 parametre alirsa parametreler karsilastirilir ve esitlerse test passed olur esit degilse AssertionError firlatilir
        Assert.assertEquals(1,1);
    }
    @Test
    public void assertTrueTest(){
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz passed false olmasi durumnda failed olur
        Assert.assertTrue(true);
    }
    @Test
    public void assertFalseTest(){
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz failed false olmasi durumnda passed olur
        Assert.assertFalse(false);
    }
    @Test
    public void assertNullTest(){
        //Bir parametre alir. Parametre null ise test passed, null degil ise test failed olur
        Assert.assertNull(null);
    }
    @Test
    public void assertEqualsWithMessage(){
        Assert.assertEquals("Bu degerler esit degil!!!", 1,5);
    }
7. LOCATORS:
    // ID
        // ID locator aslinda bir webelementin id attribute udur.
        // id = "value" seklindeyse biz elementi value ile buluruz
    // NAME
        // NAME locator aslinda bir webelementin name attribute udur.
        // name = "value" seklindeyse biz elementi value ile buluruz
    // CLASS
        // CLASS locator aslinda bir webelementin class attribute udur.
        // class = "value" seklindeyse biz elementi value ile buluruz
    // TAG
        // HTML elementinin tagleri ile locate etme stratejisidir.
        // <tagName></tagName> ise biz bu elementi tagName degeri ile locate ederiz.
    // LINK TEXT
    // PARTIAL LINK TEXT
    // CSS SELECTOR
    // XPATH
    syntax: //tagName[@attribute='value']
    //tagName[@attributeName1='value1'][@attributeName2='value2'] -> AND mantigi ile baglanir
    //tagName[@attributeName1='value1' and @attributeName2='value2']
    //input[@att1='value1' or @att2='value2']
WEB ELEMENTS COMMANDS:
7.1: sendKeys() elementimize gonderilen degerleri klavyeyle yazarmis gibi gonderir.
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("İlk selenium kodumuzdan merhabalar");
        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.amazon.com/");
                WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
                searchBox.sendKeys("Ilk selenium kodumuzdan merhabalar");
7.2: isDisplayed() boolean ifadeler dondurur!
        Elementin sayfada goruntulenip goruntulenmedigi bilgisini verir
7.3: isSelected() elementin secili olup olmadigi bilgisini verir. (checkbox, radio).
7.4: isEnabled() bir elementin aktif mi degil mi oldugunun bilgisini verir
                (button ve girdi yapilan elementlerde kullanilabilir)
7.5: submit() formlari submit etmemize yani gondermemize yardimci olur.
                ENTER tusunun gorevini gorur.
7.6: click() bir elemente sol tiklamamizi saglar.
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
7.7: getLocation() elementin konumunu verir.
7.8: clear() input alanlarindaki yazilarin temizlenmesini saglar.
7.9: getText() elementin contentini bize verir.
7.10: getAttribute() elementin istedigimiz attribute degerini getirir.
7.11: getSize() elementin boyutunu bize verir.
8- XPATH METHODS:
8.1://tag[@attr='value']
ex://input[@name='username']"))
8.2: Contains:
1-//tag[contains(@attr,'value')]
ex.:(By.xpath("//input[contains(@type,'pass')]"));
2-//tag[contains(text(),'value')]
ex.:(By.xpath("//button[contains(text(),'Login')]"));
3-//tag[contains(.,'value')]
ex.:(By.xpath("//button[contains(.,'Login')]"));
8.3:Stars-with:
//tag[stars-with(@attr,'value')]
ex.:(By.xpath("//input[starts-with(@name, 'user')]
8.4: *
1-//*[@attr][@attr]
ex.://*[@placeholder][@type]"))
2-//tag[.='value']
ex.://input[.='Login']=div contentindeki tüm metinler gelir.
3-//*[text()='content':=div contentindeki sadece son metin gelir.
9- RELATIVE LOCATOR:
Syntax:
By logoLocator = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[text()='Hello!']"));
WebElement logo = driver.findElement(logoLocator);
Assert.assertTrue(logo.isDisplayed());
10- CHROME OPTIONS METHODS:
1-start-maximized: Chrome'u büyütme modunda açar.
2-incognito: Chrome'u gizli modda açar.
3-headless: Chrome'u başsız modda açar.
4-disable-extensions: Chrome tarayıcısında mevcut uzantıları devre dışı bırakır.
5-disable-popup-blocking: Chrome tarayıcısında görüntülenen açılır pencereleri devre dışı bırakır.
6-make-default-browser: Chrome'u varsayılan tarayıcı yapar.
7-version: Chrome tarayıcı sürümünü yazdırır.
8-disable-infobars: Chrome'un "Chrome otomatik yazılım tarafından kontrol ediliyor" bildirimini görüntülemesini engeller.
Syntax:
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("headless");
11- CHECKBOXES:
ex.:
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
12- RADIO BUTTONS:
ex.:
        WebElement femaleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customRadio = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());
        femaleRadio.click();
        Thread.sleep(3000);
        Assert.assertTrue(femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());
13- FAKER:
ex.:
        Faker faker = new Faker();
        String isim = faker.name().nameWithMiddle();
        System.out.println(isim);*/




}
