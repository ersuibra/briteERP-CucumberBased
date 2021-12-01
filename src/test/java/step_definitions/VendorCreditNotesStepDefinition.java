package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.configuration_accounting.DocumentsPage;
import pages.purchasesDocuments.VendorCreditNotes;
import utilities.BrowserUtils;
import utilities.Driver;

public class VendorCreditNotesStepDefinition {
    DocumentsPage documents = new DocumentsPage();
    VendorCreditNotes vendorCreditNotes = new VendorCreditNotes();

    @Then("user clicks on Vendor Credit Notes")
    public void user_clicks_on_Vendor_Credit_Notes() {
        documents.vendorCreditNotes.click();
        BrowserUtils.wait(5);
    }

    @Then("verify that import button is clickable")
    public void verify_that_import_button_is_clickable() {
        Assert.assertTrue(BrowserUtils.isClickable(vendorCreditNotes.importButton));
    }

    @Then("click on first checkbox")
    public void click_on_first_checkbox() {
        vendorCreditNotes.firstCheckbox.click();
        BrowserUtils.wait(5);
    }

    @Then("click on dropdown Action")
    public void click_on_dropdown_Action() {
        vendorCreditNotes.action.click();
        BrowserUtils.wait(5);
    }

    @Then("click on delete")
    public void click_on_delete() {
        vendorCreditNotes.delete.click();
        BrowserUtils.wait(5);
    }

    @Then("click on ok")
    public void click_on_ok() {
        vendorCreditNotes.ok.click();
        BrowserUtils.wait(5);
    }

    @Then("Verify that system displays {string}")
    public void verify_that_system_displays(String messageExp) {
        String messageAct = vendorCreditNotes.canNotDeleteMessage.getText();
        Assert.assertEquals(messageExp, messageAct);
    }

    @Then("verify that title is {string}")
    public void verify_that_title_is(String titleExp) {
       String titleAct = Driver.getDriver().getTitle();
    }





}
