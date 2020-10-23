package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage {
    public static final By MY_ACCOUNTS_LOCATOR = By.cssSelector("[title='My Accounts']");
    public static final String ENDPOINT = "page/home";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openPage() {
        driver.get(URL + ENDPOINT);
        return this;
    }

    public HomePage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(MY_ACCOUNTS_LOCATOR));
        } catch (TimeoutException e) {
            Assert.fail("Home page is not opened");
        }
        return this;
    }
}
