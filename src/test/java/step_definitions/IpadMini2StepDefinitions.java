package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.puchasesMasterData.IpadMini2Page;
import pages.puchasesMasterData.NewProductPage;
import pages.puchasesMasterData.NewVendorPage;
import utilities.BrowserUtils;

public class IpadMini2StepDefinitions {

    IpadMini2Page ipadMini2Page = new IpadMini2Page();
    NewProductPage newProductPage = new NewProductPage();


    @When("User clicks on {string} product")
    public void user_clicks_on_product(String string) {
        newProductPage.ipadMini2Button.click();
    }

    @Then("User should see the {string}")
    public void user_should_see_the(String string) {
        String expectedResult = string;
        String actualResult = ipadMini2Page.selectedProduct.getText();
        Assert.assertTrue(expectedResult.equals(actualResult));
    }


}
