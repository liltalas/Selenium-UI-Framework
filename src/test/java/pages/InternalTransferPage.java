package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;

public class InternalTransferPage extends BasePage{

    @FindBy (xpath = "//h1[text()='Internal Transfer']")
    WebElement internalTransferMessage;

    @FindBy (xpath = "//select[@name = 'fromAccount']")
    WebElement fromAccountPath;

    @FindBy (id = "amount")
    WebElement transferAmount;

    @FindBy (xpath = "//select[@name='toAccount']")
    WebElement toAccountPath;

    @FindBy (xpath = "//div[@class='card-footer']/button[@type='submit']")
    WebElement submitButton;

    public void verifyInternalTransferPage(){
        Assert.assertTrue("Not in the right page! ", internalTransferMessage.isDisplayed());
    }

    public void selectFromAccount(String fromAccount) throws InterruptedException {
        Select select = new Select(fromAccountPath);
        select.selectByVisibleText(ConfigReader.getConfigProperty(fromAccount));
        Thread.sleep(3000);
    }

    public void selectToAccount(String toAccount) throws InterruptedException {
        Select select = new Select(toAccountPath);
        select.selectByVisibleText(ConfigReader.getConfigProperty(toAccount));
        Thread.sleep(3000);
    }

    public void enterAmount(String amount) throws InterruptedException {
        transferAmount.sendKeys(ConfigReader.getConfigProperty(amount));
        Thread.sleep(3000);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
