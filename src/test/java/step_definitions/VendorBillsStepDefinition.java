package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.configuration_accounting.DocumentsPage;
import pages.purchasesDocuments.VendorBills;
import utilities.BrowserUtils;
import utilities.Driver;

public class VendorBillsStepDefinition {

    VendorBills vendorBills = new VendorBills();
    DocumentsPage documents = new DocumentsPage();

    @Then("user opens dropdown Documents in Purchases")
    public void user_opens_dropdown_Documents_in_Purchases() {
        documents.documents.click();
        BrowserUtils.wait(5);

    }

    @Then("user clicks on Vendor Bills")
    public void user_clicks_on_Vendor_Bills() {
        documents.vendorBills.click();
        BrowserUtils.wait(5);
    }


    @Then("title should be {string}")
    public void title_should_be(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Then("verify that names on Vendor Bills page and Receipt Page match")
    public void verify_that_names_on_Vendor_Bills_page_and_Receipt_Page_match() {

        String tableVendor = vendorBills.firstVendor.getText();
        vendorBills.firstVendor.click();
        BrowserUtils.wait(4);
        String receiptVendor = vendorBills.receiptVendor.getText();
        Assert.assertEquals(tableVendor,receiptVendor);
    }

    @Then("verify that first checkbox is not selected by default")
    public void verify_that_first_checkbox_is_not_selected_by_default() {
        Assert.assertFalse(vendorBills.firstCheckbox.isSelected());
    }

}
