package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountDetails extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//*[@title='Details']"); // почему не работает cssSelector???

    public AccountDetails(WebDriver driver) {
        super(driver);
    }

    public AccountDetails openPage() {
        return this;
    }

    public AccountDetails isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB));
        } catch (TimeoutException e) {
            Assert.fail("Account view page is not opened");
        }
        return this;
    }
}
