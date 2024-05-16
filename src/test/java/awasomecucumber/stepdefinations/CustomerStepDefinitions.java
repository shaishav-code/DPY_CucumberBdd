package awasomecucumber.stepdefinations;

import awasomecucumber.constants.MyConstants;
import awasomecucumber.context.TestContext;
import awasomecucumber.domainObjects.BillingDetails;
import awasomecucumber.pages.PageFactoryManager;
import awasomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinitions {

//    private final WebDriver driver;
    private final TestContext context;

    private final StorePage storePage;

    public CustomerStepDefinitions(TestContext context){
        this.context= context;
//         driver = context.driver;
//        this.storePage = storePage;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @And("my biiling details are")
    public void myBiilingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
//        new StorePage(driver).load(MyConstants.STORE);
        storePage.load(MyConstants.STORE);
    }
}
