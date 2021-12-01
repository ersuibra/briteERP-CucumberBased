package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.puchasesMasterData.NewProductPage;
import pages.puchasesMasterData.VintageShirtPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class VintageShirtStepDefinitions {

    NewProductPage newProductPage=new NewProductPage();
    VintageShirtPage vintageShirt=new VintageShirtPage();

    @Then("User clicks on  the Vintage Shirt product")
    public void user_clicks_on_the_Vintage_Shirt_product() {
        BrowserUtils.wait(3);
        newProductPage.vintageShirtButton.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),6);
        wait.until(ExpectedConditions.elementToBeClickable(vintageShirt.editButton));
    }

    @Then("User clicks on edit button")
    public void user_clicks_on_edit_button() {
        vintageShirt.editButton.click();
        BrowserUtils.wait(3);

    }

    @Then("User enters the sale price {double}")
    public void user_enters_the_sale_price(Double salePrice) {
        salePrice=Math.random()*(25+10);
        vintageShirt.salePriceInput.clear();
        vintageShirt.salePriceInput.sendKeys(String.valueOf(salePrice));

    }



    @When("User clicks on savebutton product")
    public void user_clicks_on_savebutton_product() {
        vintageShirt.saveButton.click();
    }

    @Then("User should see the new sale price and cost")
    public void user_should_see_the_new_sale_price_and_cost() {

        Assert.assertTrue(vintageShirt.salePriceAfterSave.isDisplayed());


    }
}
