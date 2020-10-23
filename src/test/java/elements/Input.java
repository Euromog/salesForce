package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElements {
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        super.driver = driver;
        super.label = label;
    }

    public Input write(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        return this;
    }
}
