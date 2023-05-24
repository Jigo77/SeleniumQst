package Qst3;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FireBox {
    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";

    static String expectedTitle = "The InterNet";

    public static void main(String[] args) {
        FirefoxOptions options= new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("The title is "+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
