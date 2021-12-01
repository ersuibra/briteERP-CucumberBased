package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.configuration_accounting.LoginPage;
import pages.puchasesMasterData.CamptocampPage;
import pages.puchasesMasterData.CreateMeetingPage;
import pages.puchasesMasterData.NewVendorPage;
import pages.puchasesMasterData.VendorsPage;
import utilities.BrowserUtils;
import utilities.Driver;


public class VendorsStepDefinitions {
    LoginPage loginPage=new LoginPage();
    VendorsPage vendorsPage=new VendorsPage();
    NewVendorPage newVendorPage = new NewVendorPage();
    CamptocampPage camptocampPage=new CamptocampPage();
    CreateMeetingPage createMeetingPage=new CreateMeetingPage();



    @Given("User on login page")
    public void user_on_login_page() {
        loginPage.open();
        loginPage.loginAsUser();
    }

    @Then("User clicks on Master Data button")
    public void user_clicks_on_Master_Data_button() {
        vendorsPage.masterDataButton.click();
        BrowserUtils.wait(2);
    }

    @Then("User clicks on Vendors button")
    public void user_clicks_on_Vendors_button() {
        vendorsPage.vendorsButton.click();
        BrowserUtils.wait(3);

    }

    @Then("User should see the Vendors")
    public void user_should_see_the_Vendors() {
        for (int i = 0; i < vendorsPage.allVendors.size()/2 ; i++) {
            Assert.assertTrue(vendorsPage.allVendors.get(i).isDisplayed());
        }
    }

    @Then("User clicks on the Create button")
    public void user_clicks_on_the_Create_button() {
        vendorsPage.createVendorButton.click();
        BrowserUtils.wait(2);
    }

    @Then("User selects Company radio button")
    public void user_selects_Company_radio_button() {
        newVendorPage.companyRadioButton.click();
    }

    @Then("User enters the company name {string}")
    public void user_enters_the_company_name(String companyName) {
        newVendorPage.companyNameInput.sendKeys(companyName);
        BrowserUtils.wait(3);


    }

    @Then("User enters the city {string}")
    public void user_enters_the_city(String city) {
        newVendorPage.cityInput.click();
        newVendorPage.cityInput.sendKeys(city);

    }



    @When("User clicks on the Save button")
    public void user_clicks_on_the_Save_button() {
        newVendorPage.saveButton.click();
        BrowserUtils.wait(5);

    }


    @Then("user should see the company name {string}")
    public void user_should_see_the_company_name(String companyName) {
        String expectedResult=companyName;
        String actualResult=newVendorPage.companyName.getText();
        Assert.assertTrue(companyName.equals(actualResult));

    }


    @Then("User should see the all vendors")
    public void user_should_see_the_all_vendors() {
        for (int i = 0; i < vendorsPage.allVendors.size()-1 ; i++) {

            Assert.assertTrue(vendorsPage.allVendors.size()>80);

        }

    }


    @When("User clicks on Camptocamp")
    public void user_clicks_on_Camptocamp() {
       vendorsPage.camptocamp.click();
    }

    @Then("User should see tables")
    public void user_should_see_tables() {
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Opportunities"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Meetings"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("On Website"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Sales"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Vendor Bills"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Active"));
        Assert.assertTrue(camptocampPage.camptocampTable.getText().contains("Invoiced"));


    }

    @Then("User should see tabs")
    public void user_should_see_tabs() {
        Assert.assertTrue(camptocampPage.camptocampTab.getText().contains("Contacts & Addresses"));
        Assert.assertTrue(camptocampPage.camptocampTab.getText().contains("Internal Notes"));
        Assert.assertTrue(camptocampPage.camptocampTab.getText().contains("Sales & Purchases"));
        Assert.assertTrue(camptocampPage.camptocampTab.getText().contains("Invoicing"));
    }

    @Then("User should see tags")
    public void user_should_see_tags() {
        Assert.assertTrue(camptocampPage.camptocampTag.getText().contains("Partner / Gold"));
        Assert.assertTrue(camptocampPage.camptocampTag.getText().contains("Services"));
    }

    @Then("User clicks on Erkins button")
    public void user_clicks_on_Erkins_button() {
        vendorsPage.erkins.click();
        BrowserUtils.wait(2);
    }

    @Then("User clicks on Meeting button")
    public void user_clicks_on_Meeting_button() {
        createMeetingPage.meetingButton.click();
    }

    @Then("User clicks on List button")
    public void user_clicks_on_List_button() {
        createMeetingPage.listButton.click();
    }

    @Then("User clicks on Meeting create button")
    public void user_clicks_on_Meeting_create_button() {
        createMeetingPage.meetingCreateButton.click();
    }

    @Then("User enters Meeting Subject, Start Date")
    public void user_enters_Meeting_Subject_Start_Date() {
        createMeetingPage.subjectInput.sendKeys("sprint planning ");
        createMeetingPage.startDate.click();
    }



    @Then("User selects a day")
    public void user_selects_a_day() {
        createMeetingPage.feb17.click();

    }

    @When("User clicks on the savebutton")
    public void user_clicks_on_the_savebutton() {
        createMeetingPage.saveButton.click();
        BrowserUtils.wait(7);
    }

    @Then("User should see the Meeting Subject")
    public void user_should_see_the_Meeting_Subject() {

        Assert.assertTrue(createMeetingPage.subject.getText().equals("sprint planning"));



    }
}
