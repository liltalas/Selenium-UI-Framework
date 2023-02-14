package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverUtilities {

    static WebDriver driver;

    public static void createDriver() {

        switch (ConfigReader.getConfigProperty("app.browser")){
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            default:
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get(ConfigReader.getConfigProperty("app.baseurl"));
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
