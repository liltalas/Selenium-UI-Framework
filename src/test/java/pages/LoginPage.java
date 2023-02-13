package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // annotation takes in a type of locator and the actual locator String itself in order to find n initialize
    // that element to the WebElement variable created below it
    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    public void enterValidLoginInfo(){
        usernameInput.sendKeys("helloworld@gmail.com");
        passwordInput.sendKeys("Abc12345");
    }

    public void clickSignInBtn(){
        submitBtn.click();
    }
}
