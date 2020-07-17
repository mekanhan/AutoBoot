package main.java.SearchingProjects;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.geom.Arc2D;

public class FBSearch2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe"); //web driver location
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximizes browser view
        driver.get("https://www.facebook.com/");  //make sure to have quotes "" here

        driver.findElement(By.id("email")).sendKeys("mekjanhan@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Glyuk_rukov/ki");
        driver.findElement(By.id("loginbutton")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.facebook.com/marketplace/?ref=bookmark");




        //        driver.get("https://www.facebook.com/marketplace/houston/vehicles");    //Change city
//        driver.findElement(By.id("Keycommand_wrapper_InputSubmit")).click();





    }
}
