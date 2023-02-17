package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.NewSavingsPage;
import pages.ViewSavingsPage;

public class NewSavingsSteps {

    HomePage homePage = new HomePage();
    ViewSavingsPage viewSavingsPage = new ViewSavingsPage();
    NewSavingsPage newSavingsPage = new NewSavingsPage();
    @When("user clicks savings menu and selects new savings")
    public void user_clicks_on_savings_menu_and_selects_new_savings() throws InterruptedException{
        homePage.clickOnSavingsMenu();
        homePage.selectNewSavingsFromMenu();
    }
    @Then("verify user open up the new savings page")
    public void verify_user_open_up_the_new_savings_page() {
        newSavingsPage.verifyUserIsInNewSavingsPage();
    }

    @Given("user selects savings account type, ownership, name, and initial deposit")
    public void user_selects_savings_account_type_ownership_name_and_initial_deposit() throws InterruptedException {
        newSavingsPage.createNewSavingsAccount();
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        newSavingsPage.submitTheForm();
    }

    @Then("verify user has created the account and has the correct data")
    public void verify_user_has_created_the_account_and_has_the_correct_data()throws InterruptedException{
        homePage.clickOnSavingsMenu();
        homePage.clickViewSavingsFromMenu();
        viewSavingsPage.verifyViewSavingsAccountPage();
        viewSavingsPage.confirmUserHasTheCorrectDataForNewlyCreatedAccount();
    }

}
