package main.java.SearchBid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iaaiSearch {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximizes browser view
        driver.get("https://www.iaai.com/");  //make sure to have quotes "" here

        driver.findElement(By.id("txtSearch")).sendKeys("Texas buy fast  2003-2009");
        driver.findElement(By.id("btnApply")).click();






    }
}
