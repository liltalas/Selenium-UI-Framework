package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InternalTransferPage;

public class TransferFundsSteps {

    InternalTransferPage internalTransferPage = new InternalTransferPage();

    @Then("verify user is on the Internal Transfer page")
    public void verify_user_is_on_the_internal_transfer_page() throws InterruptedException {
        internalTransferPage.verifyInternalTransferPage();
        Thread.sleep(3000);
    }

    @When("user selects from account {string}")
    public void user_selects_from_account(String fromAccount) throws InterruptedException {
        internalTransferPage.selectFromAccount(fromAccount);
    }

    @When("user selects to account {string}")
    public void user_selects_to_account(String toAccount) throws InterruptedException {
        internalTransferPage.selectToAccount(toAccount);
    }


    @When("user enters amount {string}")
    public void user_enters_amount(String amount) throws InterruptedException {
        internalTransferPage.enterAmount(amount);
    }


    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        internalTransferPage.clickOnSubmitButton();
    }



}
