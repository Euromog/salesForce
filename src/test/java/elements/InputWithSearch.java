package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputWithSearch extends BaseElements {
    String inputAndSearchLocator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";
    String optionInputAndSearchLocator = "//*[@role='option']/descendant::div[@title='%s']";
    String searchLocator = "//*[contains(text(), '%s')]/ancestor::div[contains(@class, 'slds-form-element__control')]//button";
    String searchAddressInput = "//*[contains(text(), 'Address Search')]/ancestor::div[contains(@class, 'modal-container')]//input";
    String optionSearchAddressLocator = "//*[@class='option']";

    public InputWithSearch(WebDriver driver, String label) {
        super(driver, label);
    }

    public InputWithSearch inputAndSearch(String option) {
        writeActionMessage(label);
        waiter(inputAndSearchLocator, label);
        sleep(3000);
        findInputWithSearch(inputAndSearchLocator, label).sendKeys(option);
        waiter(optionInputAndSearchLocator, option);
        findInputWithSearch(optionInputAndSearchLocator, option).click();
        return this;
    }

    public InputWithSearch search(String option) {
        writeActionMessage(label);
        findInputWithSearch(searchLocator, label).click();
        waiter(searchAddressInput, label);
        sleep(3000);
        findInputWithSearch(searchAddressInput, label).sendKeys(option);
        waiter(optionSearchAddressLocator, label);
        driver.findElements(By.xpath(optionSearchAddressLocator)).get(0).click();
        return this;
    }

    public WebElement findInputWithSearch(String locator, String inputWithSearchName) {
        return driver.findElement(By.xpath(String.format(locator, inputWithSearchName)));
    }
}
