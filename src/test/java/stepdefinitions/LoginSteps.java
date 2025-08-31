package stepdefinitions;

import PageClasses.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    private final String email = "samreen@gmail.com";
    private final String password = "Allah@786";

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        driver = BaseTest.driver;
        loginPage = new LoginPage(driver);
        loginPage.goTo();
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() {
        loginPage.loginWithCredentials(email, password);
    }

    @And("User clicks on the login button")
    public void userClicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should be redirected to the dashboard page")
    public void userShouldBeRedirectedToDashboard() {
        boolean isLoggedIn = loginPage.isLoginSuccesful();
    }
}