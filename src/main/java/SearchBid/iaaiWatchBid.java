package main.java.SearchBid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iaaiWatchBid {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximizes browser view
        driver.get("https://www.iaai.com/vehicledetails/33449588?RowNumber=1");  //
        WebElement CurrentBid = driver.findElement(By.cssSelector("/html/body/section/main/section[3]/div/div[2]/div/div[1]/div[1]/div[2]/ul/li[9]/span[2]"));
        System.out.println(CurrentBid.getText());








    }
}
