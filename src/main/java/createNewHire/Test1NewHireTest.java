package main.java.createNewHire;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;




public class Test1NewHireTest {

    RandomInfo random = new RandomInfo();


    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test1NewHire() {
        driver.get("https://hr-testing.buffsci.org");
//        username:admin@staging-buffsci.org
//        password:admin123test

//        driver.manage().window().setSize(new Dimension(1308, 773));
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.id("email")).sendKeys("admin@staging-buffsci.org");
        driver.findElement(By.id("password")).sendKeys("admin123test");
        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".col-sm-3:nth-child(1) > .form-control")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".col-sm-3:nth-child(1) > .form-control"));
//            dropdown.findElement(By.xpath()).click();
//            dropdown.findElement(By.xpath("//option[. = rand]")).click();
        }
        driver.findElement(By.cssSelector(".col-sm-3 > .form-control > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).click();
//        driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).sendKeys(random.firstNameFemale);

        driver.findElement(By.cssSelector(".form-group:nth-child(5) > .form-control")).click();
//        driver.findElement(By.cssSelector(".form-group:nth-child(5) > .form-control")).sendKeys(random.lastName);
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(6) > .form-control")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(6) > .form-control"));
            dropdown.findElement(By.xpath("//option[. = 'Teacher Aide (BuffSci 2)']")).click();
        }
        driver.findElement(By.cssSelector(".form-control:nth-child(2) > option:nth-child(11)")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(7) .form-control")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(7) .form-control")).sendKeys("Aynuafdola@gmail.com");
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(8) .form-control")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(8) .form-control")).sendKeys("(832) 426-8524");
        driver.findElement(By.cssSelector("#newHireModal___BV_modal_footer_ > .btn-primary")).click();
        driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".col-sm-3:nth-child(1) > .form-control")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".col-sm-3:nth-child(1) > .form-control"));
            dropdown.findElement(By.xpath("//option[. = 'Ms.']")).click();
        }
        driver.findElement(By.cssSelector(".col-sm-3 > .form-control > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).click();
        driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).sendKeys("3ffsdg");
        driver.findElement(By.cssSelector(".col-sm-4:nth-child(4) > .form-control")).click();
        driver.findElement(By.cssSelector(".col-sm-4:nth-child(4) > .form-control")).sendKeys("dsg");
        driver.findElement(By.cssSelector(".form-group:nth-child(5) > .form-control")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(5) > .form-control")).sendKeys("segsg");
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(6) > .form-control")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(6) > .form-control"));
            dropdown.findElement(By.xpath("//option[. = 'Librarian (High School)']")).click();
        }
        driver.findElement(By.cssSelector(".col-sm-6 option:nth-child(3)")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(7) .form-control")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(7) .form-control")).sendKeys("sgsgd@gmail.com");
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(8) .form-control")).click();
        driver.findElement(By.cssSelector("#newHireForm .form-group:nth-child(8) .form-control")).sendKeys("(468) 763-5168");
        driver.findElement(By.cssSelector("#newHireModal___BV_modal_footer_ > .btn-primary")).click();
    }
}
