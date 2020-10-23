package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));
        } catch (TimeoutException e) {
            Assert.fail("New Account modal page is not opened");
        }
        return this;
    }

    public AccountDetails create(Account account) {
        //new Input(driver, "Account Name").write(account.getName()); //move to inputAndSearch class
        new Input(driver, "Account Name").write(account.getName());
        new DropDown(driver, "Type").select(account.getType());
        new Input(driver, "Website").write(account.getWebSite());
        new TextArea(driver, "Description").write(account.getDescription());

        new Input(driver, "Phone").write(account.getPhone());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(String.valueOf(account.getEmployees()));

        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity()); //BUG!!!!!!!!!!!
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        // Search
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        clickSave();
        return new AccountDetails(driver);
    }

    public AccountDetails clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetails(driver);
    }

    public AccountListPage clickCancel() {
        driver.findElement(CANCEL_BUTTON).click();
        return new AccountListPage(driver);
    }

    public NewAccountModal clickSaveAndNew() {
        driver.findElement(SAVE_NEW_BUTTON).click();
        return this;
    }

    public AccountDetails clickCancelAfterSaveAndNewButton() {
        driver.findElement(CANCEL_BUTTON).click();
        return new AccountDetails(driver);
    }
}

