package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
//ARRANGE
//    - setup
//    - creating objects to be used in test
//    - fetching data you need for test
    WebDriver driver;
    LoginPage login;
    @Given("browser is open")
    public void testBrowserIsOpen() {
        System.setProperty("webdriver.chrome.driver", "/Users/sayeedjoseph/selenium/chromedriver");
        driver = new ChromeDriver();
//        implicit waits
//            - wait for a specified amount of time before throwing an exception for each step.
//        explicit waits
//                - wait for a specified amount of time for a specific element to appear on the browser
//                - deprecated
//        fluent wait
//            - specify to how long to wait
//            - specify the freq. to check when an element appears.
//            - ignore specific exceptions.
//    to increase window size
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void testUserIsOnLoginPage() {
        driver.get("https://example.testproject.io/web/");
        login = new LoginPage(driver);
    }

    // ACT
    @When("^user enters (.*) and (.*)$")
    public void testUserEntersUsernameAndPassword(String username, String password) {
        login.enterUserName(username);
        login.enterPassword(password);
    }

    @And("user clicks on login")
    public void testUserClicksOnLogin() {
        login.clickLogin();
    }

    // ASSERT
    @Then("user is navigated to home page")
    public void testUserIsNavigatedToHomePage() {
        login.checkLogoutIsDisplayed();
        login.closeDriver();
    }
}
