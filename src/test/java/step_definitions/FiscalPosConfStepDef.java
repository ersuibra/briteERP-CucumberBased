package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.FiscalPositions;
import pages.configuration_accounting.Journals;
import utilities.BrowserUtils;
import utilities.Driver;

public class FiscalPosConfStepDef {
    FiscalPositions fiscalPositions = new FiscalPositions();
    BankAccounts bankAccounts = new BankAccounts();
    Journals journals=new Journals();

    @Then("user clicks on Fiscal Position Link grom left menu")
    public void user_clicks_on_Fiscal_Position_Link_grom_left_menu() {
        fiscalPositions.fiscalPosLink.click();
        BrowserUtils.wait(5);
    }

    @Then("user see Fiscal Position -{string} creation page")
    public void user_see_Fiscal_Position_creation_page(String string) {
        Assert.assertEquals(journals.creationNewPageText.getText(),"New");
    }

    @Then("user fills out required information {string}")
    public void user_fills_out_required_information(String string) {
        journals.newNameTag.sendKeys(string);
    }

//    @Then("user should see and verifies details that entered {string}")
//    public void user_should_see_and_verifies_details_that_entered(String string) {
//        Assert.assertEquals(journals.createdVariableName.getText(),string);
//    }

    @Then("user open a tax that has {string}")
    public void user_open_a_tax_that_has(String string) {
        Driver.getDriver().findElement(By.xpath("//td[@class='o_data_cell o_required_modifier'][.='"+string +"']")).click();

    }
    @Then("user doesn't see deleted Fiscal Position on main page {string}")
    public void user_doesn_t_see_deleted_Fiscal_Position_on_main_page(String string) {
        fiscalPositions.fiscalPosLink.click();
        BrowserUtils.wait(3);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.wait(3);
        Assert.assertFalse(bankAccounts.isDisplayed(string));
    }
}
