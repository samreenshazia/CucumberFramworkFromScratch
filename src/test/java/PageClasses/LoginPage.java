package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BaseTest;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "userEmail")
    WebElement username;


    @FindBy(css = "input[type='password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement login;

    @FindBy(xpath = "//div //h3")
    WebElement title;



    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client");
    }

    public void loginWithCredentials(String semail, String spassword) {
        username.sendKeys(semail);
        password.sendKeys(spassword);
    }
    public void clickLogin() {

        login.click();
    }

    public boolean isLoginSuccesful()
    {

        String titleText = title.getText();
        String expected = "We Make Your Shopping Simple";
        Assert.assertEquals(titleText, expected);
        return true;
    }
}