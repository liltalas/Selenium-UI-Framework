package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtilities;

public class BasePage {

    WebDriver driver = DriverUtilities.getDriver();

    public BasePage(){
        // class in Selenium that helps Page Object Model easier and more proficient to implement.
        // it will essentially dynamically initialize the WebElements on the page
        //.initElements method is used to initialize the elements and we need to pass the driver and the object
        // page that we want to initialize the element on
        PageFactory.initElements(driver,this);
    }
}
