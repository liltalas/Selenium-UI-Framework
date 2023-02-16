package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage {

    // annotation takes in a type of locator and the actual locator String itself in order to find n initialize
    // that element to the WebElement variable created below it
    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    @FindBy (xpath = "//span[text()='Error']")
    WebElement errorMessage;

    public void enterValidLoginInfo(){
        usernameInput.sendKeys("helloworld@gmail.com");
        passwordInput.sendKeys("Abc12345");
    }

    public void enterValidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSignInBtn(){
        submitBtn.click();
    }

    public void enterInvalidLoginInfo(String username, String password) throws InterruptedException {
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
        Thread.sleep(3000);
    }

    public void verifyInvalidCredentialsError() throws InterruptedException {
        Assert.assertTrue("Could Not Find the Error Message", errorMessage.isDisplayed());
        Thread.sleep(3000);
    }
}
