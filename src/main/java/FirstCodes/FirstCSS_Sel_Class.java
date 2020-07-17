package main.java.FirstCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCSS_Sel_Class {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("https://www.bankofamerica.com/");

        // .classvalue
        driver1.findElement(By.cssSelector(".search-query")).sendKeys("how to make money");
        driver1.findElement(By.cssSelector("input.search-query")).sendKeys("why");

    }

}
