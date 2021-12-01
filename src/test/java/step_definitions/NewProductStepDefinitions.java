package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.puchasesMasterData.NewProductPage;
import pages.puchasesMasterData.PurchasableProductsPage;
import utilities.BrowserUtils;

public class NewProductStepDefinitions {

    PurchasableProductsPage purchasableProducts = new PurchasableProductsPage();
    NewProductPage newProductPage=new NewProductPage();

    @Then("User clicks on create new product button")
    public void user_clicks_on_create_new_product_button() {

        BrowserUtils.waitForVisibility( purchasableProducts.createButton,6);
        purchasableProducts.createButton.click();

    }

    @Then("User enters the product name {string}")
    public void user_enters_the_product_name(String productName) {

        newProductPage.productNameInput.sendKeys(productName);

    }

    @Then("User enters the product price {string}")
    public void user_enters_the_product_price(String productPrice) {
        newProductPage.productPriceInput.click();
        newProductPage.productPriceInput.sendKeys(productPrice);

    }

    @Then("User enters the cost {string}")
    public void user_enters_the_cost(String cost) {
        newProductPage.costInput.click();
        newProductPage.costInput.sendKeys(cost);
    }

    @When("User clicks on save")
    public void user_clicks_on_save() {
       newProductPage.saveButton.click();

    }

    @Then("User should see the saved product {string}")
    public void user_should_see_the_saved_product(String productName) {
        BrowserUtils.wait(5);
        Assert.assertTrue(newProductPage.savedProduct.getText().equals(productName));
    }
}
