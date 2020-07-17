package main.java.junitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitState {

    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() {
        baseUrl = "https://www.expedia.com/";
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@BeforeAll - initiated and navigated to web page");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void clickCheckIn() {
        driver.findElement(By.cssSelector("#hotel-checkin-hp-hotel")).click();
        System.out.println("@BeforeEach - clicking on check-in");
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(20000);
        WebElement datefield= driver.findElement(By.xpath("//button[(@data-day='21' and @data-month='5') or (starts-with(@aria-label,'May 21'))]"));
        Thread.sleep(10000);
        datefield.click();
        System.out.println("@Test1 - clicking on enabled date");
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(10000);
        WebElement datefield= driver.findElement(By.xpath("//button(text()=' 1')]/span[text()='May']"));
        Thread.sleep(10000);
        datefield.click();
        System.out.println("@Test2 - clicking on disabled date");
    }
}
