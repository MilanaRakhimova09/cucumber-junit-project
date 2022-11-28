package com.cydeo.pages;

import com.cydeo.pages.WebTableBasePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrderPage extends WebTableBasePage {
    public WebTableOrderPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userInputBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[normalize-space()='Order']")
    public WebElement orderBtn;


    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;


    @FindBy(name = "quantity")
    public WebElement enterQuanity;
    ;

    @FindBy(name = "name")
    public WebElement enterCustomerName;

    @FindBy(name = "street")
    public WebElement enterStreet;

    @FindBy(name = "city")
    public WebElement enterCity;

    @FindBy(name = "state")
    public WebElement enterState;

    @FindBy(name = "zip")
    public WebElement enterZip;

   // @FindAll(@FindBy(xpath = "//input[@type='radio']"))
   // public List<WebElement> selectCreditCard;
    @FindBy(xpath = "(//input[@name='card'])[3]")
    public WebElement selectCreditCard;


    @FindBy(name = "cardNo")
    public WebElement creditCardNumber;

    @FindBy(name = "cardExp")
    public WebElement enterExpDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    @FindBy (xpath = "(//table//tbody//td)[1]")
    public WebElement nameVerification;

    public void selectDropDown(String product) {

        Select select = new Select(productDropdown);
        switch (product) {
            case "MoneyCog":
                select.selectByVisibleText("MoneyCog");
                break;
            case "Familybea":
                select.selectByVisibleText("Familybea");
                break;
            case "Screenable":
                select.selectByVisibleText("Screenable");
                break;

        }
    }

  /*  public void selectCardType(String selectCard) {


        switch (selectCard){
            case "American Express":
                selectCreditCard.get(2).click();
                break;
            case "Master Card":
                selectCreditCard.get(1).click();
                break;
            case "Visa":
                selectCreditCard.get(0).click();
                break;
        }

//        for(WebElement eachCard: cardType){
//            if(eachCard.getText().equals(cardType1)){
//                eachCard.isEnabled();
//            }
//        }


    }
*/

public void setQuantity(int i){
    enterQuanity.sendKeys(Keys.BACK_SPACE);
    enterQuanity.sendKeys(String.valueOf(i));
}





}







