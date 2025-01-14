package awasomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    @FindBy(css="td[class='product-name'] a") private WebElement productNameFld;

    @FindBy(css="input[type=\"number\"]") private WebElement productQunatityFld;

    @FindBy(css=".checkout-button") private WebElement proceedToCheckoutBtn;

    public CartPage(WebDriver driver) {

        super(driver);
    }

    public String getProductName(){

        return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();
    }

    public int getProductQunatity(){
        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQunatityFld)).getAttribute("value"));
    }

    public void checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
    }
}
