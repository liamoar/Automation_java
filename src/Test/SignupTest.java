package Test;

import Elements.SignInPageElement;
import data.DataForUsers;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SignupTest extends SetUp {

   // @Test(dataProvider = "UserData",dataProviderClass = DataForUsers.class)
    @Test
    public void SignupFunction() throws InterruptedException {

        SignInPageElement siginPageobj=new SignInPageElement(driver);

        siginPageobj.clicksigninButton();
        Thread.sleep(2000);
        siginPageobj.ClickinputEmail();
        siginPageobj.createaccountButton();
        Thread.sleep(3000);
        siginPageobj.ClickinputFirstName();
        siginPageobj.ClickinputLastName();
        siginPageobj.ClickinputPassword();
        siginPageobj.ClickinputAddress();
        siginPageobj.ClickinputCity();
        siginPageobj.ClickinputState();
        siginPageobj.ClickinputPostcode();
        siginPageobj.ClickinputCountry();
        siginPageobj.ClickinputMobileNumber();
        siginPageobj.ClickinputAlias();
        siginPageobj.ClickRegister();
    }
}
