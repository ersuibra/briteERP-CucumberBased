package step_definitions;

import cucumber.api.java.en.*;
import pages.configuration_accounting.LoginPage;


public class LoginStepDefinations {


    LoginPage loginPage = new LoginPage();

    @Given("Manager on Invoicing Page")
    public void manager_on_Invoicing_Page() {
        loginPage.open();
        loginPage.loginAsManager();
    }

    @Given("User on Invoicing Page")
    public void user_on_Invoicing_Page() {
        loginPage.open();
        loginPage.loginAsUser();
    }

}


