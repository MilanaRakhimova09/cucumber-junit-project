package com.cydeo.step_definitions;


import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;



/*
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.properties.getProperty("env"));
        loginPage.login("Test","Tester");
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        for(String eachOption: BrowserUtils.dropdownOptionsAsString(orderPage.productDropdown)){
            if(eachOption.equals(product)){
                orderPage.productDropdown.click();
            }
        }
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        orderPage.enterQuanity.sendKeys(String.valueOf(quantity));
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String fullName) {
        orderPage.enterName.sendKeys(fullName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        orderPage.enterStreet.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.enterCity.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        orderPage.enterState.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        orderPage.enterZip.sendKeys(zip);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        for(WebElement eachType : orderPage.creditCard){
            if(eachType.getAttribute("value").equalsIgnoreCase(cardType)){
                eachType.click();
            }
        }
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {

        orderPage.creditCardNumber.sendKeys(cardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {

        orderPage.enterExpDate.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

        orderPage.enterPrBtn.click();
    }


    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {
    orderPage.enterPrBtn.click();

    }
*/

    public class WebTableOrder_StepDefs {
    WebTableLoginPage loginPage = new WebTableLoginPage();
    WebTableOrderPage orderPage = new WebTableOrderPage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableOrderPage.userInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        webTableOrderPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        webTableOrderPage.loginBtn.click();
        webTableOrderPage.orderBtn.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        webTableOrderPage.selectDropDown(productType);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        webTableOrderPage.setQuantity(int1);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
    webTableOrderPage.enterCustomerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
   webTableOrderPage.enterStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
   webTableOrderPage.enterCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
   webTableOrderPage.enterState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
    webTableOrderPage.enterZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string1) {
       // webTableOrderPage.selectCardType(string1);
        webTableOrderPage.selectCreditCard.click();
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
    webTableOrderPage.creditCardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
   webTableOrderPage.enterExpDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
    webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String nameVerification) {

       Assert.assertEquals(webTableOrderPage.nameVerification.getText(),nameVerification);
    }

}
