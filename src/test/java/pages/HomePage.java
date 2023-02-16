package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath= "//h1[@id='page-title']")
    WebElement dashboardMessage;

    public void verifyPage(){
        Assert.assertTrue("Dashboard Text message is not visible.", dashboardMessage.isDisplayed() );
    }

    public void goBackToTheLoginPage(){
        driver.navigate().back();
    }
}
