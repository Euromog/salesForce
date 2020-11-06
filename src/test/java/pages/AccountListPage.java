package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {
    public static final String ENDPOINT = "o/Account/list?filterName=Recent";
    By newButton = By.cssSelector("[title=New]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage openPage() {
        driver.get(URL + ENDPOINT);
        return this;
    }

    public AccountListPage isPageOpened() {
        waiter(newButton, 20, "Accounts page is not opened");
        return this;
    }

    public NewAccountModal clickNew() {
        driver.findElement(newButton).click();
        return new NewAccountModal(driver);
    }
}
