import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by siava on 22.08.2017.
 */
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void waitElement(WebElement element, int period) {
        new WebDriverWait(driver, period).until((ExpectedConditions.visibilityOf(element)));
    }

    public void waitMills(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 1, 1).click(element).build().perform();
    }
    public void moveToElementInEmail(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 1, 1).build().perform();
    }

    public boolean assertForAll(String expectedError, WebElement element) {
        waitElement(element, 20);
        String errorFieldText = element.getText();
        if (!errorFieldText.contains(expectedError)) {
            String errorMessage = String.format(
                    "Expected result: %s , not found. Actual error field value: %s",
                    expectedError,
                    errorFieldText);
            throw new AssertionError(errorMessage);
        }
        return false;
    }
    public boolean assertForAllAttribute(String expectedError, WebElement element) {
        waitElement(element, 20);
        String errorFieldText = element.getAttribute("value");
        if (!errorFieldText.contains(expectedError)) {
            String errorMessage = String.format(
                    "Expected result: %s , not found. Actual error field value: %s",
                    expectedError,
                    errorFieldText);
            throw new AssertionError(errorMessage);
        }
        return false;
    }

    public boolean elementIsPresent(By element) {
        return driver.findElements(element).size() > 0;
    }

}
