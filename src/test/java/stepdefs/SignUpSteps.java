package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;

public class SignUpSteps {

    SignUpPage signUp = new SignUpPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
      signUp.verifyUserIsInLoginPage();
    }

    @When("user clicks on Sign Up Here button")
    public void user_clicks_on_sign_up_here_button() throws InterruptedException {
        signUp.clickSignUpHereButton();
        Thread.sleep(3000);
    }

    @Then("verify user is on the info filling form page")
    public void verify_user_is_on_the_info_filling_form_page() {
        signUp.verifyUserIsInSignUpPage();
    }

    @Given("user enters valid credentials to fill out the form")
    public void user_enters_valid_credentials_to_fill_out_the_form() throws InterruptedException{

        signUp.infoFillingPagePartOne();
    }

    @When("user clicks on Next button")
    public void user_clicks_on_next_button() {
        signUp.clickNextButton();
    }

    @Then("verify user is in the second part of the info filling page")
    public void verify_user_is_in_the_second_part_of_the_info_filling_page() {
        signUp.verifyUserIsInSecondPartOfTheForm();
    }

    @Given("user fills out the form")
    public void user_fills_out_the_form() throws InterruptedException{
        signUp.infoFillingPartTwo();
    }

    @When("user clicks on Register button")
    public void user_clicks_on_register_button() {
        signUp.clickRegisterButton();
    }

    @Then("verify user is successfully signed up to the Digital Bank")
    public void verify_user_is_successfully_signed_up_to_the_digital_bank() throws InterruptedException {
        signUp.successMessage();
    }
    

}
