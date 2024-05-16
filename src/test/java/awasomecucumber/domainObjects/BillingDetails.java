package awasomecucumber.domainObjects;

import org.openqa.selenium.WebDriver;

public class BillingDetails {
    private WebDriver driver;

    private String billingFirstName;
    private String billingLastName;
    private String billnigAddressOne;
    private String billingCity;
    private String billingStateName;
    private String billingZip;
    private String billingEmail;

    public BillingDetails(String billingFirstName, String billingLastName, String billnigAddressOne,
                          String billingCity, String billingStateName, String billingZip, String billingEmail)
    {
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billnigAddressOne = billnigAddressOne;
        this.billingCity = billingCity;
        this.billingStateName = billingStateName;
        this.billingZip = billingZip;
        this.billingEmail = billingEmail;
    }

    public String getBillingFirstName() {

        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {

        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {

        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {

        this.billingLastName = billingLastName;
    }

    public String getBillnigAddressOne() {

        return billnigAddressOne;
    }

    public void setBillnigAddressOne(String billnigAddressOne) {

        this.billnigAddressOne = billnigAddressOne;
    }

    public String getBillingCity() {

        return billingCity;
    }

    public void setBillingCity(String billingCity) {

        this.billingCity = billingCity;
    }

    public String getBillingStateName() {

        return billingStateName;
    }

    public void setBillingStateName(String billingStateName) {

        this.billingStateName = billingStateName;
    }

    public String getBillingZip() {

        return billingZip;
    }

    public void setBillingZip(String billingZip) {

        this.billingZip = billingZip;
    }

    public String getBillingEmail() {

        return billingEmail;
    }

    public void setBillingEmail(String billingEmail)
    {
        this.billingEmail = billingEmail;
    }

}
