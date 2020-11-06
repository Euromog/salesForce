package pages;

import elements.DropDown;
import elements.Input;
import elements.InputWithSearch;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BasePage {
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");
    public static final By CANCEL_BUTTON = By.cssSelector("[title=Cancel]");
    public static final By SAVE_NEW_BUTTON = By.cssSelector("[title='Save & New']");
    public static final String ENDPOINT = "o/Account/new";

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public NewAccountModal openPage() {
        driver.get(URL + ENDPOINT);
        return this;
    }

    public NewAccountModal isPageOpened() {
        waiter(SAVE_BUTTON, 20, "New Account modal page is not opened");
        return this;
    }

    public AccountDetailsPage create(Account account) {
        new InputWithSearch(driver, "Account Name").inputAndSearch(account.getName());
        new DropDown(driver, "Type").select(account.getType());
        new Input(driver, "Website").write(account.getWebSite());
        new TextArea(driver, "Description").write(account.getDescription());
        new Input(driver, "Phone").write(account.getPhone());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(String.valueOf(account.getEmployees()));
        new InputWithSearch(driver, "Billing Address").search(account.getBillingAddress());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new InputWithSearch(driver, "Shipping Address").search(account.getShippingAddress());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        clickSave();
        return new AccountDetailsPage(driver);
    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }

    public AccountListPage clickCancel() {
        driver.findElement(CANCEL_BUTTON).click();
        return new AccountListPage(driver);
    }

    public NewAccountModal clickSaveAndNew() {
        driver.findElement(SAVE_NEW_BUTTON).click();
        return this;
    }

    public AccountDetailsPage clickCancelAfterSaveAndNewButton() {
        driver.findElement(CANCEL_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}

