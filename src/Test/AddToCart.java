package Test;

import Elements.AddCartElement;
import Elements.LoginPageElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class AddToCart extends SetUp {

    @Test
    public void Loginfunction() throws InterruptedException {
        LoginPageElement loginPageobj = new LoginPageElement(driver);
        loginPageobj.clickSigninButton();
        loginPageobj.clickEmailAddress();
        loginPageobj.clickPassword();
        loginPageobj.clickSignin();
        addProductToCartFunction();
        add2ndProductToCartFunction();
    }


    public void addProductToCartFunction() throws InterruptedException {
        AddCartElement addcartobj = new AddCartElement(driver);
        addcartobj.setBtnwoman();
        addcartobj.clickProduct();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        addcartobj.clickAddToCartButton();
        Thread.sleep(2000);
        addcartobj.clickContinueShpping();


    }


    public void add2ndProductToCartFunction() throws InterruptedException {
        AddCartElement add2ndcartobj = new AddCartElement(driver);
        Thread.sleep(2000);
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
        add2ndcartobj.clickProduct();

        driver.switchTo().frame(0);
        add2ndcartobj.clickAddToCartButton();

        add2ndcartobj.clickCheckout1();

        add2ndcartobj.clickCheckout2();

        add2ndcartobj.clickCheckout3();
        add2ndcartobj.clickTermsCondition();
        add2ndcartobj.clickCheckout4();
        add2ndcartobj.clickPayCheck();
        add2ndcartobj.clickSubmit();

    }
}
