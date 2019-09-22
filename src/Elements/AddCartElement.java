package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartElement {
    public WebDriver driver;

    public AddCartElement(WebDriver mdriver) {
        this.driver = mdriver;
        PageFactory.initElements(mdriver, this);
    }


    public void waitfor(WebElement elementToWait){
        WebElement myDynamicElement=(new WebDriverWait(driver,2))
                .until(ExpectedConditions.visibilityOf(elementToWait));
        myDynamicElement.click();
    }

        //********* First Category*******

    @FindBy(xpath = "//a[@title=\"Women\"]")
    WebElement btnwoman;

    public void setBtnwoman() {
        waitfor(btnwoman);
         //btnwoman.click();
    }

    @FindBy(xpath = ".//div[@class=\"product-image-container\"]")
    WebElement product;

    public void clickProduct(){
       // waitfor(product);
        product.click();
    }

    @FindBy(xpath = "//button[@class=\"exclusive\"]")
    WebElement addtoCartButton;

    public void clickAddToCartButton(){
      //  driver.switchTo().frame("fancybox-frame1567579958772");
        addtoCartButton.click();
    }

    //Click continue shopping if you want to
    @FindBy(xpath = ".//i[@class=\"icon-chevron-left left\"]")
    WebElement continueShopping;

    public void clickContinueShpping(){
        continueShopping.click();
    }


      //******** Second Category ******

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement checkoutfirst;

    public void clickCheckout1(){
       waitfor(checkoutfirst);
        //checkoutfirst.click();
    }

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]  ")
    WebElement proceedCheckout1;

    public void clickCheckout2(){
        waitfor(proceedCheckout1);
       // proceedCheckout1.click();
    }

    @FindBy(xpath = "//button[@name=\"processAddress\"]")
    WebElement proceedCheckout2;

    public void clickCheckout3(){
        waitfor(proceedCheckout2);
        //proceedCheckout2.click();
    }
    @FindBy(xpath = "//input[@id=\"cgv\"]")
    WebElement termsCondition;

    public void clickTermsCondition(){
        termsCondition.click();
    }

    @FindBy(xpath = "//button[@name=\"processCarrier\"]")
    WebElement proceedCheckout3;

    public void clickCheckout4(){
        waitfor(proceedCheckout3);
        //proceedCheckout3.click();
    }
    @FindBy(xpath = "//a[@class=\"cheque\"]")
    WebElement payCheck;

    public void clickPayCheck(){
        waitfor(payCheck);
        //payCheck.click();
    }
    @FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
    WebElement conformOrder;

    public void clickSubmit(){
        waitfor(conformOrder);
        //conformOrder.click();
    }
}

