package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class SignInPageElement {
    public WebDriver driver;

    Random value = new Random();
    public int digits = value.nextInt(900)+100;


    public SignInPageElement(WebDriver mdriver) {
        this.driver= mdriver;
        PageFactory.initElements(mdriver, this);
    }

    public void waitfor(WebElement elementToWait){
        WebElement myDynamicElement=(new WebDriverWait(driver,2))
                .until(ExpectedConditions.visibilityOf(elementToWait));
        myDynamicElement.click();
    }

    //******** Dashboard Page *******

    @FindBy(xpath = "//a[@class=\"login\"]")
    WebElement signinButton;

    public void clicksigninButton() {
       waitfor(signinButton);
       // signinButton.click();
    }

    //********* Signin Page *******

    @FindBy(xpath = "//input[@id=\"email_create\"]")
    WebElement inputEmail;

    public void ClickinputEmail() {
        waitfor(inputEmail);
        String gmail = String.valueOf(digits);
        inputEmail.sendKeys("testusera"+gmail+"@test.com");
    }

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    WebElement signupButton;

    public void createaccountButton() {
        signupButton.click();
    }

    //********** Signup Form **************

    @FindBy(xpath = ".//input[@id='customer_firstname']")
   WebElement inputname;

//    public void Excelinputname(String Firstname){
//        inputname.sendKeys(Firstname);
//    }

    public void ClickinputFirstName() {
       inputname.sendKeys("avinash");
    }

   @FindBy(xpath = ".//input[@id='customer_lastname']")
   WebElement inputLastName;

    public void ClickinputLastName() {
        inputLastName.sendKeys("shrestha");
    }

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    WebElement inputPassword;

    public void ClickinputPassword() {
        inputPassword.sendKeys("123456");
    }

    @FindBy(xpath = "//input[@id=\"address1\"]")
    WebElement inputAddress;

    public void ClickinputAddress() {
        inputAddress.sendKeys("Nepal");
    }

    @FindBy(xpath = "//input[@id=\"city\"]")
    WebElement inputCity;

    public void ClickinputCity() {
        inputCity.sendKeys("Kathmandu");
    }

    @FindBy(xpath = "//select[@id=\"id_state\"]/option[@value=\"3\"]")
    WebElement inputState;

    public void ClickinputState() {
        inputState.click();
    }

    @FindBy(xpath = "//input[@id=\"postcode\"]")
    WebElement inputPostcode;

    public void ClickinputPostcode() {
        inputPostcode.sendKeys("45444");
    }

    @FindBy(xpath = "//select[@id=\"id_country\"]")
    WebElement inputcountry;

    public void ClickinputCountry() {
        inputcountry.click();
    }

    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    WebElement inputMobileNumber;

    public void ClickinputMobileNumber() {
        inputMobileNumber.sendKeys("1234567890");
    }


    @FindBy(xpath = "//input[@id=\"alias\"]")
    WebElement inputAlias;

    public void ClickinputAlias() {
        inputAlias.sendKeys("avinash");
    }

    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    WebElement inputRegister;

    public void ClickRegister() {
        inputRegister.click();
    }


}
