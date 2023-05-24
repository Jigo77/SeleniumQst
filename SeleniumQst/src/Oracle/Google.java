package Oracle;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Google {
    static WebDriver driver;
    static String url = "https://en.wikipedia.org/wiki/Oracle_Corporation";
    static String excepctedTitle="Oracle Corporation";

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of page is :"+actualTitle);
        Assert.assertTrue(excepctedTitle.equals(actualTitle));
        driver.quit();
    }
}
