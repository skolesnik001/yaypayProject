import org.testng.annotations.Test;

/**
 * Created by siava on 22.08.2017.
 */
public class CollectionWorkflowsTest extends Initialization {


    LoginPage loginPage = new LoginPage(driver);
    CollectionWorkflowsPage collectionWorkflowsPage = new CollectionWorkflowsPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);

    @Test
    public void collectionWorkflowsCase() {
        loginPage.userAuthorization(EMAIL_FOR_LOGIN, PASSWORD);
        dashboardPage.ifPopUpWindowWithUpdateDisplayed();
        collectionWorkflowsPage.waitMills(1000);
        collectionWorkflowsPage.waitElement(collectionWorkflowsPage.getCollectionWorkflowsButton(), 40);
        collectionWorkflowsPage.getCollectionWorkflowsButton().click();
        collectionWorkflowsPage.editWorkflowTitle();
        collectionWorkflowsPage.moveToCurrentSectionAndClickCallAndCheckSetByDefault();
        collectionWorkflowsPage.moveToOverdueSectionAndClickEmailAndCheckSetByDefault(collectionWorkflowsPage.getEmailForOverude());
        collectionWorkflowsPage.moveToDelinquentSectionAndClickOnActionAndCheckSetByDefault(collectionWorkflowsPage.callForDelinquent);
        collectionWorkflowsPage.deleteButtonForCurrentSection.click();
        collectionWorkflowsPage.elementIsNotPresentByXpathElement(collectionWorkflowsPage.deleteButtonForCurrentSectionBy);
        collectionWorkflowsPage.moveToDelinquentSectionAndClickOnActionAndCheckSetByDefault(collectionWorkflowsPage.emailForDelinquent);
        collectionWorkflowsPage.moveToPlusNotificationSectionAndCheckSetByDefault();
        collectionWorkflowsPage.waitElement(collectionWorkflowsPage.saveTemplateButton,10);
        collectionWorkflowsPage.saveTemplateButton.click();
        collectionWorkflowsPage.elementIsPresent(collectionWorkflowsPage.allBlockOverdueEmail);
        collectionWorkflowsPage.elementIsPresent(collectionWorkflowsPage.allBlockDelinquentCall);
        collectionWorkflowsPage.elementIsPresent(collectionWorkflowsPage.allBlockDelinquentNotification);
        collectionWorkflowsPage.elementIsPresent(collectionWorkflowsPage.allBlockDelinquentEmail);






    }




}
