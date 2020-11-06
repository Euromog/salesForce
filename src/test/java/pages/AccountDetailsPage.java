package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//*[@title='Details']");
    public static final By IS_TAB_OPENED_LOCATOR = By.xpath("//*[contains(text(), 'Industry')]");
    String accountDetails = "//*[contains(text(), '%s')]/ancestor::div[contains(@class, 'slds-form-element')]//slot[@slot='outputField']";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    public AccountDetailsPage openPage() {
        return this;
    }

    public AccountDetailsPage isPageOpened() {
        waiter(DETAILS_TAB, 20, "Account view page is not opened");
        return this;
    }

    public AccountDetailsPage isTabOpened() {
        waiter(IS_TAB_OPENED_LOCATOR, 20, "Details tab is not opened");
        return this;
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public String getAccountDetails(String text) {
        return driver.findElement(By.xpath(String.format(accountDetails, text))).getText();
    }
}
