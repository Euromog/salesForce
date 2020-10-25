package pages;

import elements.Input;
import elements.InputWithSearch;
import elements.Select;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage {
    public static final String ENDPOINT = "o/Contact/new";
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewContactModal openPage() {
        driver.get(URL + ENDPOINT);
        return this;
    }

    @Override
    public NewContactModal isPageOpened() {
        waiter(SAVE_BUTTON, 20, "New Contact modal page is not opened");
        return this;
    }

    public ContactDetailsPage create(Contact contact) {
        new Select(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new InputWithSearch(driver, "Account Name").inputAndSearch(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new InputWithSearch(driver, "Mailing Address").search(contact.getMailingAddress());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        clickSave();
        return new ContactDetailsPage(driver);
    }

    public ContactDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }
}
