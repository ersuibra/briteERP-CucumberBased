package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.Journals;
import pages.configuration_accounting.TaxesPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class TaxConfStepDef {
    TaxesPage taxesPage = new TaxesPage();
    Journals journals=new Journals();
    BankAccounts bankAccounts=new BankAccounts();

    @Then("user clicks on Taxes Link grom left menu")
    public void user_clicks_on_Taxes_Link_grom_left_menu() {
        taxesPage.taxConfPage.click();
    }

    @Then("user fills out required information {string}, {string}")
    public void user_fills_out_required_information(String string, String string2) {
        taxesPage.newTaxName.sendKeys(string);
        taxesPage.newPercentageAmount.clear();
        taxesPage.newPercentageAmount.sendKeys(string2);
    }

    @Then("user see Taxes -{string} creation page")
    public void user_see_Taxes_creation_page(String string) {
        Assert.assertEquals(journals.creationNewPageText.getText(),"New");
    }

    @Then("user doesn't see deleted tax on main page {string}")
    public void user_doesn_t_see_deleted_tax_on_main_page(String string) {
        taxesPage.taxConfPage.click();
        BrowserUtils.wait(3);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.wait(3);
        Assert.assertFalse(bankAccounts.isDisplayed(string));
    }

}
