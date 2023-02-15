package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

// we need to extend BasePage, otherwise our webElement won't be initialized, thus we will get a NullPointerException
public class SignUpPage extends BasePage {

    @FindBy (id = "username")
    WebElement userName;
    @FindBy (xpath = "//a[contains(text(), ' Sign Up Here')]")
    WebElement signUpHere;

    @FindBy (xpath = "//strong[contains(text(),'Title')]")
    WebElement title;

    // first part of the Info Filling Page
    @FindBy (tagName = "select")
    WebElement dropdown;

    @FindBy (css = "#firstName")
    WebElement firstName;

    @FindBy (id = "lastName")
    WebElement lastName;

    @FindBy (xpath = "//input[@value='F']")
    WebElement gender;

    @FindBy (xpath = "//div[@class='form-group'][4]/input")
    WebElement dateOfBirth;

    @FindBy (css = "#ssn")
    WebElement ssn;

    @FindBy (css = "#emailAddress")
    WebElement emailAddress;

    @FindBy (id = "password")
    WebElement password;

    @FindBy (id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy (xpath = "//button[text()='Next']")
    WebElement nextButton;

    // Second part of the Info Filling Page
    @FindBy (id = "address")
    WebElement address;

    @FindBy (id = "locality")
    WebElement locality;

    @FindBy (id = "region")
    WebElement stateName;

    @FindBy (id = "postalCode")
    WebElement postalCode;

    @FindBy (id = "country")
    WebElement country;

    @FindBy (id = "homePhone")
    WebElement homePhone;

    @FindBy (id = "mobilePhone")
    WebElement mobilePhone;

    @FindBy (id = "workPhone")
    WebElement workPhone;

    @FindBy (id = "agree-terms")
    WebElement agreeTheTermsAndPolicy;

    @FindBy (xpath = "//button[text()='Register']")
    WebElement registerButton;

    @FindBy (xpath = "//span[text()='Registration Successful. Please Login.']")
    WebElement registrationSuccessful;


    public void verifyUserIsInLoginPage(){
        Assert.assertTrue("Sign Up Here Not Found in the Login Page!", userName.isDisplayed());
    }

    public void clickSignUpHereButton(){
        signUpHere.click();
    }

    public void verifyUserIsInSignUpPage(){
        Assert.assertTrue("Title text NOT Found", title.isDisplayed());
    }

    public void infoFillingPagePartOne() throws InterruptedException {
        Select selectTitle = new Select(dropdown);
        selectTitle.selectByVisibleText("Ms.");

        Thread.sleep(1000);

        firstName.sendKeys("Love");
        lastName.sendKeys("Sun");

        Thread.sleep(1000);

        gender.click();

        dateOfBirth.sendKeys("01/22/2000");

        Thread.sleep(1000);

        ssn.sendKeys("777-77-7078");

        Thread.sleep(1000);

        emailAddress.sendKeys("asman@gmail.com");
        Thread.sleep(1000);
        password.sendKeys("Bcd#12345");
        Thread.sleep(1000);
        confirmPassword.sendKeys("Bcd#12345");
        Thread.sleep(1000);
    }

    public void clickNextButton(){
        nextButton.click();
    }

    public void verifyUserIsInSecondPartOfTheForm(){
        Assert.assertTrue("User is Not In The Second Part Of the Info Filling Page", address.isDisplayed());
    }

    public void infoFillingPartTwo() throws InterruptedException {
        address.sendKeys("Cute Cat Avenue");
        Thread.sleep(1000);

        locality.sendKeys("SF");
        Thread.sleep(1000);

        stateName.sendKeys("California");
        Thread.sleep(1000);

        postalCode.sendKeys("93256");
        Thread.sleep(1000);

        country.sendKeys("United States");
        Thread.sleep(1000);

        homePhone.sendKeys("294-345-7626");
        Thread.sleep(1000);
        mobilePhone.sendKeys("345-239-8464");
        Thread.sleep(1000);
        workPhone.sendKeys("893-924-4728");
        Thread.sleep(1000);

        agreeTheTermsAndPolicy.click();
        Thread.sleep(1000);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void successMessage() throws InterruptedException {
        Assert.assertTrue("Success Text Not found", registrationSuccessful.isDisplayed());
        Thread.sleep(4000);
    }
}
