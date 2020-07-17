package main.java.junitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitSel {

    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() throws InterruptedException {
        baseUrl = "https://letskodeit.teachable.com";
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@BeforeAll - executed once before all test methods in this class");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void init() {
        driver.navigate().refresh();
        System.out.println("@BeforeEach - refreshed the page");
    }

    @AfterEach
    public void done() {
        driver.navigate().refresh();
        System.out.println("@AfterEach - executed once after every test method in this class");
    }

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("a.navbar-brand header-logo")).click();
        System.out.println("@Test1 - clicking directly");
    }

    @Test
    public void test2() throws InterruptedException {
        WebElement logo = driver.findElement(By.cssSelector("a.navbar-brand header-logo"));
        logo.click();
        System.out.println("@Test2 - click on WebElement logo");
    }

    @Test
    public void test3() {
        System.out.println("@Test3 - executed test");
    }

}