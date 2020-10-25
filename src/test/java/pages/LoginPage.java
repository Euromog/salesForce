package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static final By SIGN_IN_BUTTON = By.id("Login");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(SIGN_IN_BUTTON).click();
        return new HomePage(driver);
    }

    @Override
    public LoginPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        waiter(SIGN_IN_BUTTON, 20, "Login page is not opened.  Locator" + SIGN_IN_BUTTON + " is not found");
        return this;
    }
}
