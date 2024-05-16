package awasomecucumber.pages;

import awasomecucumber.domainObjects.BillingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

    @FindBy(id ="billing_first_name") private WebElement billingFirstNameFld;
    @FindBy(id = "billing_last_name") private WebElement billingLastNameFld;
    @FindBy(id = "billing_address_1") private WebElement billingAddressOneFld;
    @FindBy(id = "billing_city") private WebElement billingCityFld;
   @FindBy(id = "billing_state") private WebElement billingStateDropDown;
//   @FindBy(id = "select2-billing-state-container") private WebElement alternateBillingStateDropDown;

    @FindBy(id = "billing_postcode") private WebElement billingZipcode;
    @FindBy(id = "billing_email") private WebElement billingEmailFld;
    @FindBy(id = "place_order") private WebElement placeOrderBtn;
    @FindBy(css = ".woocommerce-notice") private WebElement noticeTxt;
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterBillingFirstName(String billingFirstName ){
      WebElement e = wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
      e.clear();
      e.sendKeys(billingFirstName);
      return this;
    }

    public CheckoutPage enterBillingLastName(String billingLastName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
        e.clear();
        e.sendKeys(billingLastName);
        return this;
    }

    public CheckoutPage enterBillingAddressLineone(String billingAddressLineone){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingAddressOneFld));
        e.clear();
        e.sendKeys(billingAddressLineone);
        return this;
    }

    public CheckoutPage enterBillingCity(String billingCity){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingCityFld));
        e.clear();
        e.sendKeys(billingCity);
        return this;
    }

    public CheckoutPage selectBillingState(String billingStateName){

        Select select = new Select(wait.until(ExpectedConditions.visibilityOf(billingStateDropDown)));
        select.selectByVisibleText(billingStateName);
        return this;
    }

    public CheckoutPage enterBillingZip(String billingZip){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingZipcode));
        e.clear();
        e.sendKeys(billingZip);
        return this;
    }

    public CheckoutPage enterBillingEmail(String billingEmail){
      WebElement e = wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
      e.clear();
      e.sendKeys(billingEmail);
      return this;
    }

    public CheckoutPage setBillingDetails(BillingDetails billingDetails){
        // Builder pattern

        return enterBillingFirstName(billingDetails.getBillingFirstName()).
                enterBillingLastName(billingDetails.getBillingLastName()).
                enterBillingAddressLineone(billingDetails.getBillnigAddressOne()).
                enterBillingCity(billingDetails.getBillingCity()).
                selectBillingState(billingDetails.getBillingStateName()).
                enterBillingZip(billingDetails.getBillingZip()).
                enterBillingEmail(billingDetails.getBillingEmail());
    }

    public CheckoutPage placeOrder(){
    wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
      return this;
    }

    public String getNotice(){
      return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
    }
}
