package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    // creating objects since 1 class can extend only 1 class
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
    homePage.verifyPage();
    }
}
