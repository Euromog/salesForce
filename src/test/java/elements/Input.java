package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElements {
    String inputLocator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public Input write(String text) {
        WebElement inputBox = driver.findElement(By.xpath(String.format(inputLocator, label)));
        String textInsideInputBox = inputBox.getAttribute("value");
        if (textInsideInputBox.isEmpty()) {
            writeActionMessage(text);
            waiter(inputLocator, label);
            findInput(label).sendKeys(text);
        }
        return this;
    }

    public WebElement findInput(String inputName) {
        return driver.findElement(By.xpath(String.format(inputLocator, inputName)));
    }
}
