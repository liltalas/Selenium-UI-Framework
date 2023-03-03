package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    // creating objects since 1 class can extend only 1 class
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password){
        loginPage.enterValidLoginInfo(username, password);
    }

    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }


    @Given("user enters invalid username {string} and password {string}")
    public void user_enters_invalid_username_and_password(String username, String password) throws InterruptedException {
        loginPage.enterInvalidLoginInfo(username, password);
    }

    @Then("verify user receives the error message in the login page")
    public void verify_user_receives_the_error_message_in_the_login_page() throws InterruptedException{
        loginPage.verifyInvalidCredentialsError();
    }

    @And("user put a check on Remember Me box")
    public void user_put_a_check_on_remember_me_box() throws InterruptedException{
        loginPage.clickRememberMeBox();
    }

    @When("user go backs to the Login page")
    public void user_go_backs_to_the_login_page() {
        homePage.goBackToTheLoginPage();
    }

    @Then("verify user is on the login page")
    public void verify_user_is_on_the_login_page()  throws InterruptedException {
        loginPage.verifyUserIsInLoginPage();
    }
}
