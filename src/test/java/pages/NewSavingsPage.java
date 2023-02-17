package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage{
    @FindBy (xpath = "//h1[text()='Create Savings']")
    WebElement createSavings;

    @FindBy (id = "Savings")
    WebElement accountType;

    @FindBy (id = "Individual")
    WebElement accountOwnership;

    @FindBy (id = "name")
    WebElement accountName;

    @FindBy (id = "openingBalance")
    WebElement initialDeposit;

    @FindBy (xpath = "//button[@id='newSavingsSubmit']")
    WebElement submitButton;

    public void verifyUserIsInNewSavingsPage(){
        Assert.assertTrue("Not In The New Savings Page! ", createSavings.isDisplayed());
    }

    public void createNewSavingsAccount() throws InterruptedException {
        accountType.click();
        Thread.sleep(1000);
        accountOwnership.click();
        Thread.sleep(1000);
        accountName.sendKeys("abcos");
        Thread.sleep(1000);
        initialDeposit.sendKeys("1000");
        Thread.sleep(1000);
    }

    public void submitTheForm(){
        submitButton.click();
    }
}
