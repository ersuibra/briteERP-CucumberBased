package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VintageShirtPage {

    public VintageShirtPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='o_form_buttons_view']/button[1]")
    public WebElement editButton;

    @FindBy(css = "[name='lst_price'] [type]")
    public WebElement salePriceInput;

    @FindBy(css = "[name='standard_price'] [type]")
    public WebElement costInput;

    @FindBy(css = ".o_form_buttons_edit [type='button']:nth-of-type(1)")
    public WebElement saveButton;

    @FindBy(css = "[name='lst_price']")
    public WebElement salePriceAfterSave;

    @FindBy(css = "[name='standard_price']")
    public WebElement costAfterSave;

    @FindBy(xpath = "//*[@id=\"notebook_page_1509\"]/div/table[2]/tbody/tr[1]/td[2]/span")
    public WebElement currentSalePrice;

    @FindBy(css = "[name='standard_price']")
    public WebElement currentCost;






}
