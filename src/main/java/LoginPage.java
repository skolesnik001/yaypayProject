import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by siava on 22.08.2017.
 */
public class LoginPage extends BasePage{

    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#login-pass")
    private WebElement passwordField;

    @FindBy(css = ".btn.btn-primary.btn-large.btn-block")
    private WebElement signInButton;



    public void userAuthorization(String login, String password){
        waitElement(emailField,20);
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();

    }
}
