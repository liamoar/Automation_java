package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
    public WebDriver driver;

    public LoginPageElement(WebDriver mdriver) {
        PageFactory.initElements(mdriver, this);
    }
         //******** Login **********
    @FindBy(xpath = "//a[@class=\"login\"]")
    WebElement signinButton;

    public void clickSigninButton() {
        signinButton.click();
    }

    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement inputEmailAddress;

    public void clickEmailAddress(){
        inputEmailAddress.sendKeys("testmanuser@gmail.com");
    }
    @FindBy(xpath = "//input[@id=\"passwd\"]")
    WebElement inputPassword;

    public void clickPassword(){
        inputPassword.sendKeys("123Admin@");
    }
    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
    WebElement buttonsignIn;

    public void clickSignin() {

        buttonsignIn.click();
    }
}
