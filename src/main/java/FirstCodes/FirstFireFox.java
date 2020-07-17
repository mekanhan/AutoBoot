package main.java.FirstCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFireFox {

    //psvm and do ctrl+space
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\Dropbox\\Google Drive\\NAU Boot Camp\\Selenium Course\\selenium-java-3.141.59\\drivers\\geckodrivers.exe");
        System.out.println(("driver location is:" + System.getProperty("webdriver.gecko.driver")));

        WebDriver driver1 = new FirefoxDriver();

        driver1.get("https://www.amazon.com/");
    }
}