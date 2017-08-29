import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by siava on 28.08.2017.
 */
public class ElementsForCollectionWorkflows extends BasePage {

    public ElementsForCollectionWorkflows(WebDriver driver) {
        super(driver);
    }
    protected By closeInPopupWindow = By.cssSelector(".k-icon.k-i-close");


    protected By allBlockCurrent = By.cssSelector(".wrap-action-block.creation.type-call");

    protected By allBlockOverdueEmail = By.cssSelector(".wrap-action-block.overdue.type-email");

    protected By allBlockDelinquentCall = By.cssSelector(".wrap-action-block.delinquent.type-call");

    protected By allBlockDelinquentEmail = By.cssSelector(".wrap-action-block.delinquent.type-email");

    protected By allBlockDelinquentNotification = By.cssSelector(".wrap-action-block.delinquent.type-notif");


    public WebElement getCollectionWorkflowsButton() {
        waitMills(1500);
        return collectionWorkflowsButton;
    }

    @FindBy(css = ".footer-content")
    public WebElement footer;

    @FindBy(xpath = "//*[@class='left-menu-item'][4]")
    protected WebElement collectionWorkflowsButton;

    public WebElement getNewWorkflowsButton() {
        return newWorkflowsButton;
    }

    @FindBy(css = ".new-template.js-new-template")
    protected WebElement newWorkflowsButton;

    protected @FindBy(xpath = "//*[@data-type='CREATION']")
    WebElement moveToCurrentPlusElement;

    @FindBy(xpath = "//*[@data-type='OVERDUE']")
    WebElement moveToOverduePlusElement;

    @FindBy(xpath = "//*[@data-type='DELINQUENT']")
    WebElement moveToDelinquentPlusElement;


    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='add-menu subreminder js-add-menu k-widget k-reset k-header k-menu k-menu-vertical']")
    protected WebElement moveToDelinquentPlusInEmailSection;

    By email = By.xpath("//*[@data-type='EMAIL']");

    By callForCurrent = By.xpath("//*[@data-type='CREATION']//*[@data-type='CALL']");

    public WebElement getCallForCurrent() {
        return driver.findElement(callForCurrent);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }
    By emailForOverdue = By.xpath("//*[@data-type='OVERDUE']//*[@data-type='EMAIL']");

    public WebElement getEmailForOverude(){
        return driver.findElement(emailForOverdue);
    }
    @FindBy(xpath = "//*[@data-type='DELINQUENT']//*[@data-type='CALL']")
    protected WebElement callForDelinquent;

    @FindBy(xpath = "//*[@data-type='DELINQUENT']//*[@data-type='EMAIL']")
    protected WebElement emailForDelinquent;

    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='js-reminders-list k-group k-menu-group k-popup k-reset k-state-border-left']//*[@data-type='NOTIF']")
    protected WebElement notificaticonForDelinquent;


    @FindBy(xpath = "//*[@class='material-icons js-edit-template-name']")
    protected WebElement editNameButton;

    public WebElement getEditNameButton() {
        return editNameButton;
    }

    @FindBy(xpath = "//*[@class='material-icons js-save-template-name'] ")
    protected WebElement saveTemplateNameButton;

    public WebElement getSaveTemplateNameButton() {
        return saveTemplateNameButton;
    }

    @FindBy(css = ".template-name.js-template-name>input")
    protected WebElement tamplateNameFieldForEdit;

    public WebElement getTamplateNameFieldForEdit() {
        return tamplateNameFieldForEdit;
    }

    @FindBy(css = ".template-name.js-template-name")
    protected WebElement tamplateNameField;

    public WebElement getTamplateNameField() {
        return tamplateNameField;
    }

    @FindBy(xpath = "//*[@class='k-widget k-dropdown k-header issue-creation']" +
            "//*[@class='k-dropdown-wrap k-state-default']")
    WebElement emailFieldForCurrentSectionWidget;

    @FindBy(xpath = ".//*[@class='js-reminder-input add-numbers-max']")
    protected WebElement getDateFieldInWidgetList;

    @FindBy(xpath = "//*[@class='js-remainder-overdue-block']//*[@class='js-reminder-input add-numbers-max']")
    protected WebElement dateInForOverdueSectionWidget;

    @FindBy(xpath = "//*[@class='js-remainder-overdue-block']//*[@class='list']")
    protected WebElement textInOverdueSectionWidget;

    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='js-reminder-input add-numbers-max']")
    protected WebElement dateInDelinquentSectionWidget;

    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='list']")
    protected WebElement textInDelinquentSectionWidget;

    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='delete-btn js-delete-reminder']")
    protected WebElement deleteButtonForDelinquentSection;


    @FindBy(xpath = "//*[@class='js-remainder-delinquent-block']//*[@class='js-repeat']")
    protected WebElement checkBoxForDelinquentSection;



    @FindBy(xpath = "//*[@class='wrap-action-block sub-reminder delinquent type-notif']//*[@class='k-dropdown-wrap k-state-default']")
    protected WebElement textInNotificationSectionWidget;

    @FindBy(xpath = "//*[@class='wrap-action-block sub-reminder delinquent type-notif']//*[@class='sub js-reminder-input add-numbers-max']")
    protected WebElement dayFieldInNotificationSectionWidget;


    By deleteButtonForCurrentSectionBy = By.xpath("//*[@class='js-remainder-creation-block']//*[@class='delete-btn js-delete-reminder']");

    @FindBy(xpath = "//*[@class='js-remainder-creation-block']//*[@class='delete-btn js-delete-reminder']")
    protected WebElement deleteButtonForCurrentSection;


    @FindBy(css = ".save.js-save-template-btn")
    protected WebElement saveTemplateButton;







    public WebElement accountDropDownButtonForAllOper(String section, By element) {
        return driver.findElement(By.className(section)).findElement(element);
    }
}
