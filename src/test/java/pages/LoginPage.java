package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//AUT - Application Under Test
//SUT - System Under Test
//being tested for correct operation.
public class LoginPage {
//    Access modifier that limits the scope of the field to the class and subclasses within the package.
//    A subclass uses the extends keyword.
    protected  WebDriver driver;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
       driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void checkLogoutIsDisplayed() {
        driver.findElement(btn_logout).isDisplayed();
    }

    public void closeDriver() {
        driver.close();
    }
}
