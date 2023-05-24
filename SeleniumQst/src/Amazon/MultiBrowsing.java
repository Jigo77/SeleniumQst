package Amazon;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "edge";
    static WebDriver driver;
    static String url = "https://www.amazon.co.uk/";

    static String expectedTitle="Amazon.co.uk";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firebox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);

        }else if(browser.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        }else {
            System.out.println("Invalid Browser");
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("The title is :"+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
