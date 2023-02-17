package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

import java.util.List;

public class ViewSavingsPage extends BasePage {

    @FindBy (xpath = "//strong[text()='Transactions']")
    WebElement transactionsText;

    @FindBy (xpath = "//div[@id='firstRow']")
    List<WebElement> savingsInfoCheck;

    public void verifyViewSavingsAccountPage(){
        Assert.assertTrue("Text Does Not Display", transactionsText.isDisplayed());
    }

    public void confirmUserHasTheCorrectDataForNewlyCreatedAccount(){


        for(WebElement accountInfo: savingsInfoCheck){
            String accountName = ConfigReader.getConfigProperty("savings.name");
            String accountBalance = ConfigReader.getConfigProperty("savings.deposit");
            String accountType = ConfigReader.getConfigProperty("savings.accountType");
            String accountOwnership = ConfigReader.getConfigProperty("savings.ownership");

            Assert.assertTrue("account name did NOT display", accountInfo.getText().contains(accountName));
            Assert.assertTrue("account balance did NOT display", accountInfo.getText().contains(accountBalance));
            Assert.assertTrue("account type did NOT display", accountInfo.getText().contains(accountType));
            Assert.assertTrue("account Ownership did NOT display", accountInfo.getText().contains(accountOwnership));

            System.out.println("Success!");

        }
    }

}
