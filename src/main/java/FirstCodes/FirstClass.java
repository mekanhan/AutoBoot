package main.java.FirstCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        WebDriver driver1 = new ChromeDriver();
        //driver1.manage().window().maximize(); // maximizes browser view
        driver1.get("https://www.bankofamerica.com/");  //make sure to have quotes "" here
        driver1.findElement(By.className("search-query")).sendKeys("how to make money");
        driver1.findElement(By.linkText("Wealth Management")).click();
        driver1.findElement(By.linkText("Small Business")).click();
        driver1.findElement(By.linkText("Find your closest financial center or ATM")).click();
        driver1.findElement(By.linkText("Enter address, ZIP code or landmark")).sendKeys("77494");
//        driver1.wait(100);

    }


}
