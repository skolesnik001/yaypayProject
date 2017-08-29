import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by siava on 27.08.2017.
 */
public class DashboardPage extends BasePage{

    protected WebDriver driver;

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void ifPopUpWindowWithUpdateDisplayed() {
        if (driver.findElements(cancelButtonInPopUpWindow).size()>0){
            waitElement(cancelButtonInPopUpWindow(), 10);
            cancelButtonInPopUpWindow().click();
        }
    }

    private By cancelButtonInPopUpWindow = By.cssSelector( ".yaypay-btn.cancel.js-demo-cancel");

    public WebElement cancelButtonInPopUpWindow(){
        return driver.findElement(cancelButtonInPopUpWindow);
    }



}
