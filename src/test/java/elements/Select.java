package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select extends BaseElements {
    String selectLocator = "//*[@class='select']";
    String optionLocator = "//*[contains(text(), '%s')]";

    public Select(WebDriver driver, String label) {
        super(driver, label);
    }

    public Select select(String option) {
        driver.findElement(By.xpath(selectLocator)).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
        return this;
    }

}
