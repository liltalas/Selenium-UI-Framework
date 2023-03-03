package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingAccountPage extends BasePage{

    @FindBy (xpath = "//h1[text()='View Checking Accounts']")
    WebElement checkingAccountPage;

    @FindBy (xpath = "//*[@id=\"transactionTable\"]/tbody/tr[1]/td[4]")
    WebElement transactionHistory;
    public void verifyAccountPage() throws InterruptedException {
        Assert.assertTrue("Not inside of the Checking Account Page", checkingAccountPage.isDisplayed());
        Thread.sleep(3000);
    }

    public void verifyTransactionHistory() {
        //Assert.assertEquals("transactions does not match", 150.00, transactionHistory.getText());
    }

    public void verifyDetailsIntoDatabase() {
    }
}
