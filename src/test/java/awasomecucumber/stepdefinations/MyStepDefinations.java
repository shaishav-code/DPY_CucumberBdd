package awasomecucumber.stepdefinations;
import awasomecucumber.constants.Endpoint;
import awasomecucumber.constants.MyConstants;
import awasomecucumber.context.TestContext;
import awasomecucumber.domainObjects.BillingDetails;
import awasomecucumber.domainObjects.Product;
import awasomecucumber.factory.DriverFactory;
import awasomecucumber.pages.CartPage;
import awasomecucumber.pages.CheckoutPage;
import awasomecucumber.pages.StorePage;
import awasomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;
import java.util.Map;

public class MyStepDefinations {

    public MyStepDefinations(TestContext context){
          driver = context.driver;
    }
    private WebDriver driver;
    private BillingDetails billingDetails;

}
