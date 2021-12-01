package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.puchasesMasterData.PurchasableProductsPage;
import utilities.BrowserUtils;

public class PurchasableProductsStepDefinitions {

    PurchasableProductsPage purchasableProducts=new PurchasableProductsPage();

    @Then("User clicks on Purchasable Products button")
    public void user_clicks_on_Purchasable_Products_button() {
        BrowserUtils.wait(3);
        purchasableProducts.purchasableProductsButton.click();
        BrowserUtils.wait(5);

    }

    @Then("User should see the all products")
    public void user_should_see_the_all_products() {
        for(int i=0;i<purchasableProducts.allProducts.size()/2;i++){
            Assert.assertTrue(purchasableProducts.allProducts.get(i).isDisplayed());
        }
    }


}
