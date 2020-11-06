package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        waiter(MY_ACCOUNTS_LOCATOR, 20, "Home page is not opened");
        return this;
    }
}
