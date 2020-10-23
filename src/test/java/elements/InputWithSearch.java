package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputWithSearch extends BaseElements {
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";
    String optionLocator = "//*[@title=Apple]";

    public InputWithSearch(WebDriver driver, String label) {
        super.driver = driver;
        super.label = label;
    }

    public InputWithSearch search (String option) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(option);

        return this;
    }
}
