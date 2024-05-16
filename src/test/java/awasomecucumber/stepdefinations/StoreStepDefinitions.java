package awasomecucumber.stepdefinations;

import awasomecucumber.apis.CartApi;
import awasomecucumber.constants.Endpoint;
import awasomecucumber.context.TestContext;
import awasomecucumber.domainObjects.Product;
import awasomecucumber.pages.PageFactoryManager;
import awasomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinitions {

    private final StorePage storePage;
    private final TestContext context;


    public StoreStepDefinitions(TestContext context){
          this.context = context;
          storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I'm on the store page")
    public void iMOnTheStorePage() throws InterruptedException {
        storePage.load(Endpoint.STORE.url);
    }

    @When("I add {product} to the cart")
    public void iAddToTheCart(Product product)
    {
        storePage.add_to_cart(product.getName());
//        new StorePage(driver).add_to_cart(product.getName());
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() {
//        new StorePage(driver).add_to_cart("Blue Shoes");
        // Blue Shoes
        CartApi cartApi = new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215,1);
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);
    }
}
