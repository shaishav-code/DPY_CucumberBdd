package awasomecucumber.stepdefinations;
import awasomecucumber.context.TestContext;
import awasomecucumber.domainObjects.Product;
import awasomecucumber.pages.CartPage;
import awasomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class CartStepDefinitions {
    private final CartPage cartPage;
    public CartStepDefinitions(TestContext context){
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int qunatity, Product product) {
//        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(product.getName(),cartPage.getProductName());
        Assert.assertEquals(qunatity,cartPage.getProductQunatity());
    }
}
