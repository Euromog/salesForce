package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {
    public static final String ENDPOINT = "o/Contact/list?filterName=Recent";
    By newButton = By.cssSelector("[title=New]");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactListPage openPage() {
        driver.get(URL + ENDPOINT);
        return this;
    }

    @Override
    public ContactListPage isPageOpened() {
        waiter(newButton, 20, "Contact page is not opened");
        return this;
    }

    public NewContactModal clickNew() {
        driver.findElement(newButton).click();
        return new NewContactModal(driver);
    }
}
