package stepdefs;

import io.cucumber.java.en.Then;
import pages.ViewCheckingAccountPage;

public class ViewCheckingAccountSteps {

    ViewCheckingAccountPage viewCheckingAccountPage = new ViewCheckingAccountPage();
    @Then("verify user is on View Accounts Page")
    public void verify_user_is_on_view_accounts_page() throws InterruptedException {
        viewCheckingAccountPage.verifyAccountPage();
    }

    @Then("verify transaction history for the new transaction")
    public void verify_transaction_history_for_the_new_transaction() {
        viewCheckingAccountPage.verifyTransactionHistory();
    }

    @Then("verify transaction details getting updated into the database")
    public void verify_transaction_details_getting_updated_into_the_database() {
        viewCheckingAccountPage.verifyDetailsIntoDatabase();
    }
}
