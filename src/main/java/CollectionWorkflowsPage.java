import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CollectionWorkflowsPage extends ElementsForCollectionWorkflows {


    public CollectionWorkflowsPage(WebDriver driver) {
        super(driver);
    }

    public boolean elementIsNotPresentByXpathElement(By element) {
        return driver.findElements(element).size() == 0;
    }


    public void editWorkflowTitle() {
        waitElement(getNewWorkflowsButton(), 10);
        getNewWorkflowsButton().click();
        waitMills(500);
        waitElement(getEditNameButton(), 10);
        getEditNameButton().click();
        getTamplateNameFieldForEdit().clear();
        getTamplateNameFieldForEdit().sendKeys("New workflow");
        waitElement(getSaveTemplateNameButton(), 10);
        getSaveTemplateNameButton().click();
        assertForAll("New workflow", getTamplateNameField());
    }
    
    public void moveToCurrentSectionAndClickCallAndCheckSetByDefault() {
        waitMills(1000);
        waitElement(moveToCurrentPlusElement, 10);
        waitMills(1000);
        moveToElement(moveToCurrentPlusElement);
        elementIsPresent(email);
        elementIsPresent(callForCurrent);
        waitElement(getCallForCurrent(), 10);
        getCallForCurrent().click();
        waitElement(emailFieldForCurrentSectionWidget, 10);
        waitMills(1000);
        assertForAll("days after creation date", emailFieldForCurrentSectionWidget);
        waitMills(1000);
        assertForAllAttribute("0", getDateFieldInWidgetList);
    }

    public void moveToOverdueSectionAndClickEmailAndCheckSetByDefault(WebElement actionElement) {
        waitElement(moveToOverduePlusElement,10);
        waitMills(1100);
        moveToElement(moveToOverduePlusElement);
        elementIsPresent(email);
        elementIsPresent(callForCurrent);
        waitElement(actionElement, 10);
        actionElement.click();
        waitElement(textInOverdueSectionWidget, 10);
        waitMills(1000);
        assertForAll("days after due date", textInOverdueSectionWidget);
        waitMills(1000);
        assertForAllAttribute("1", dateInForOverdueSectionWidget);
    }
    public void moveToDelinquentSectionAndClickOnActionAndCheckSetByDefault(WebElement actionElement) {
        waitElement(moveToDelinquentPlusElement,10);
        waitMills(1000);
        moveToElement(moveToDelinquentPlusElement);
        elementIsPresent(email);
        elementIsPresent(callForCurrent);
        waitElement(actionElement, 10);
        actionElement.click();
        waitElement(textInOverdueSectionWidget, 10);
        waitMills(1000);
        assertForAll("days after due date", textInDelinquentSectionWidget);
        waitMills(1000);
        assertForAllAttribute("90", dateInDelinquentSectionWidget);
    }

    public void moveToPlusInEmailSectionAndCheckSetByDefault(){
        waitElement(moveToDelinquentPlusInEmailSection,10);
        waitMills(2000);
        moveToElement(moveToDelinquentPlusInEmailSection);
        waitElement(notificaticonForDelinquent, 10);
        notificaticonForDelinquent.click();
        waitElement(textInNotificationSectionWidget,10);
        waitMills(1000);
        assertForAll("days after due date", textInNotificationSectionWidget);
        waitMills(1000);
        assertForAllAttribute("90", dayFieldInNotificationSectionWidget);
    }
}
