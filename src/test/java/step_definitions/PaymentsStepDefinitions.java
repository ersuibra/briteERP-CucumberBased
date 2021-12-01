package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.configuration_accounting.DocumentsPage;
import pages.purchasesDocuments.Payments;
import utilities.BrowserUtils;

public class PaymentsStepDefinitions {

    DocumentsPage documents = new DocumentsPage();
    Payments payments = new Payments();


    @Then("user clicks on Payments")
    public void user_clicks_on_Payments() {
        documents.payments.click();
        BrowserUtils.wait(5);
    }

    @Then("verify that Create button is clickable")
    public void verify_that_Create_button_is_clickable() {
        Assert.assertTrue(BrowserUtils.isClickable(payments.create));
    }

    @Then("verify that amoun on Payments Page and Receipt Page match")
    public void verify_that_amoun_on_Payments_Page_and_Receipt_Page_match() {
        String amountPayments = payments.firstAmount.getText();
        payments.firstAmount.click();
        BrowserUtils.wait(5);
        String amountReceipt = payments.receiptAmount.getText();
        Assert.assertEquals(amountPayments, amountReceipt);
    }






}
