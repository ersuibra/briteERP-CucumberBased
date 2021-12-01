package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.Journals;
import utilities.BrowserUtils;
import utilities.Driver;

public class BankAccountConfStepDef {
    BankAccounts bankAccounts=new BankAccounts();
    Journals journals=new Journals();

    @Then("user clicks on Bank Account Link from left menu")
    public void user_clicks_on_Bank_Account_Link_from_left_menu() {
    bankAccounts.bankAccountLink.click();
        BrowserUtils.wait(5);
    }

    @Then("user see Bank Account -{string} creation page")
    public void user_see_creation_page(String string) {
    Assert.assertEquals(journals.creationNewPageText.getText(),"New");
    }

    @Then("user fills out required Bank Account information {string}, {string}")
    public void user_fills_out_required_Bank_Account_information(String string, String string2) {
        bankAccounts.bankNameField.sendKeys(string);
//        bankAccounts.bankAccount.sendKeys(string2);
//        bankAccounts.bankAccount.sendKeys(Keys.TAB);
//        bankAccounts.bankAccount.sendKeys(string2);
        bankAccounts.bankAccount.sendKeys(Keys.TAB);
        bankAccounts.bankName.sendKeys(string);
        bankAccounts.bankAccount.sendKeys(Keys.TAB);
        bankAccounts.createABankAccntBtn.click();
    }

    @Then("user should see and verifies details that entered {string}, {string}")
    public void user_should_see_and_verifies_details_that_entered(String string) {
        Assert.assertEquals(journals.createdVariableName.getText(),string);
    }

    @Then("user open a Bank Account that has {string}")
    public void user_open_a_Bank_Account_that_has(String string) {
        Driver.getDriver().findElement(By.xpath("//td[@class='o_data_cell o_required_modifier'][.='"+string +"']")).click();
    }

    @Then("user doesn't see deleted Bank Account on main page {string}")
    public void user_doesn_t_see_deleted_Bank_Account_on_main_page(String string) {
        bankAccounts.bankAccountLink.click();
        BrowserUtils.wait(2);
        Driver.getDriver().navigate().refresh();
        BrowserUtils.wait(2);
        Assert.assertFalse(bankAccounts.isDisplayed(string));
    }

}
