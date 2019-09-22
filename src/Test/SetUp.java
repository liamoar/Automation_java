package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SetUp {
    public WebDriver driver;
    public String MYURL ="http://automationpractice.com";

    public void checkOs(){
        String operatingsystem = System.getProperty("os.name").toLowerCase();
        System.out.println("current os is :" +operatingsystem);

        if(operatingsystem.contains("windows")){
            System.setProperty("webdriver.chrome.driver", "Webdriver/chromedriver.exe");

        }else {
            System.setProperty("webdriver.chrome.driver", "Webdriver/chromedriver");
        }
    }

    @BeforeMethod
    public void setupAndTearDown(){
        checkOs();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(MYURL);

    }
    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
