import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by siava on 22.08.2017.
 */
public class Initialization {

    public static final String EMAIL_FOR_LOGIN = "hnfbr@slipry.net";
    public static final String PASSWORD = "1VN2IC";

    public static final String DEMO_URL = "https://www.demo.yaypay.com/app/login";

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void before() {
        driver.get(DEMO_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);

    }

    @AfterClass
    public void after() {
        driver.close();
        driver.quit();
    }
}
