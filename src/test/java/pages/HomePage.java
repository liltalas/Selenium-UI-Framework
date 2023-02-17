package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath= "//h1[@id='page-title']")
    WebElement dashboardMessage;

    @FindBy (xpath = "//a[@id='savings-menu']")
    WebElement savingsMenu;

    @FindBy (xpath = "//a[@id='savings-menu']//following::a[text()='New Savings']")
    WebElement newSavings;

    @FindBy(xpath = "//a[@id='view-savings-menu-item']")
    WebElement viewSavings;

    public void verifyPage(){
        Assert.assertTrue("Dashboard Text message is not visible.", dashboardMessage.isDisplayed() );
    }

    public void goBackToTheLoginPage(){
        driver.navigate().back();
    }

    public void clickOnSavingsMenu() throws InterruptedException {
        savingsMenu.click();
        Thread.sleep(1000);
    }

    public void selectNewSavingsFromMenu()throws InterruptedException{
        newSavings.click();
        Thread.sleep(1000);
    }

    public void clickViewSavingsFromMenu() throws InterruptedException {
        viewSavings.click();
        Thread.sleep(1000);
    }
}
