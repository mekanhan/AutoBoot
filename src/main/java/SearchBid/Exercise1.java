package main.java.SearchBid;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

    static WebDriver driver;
    //static String baseUrl;


    @BeforeAll
    public static void setUP() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();
//        driver.get(baseUrl);
        System.out.println("@BeforeAll - initiated and navigated to web page");
    }

    @AfterAll
    public static void tearDown() {

        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void logIn() {

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mekjanhan@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Glyuk_rukov/ki.com");
        driver.findElement(By.xpath("///*[@id=\"loginbutton\"]")).click();
        //driver.findElement(By.id("loginbutton")).click();
        System.out.println("@BeforeEach - Logging with email and password");
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("https://www.facebook.com/marketplace/?ref=bookmark/");
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        driver = new ChromeDriver();
        WebElement searchMarketplace= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/div/div[7]/div/a/div[1]/div[2]/div/div/div/div/span"));
        Thread.sleep(5000);
        searchMarketplace.sendKeys("Lexus");
        System.out.println("@Test1 - Searching for Lexus on marketplace");
    }

}
