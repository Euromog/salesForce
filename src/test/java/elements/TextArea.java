package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends BaseElements {
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//textarea";

    public TextArea(WebDriver driver, String label) {
        super.label = label;
        super.driver = driver;
    }

    public TextArea write(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        return this;
    }
}
