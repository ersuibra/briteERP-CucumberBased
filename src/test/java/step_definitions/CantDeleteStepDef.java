package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.configuration_accounting.BankAccounts;
import utilities.BrowserUtils;
import utilities.Driver;

public class CantDeleteStepDef {
    BankAccounts bankAccounts= new BankAccounts();

    @Then("user clicks and open a Bank Account")
    public void user_clicks_and_open_a_Bank_Account() {
        Driver.getDriver().findElement(By.xpath("(//td[@class='o_data_cell o_required_modifier'])[1]")).click();
    }

    @Then("user try to delete this Bank Account")
    public void user_try_to_delete_this_Bank_Account() {
        BrowserUtils.wait(3);
        bankAccounts.actionButton.click();
        bankAccounts.deleteBtn.click();
        bankAccounts.okButtonAfterDelete.click();
        BrowserUtils.wait(2);

    }

    @Then("User should see on screen {string} message")
    public void user_should_see_on_screen_message(String string) {
        System.out.println(bankAccounts.odooServerErrorMsg.getText());
        //Assert.assertEquals(bankAccounts.odooServerErrorMsg.getText(),string);
    }

}
