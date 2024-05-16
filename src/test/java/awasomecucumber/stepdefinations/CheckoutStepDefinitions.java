package awasomecucumber.stepdefinations;

import awasomecucumber.constants.Endpoint;
import awasomecucumber.context.TestContext;
import awasomecucumber.domainObjects.BillingDetails;
import awasomecucumber.pages.CartPage;
import awasomecucumber.pages.CheckoutPage;
import awasomecucumber.pages.PageFactoryManager;
import awasomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutStepDefinitions {

    private final CheckoutPage checkoutPage;
    private final TestContext context;

    public CheckoutStepDefinitions(TestContext context){
        this.context= context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }



    @When("I provide billing details")
    public void iProvideBillingDetails() {
//        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setBillingDetails(context.billingDetails);
    }

    @And("I place order")
    public void iPlaceOrder()
    {

        checkoutPage.placeOrder();
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        checkoutPage.getNotice();
        Assert.assertEquals("Thank you. Your order has been received." , checkoutPage.getNotice());
    }

    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage()
    {

//        cartPage.checkout();
        checkoutPage.load(Endpoint.CHECKOUT.url);
    }
}
