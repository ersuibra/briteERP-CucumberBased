package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.Journals;
import utilities.BrowserUtils;
import utilities.Driver;

public class JournalsConfStepDef {
    Journals journals = new Journals();
    BankAccounts bankAccounts = new BankAccounts();

    @Given("user clicks on Configuration=>Accounting Link from left menu")
    public void user_clicks_on_Configuration_Accounting_Link_from_left_menu() {
    journals.accountingLink.click();
    }

    @Then("user clicks on Journals Link from left menu")
    public void user_clicks_on_Journals_Link_from_left_menu() {

        journals.journalsLink.click();
        BrowserUtils.wait(5);
    }

    @Then("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        BrowserUtils.wait(3);
        bankAccounts.createBtn.click();
        BrowserUtils.wait(3);
    }

    @Then("user see Journals -{string} creation page")
    public void user_see_Journals_creation_page(String string) {
    Assert.assertEquals(journals.creationNewPageText.getText(),"New");
    }


    @Then("user fills out required Journal information {string}, Sale, {string}")
    public void user_fills_out_required_Journal_information_Sale(String string, String string2) {
        journals.newNameTag.sendKeys(string);
        journals.journalSaleType.click();
        journals.journalShortCode.sendKeys(string2);
        BrowserUtils.wait(3);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        bankAccounts.newSaveButton.click();
        BrowserUtils.wait(3);
    }

    @Then("user should see and verifies details that entered {string}")
    public void user_should_see_and_verifies_details_that_entered(String string) {

         Assert.assertEquals(journals.createdVariableName.getText(),string);
    }

    @Then("user open a Journal that has {string}")
    public void user_open_a_Journal_that_has(String string) {
        Driver.getDriver().findElement(By.xpath("//td[@class='o_data_cell o_required_modifier'][.='"+string +"']")).click();
    }

    @Then("user clicks on Action button")
    public void user_clicks_on_Action_button() {
        BrowserUtils.wait(3);
        bankAccounts.actionButton.click();

    }

    @Then("user clicks Delete option")
    public void user_clicks_Delete_option() {
        bankAccounts.deleteBtn.click();
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
       Assert.assertEquals(journals.confirmationMessage.getText(),string);
    }

    @Then("user clicks to Ok button")
    public void user_clicks_to_Ok_button() {
        bankAccounts.okButtonAfterDelete.click();
        BrowserUtils.wait(3);
    }

    @Then("user doesn't see deleted Journal on main page {string}")
    public void user_doesn_t_see_deleted_Journal_on_main_page(String string) {
        journals.journalsLink.click();
        BrowserUtils.wait(3);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.wait(3);
        Assert.assertFalse(bankAccounts.isDisplayed(string));

    }
}
