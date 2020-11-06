package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage {
    public static final By IS_TAB_OPENED_LOCATOR = By.xpath("//*[contains(text(), 'Department')]");
    public static final By DETAILS_TAB = By.xpath("//*[@title='Details']");
    String contactDetails = "//*[contains(text(), '%s')]/ancestor::div[contains(@class, 'slds-form-element')]//slot[@slot='outputField']";

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactDetailsPage openPage() {
        return this;
    }

    @Override
    public ContactDetailsPage isPageOpened() {
        waiter(IS_TAB_OPENED_LOCATOR, 20, "Details tab is not opened");
        return this;
    }

    public ContactDetailsPage isTabOpened() {
        waiter(IS_TAB_OPENED_LOCATOR, 20, "Details tab is not opened");
        return this;
    }

    public ContactDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public String getAccountDetails(String text) {
        return driver.findElement(By.xpath(String.format(contactDetails, text))).getText();
    }
}
