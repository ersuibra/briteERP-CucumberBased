package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.puchasesMasterData.IpadMini2Page;
import utilities.BrowserUtils;
import utilities.Driver;

public class IpadMini2PrintingLabelStepDefinitions {
    IpadMini2Page ipadMini2Page= new IpadMini2Page();

    @Then("User clicks on print dropdown button")
    public void user_clicks_on_print_dropdown_button() {
        BrowserUtils.waitForClickablility(ipadMini2Page.printDropdownButton,5);
        ipadMini2Page.printDropdownButton.click();
    }

    @Then("User clicks on Product Labels button")
    public void user_clicks_on_Product_Labels_button() {

        ipadMini2Page.productLabelsButton.click();

    }

    @When("User clicks on print button")
    public void user_clicks_on_print_button() {

        ipadMini2Page.printButton.click();
    }

    @Then("User should see the printing label")
    public void user_should_see_the_printing_label() {
        Driver.getDriver().switchTo().frame(ipadMini2Page.iframe);
        Assert.assertTrue(ipadMini2Page.label.isDisplayed());
    }
}
