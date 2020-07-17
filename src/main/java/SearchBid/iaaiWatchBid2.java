package main.java.SearchBid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class iaaiWatchBid2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximizes browser view
        driver.get("https://www.iaai.com/vehicledetails/33449588?RowNumber=1");  //
        List<WebElement> CurrentBid = driver.findElements(By.className("data-list__value"));


        for (WebElement webElement : CurrentBid) {
            String name = webElement.getText();
            System.out.println(name);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        }





}
