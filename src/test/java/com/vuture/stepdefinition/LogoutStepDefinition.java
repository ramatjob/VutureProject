package com.vuture.stepdefinition;

import com.vuture.pages.LogoutPage;
import com.vuture.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LogoutStepDefinition {
    WebDriver driver;
    private LogoutPage logoutPageObject;

    public LogoutStepDefinition(TestBase testBase){
        driver = testBase.initializeDriver();
        logoutPageObject = new LogoutPage(driver);
    }

    @Given("^I click on logout button$")
    public void clickOnLogoutButton() throws InterruptedException {
        Thread.sleep(3000);
        logoutPageObject.clickOnLogoutButton();
        Thread.sleep(3000);
    }

    @Then("^I can verify the Login page URL \"([^\"]*)\"$")
    public void verifyLoginPageUrl(String expectedLogoutPageUrl){
        logoutPageObject.verifyLoginPageURL(expectedLogoutPageUrl);
    }

    @Then("^I verify that the Username,Password and Signin elements are visible$")
    public void verifyUsernamePasswordAndSigninElemnts(){
        logoutPageObject.verifyUsernamePasswordAndSigninElements();
    }

    @And("^I close the browser$")
    public void closeBrowser(){
        logoutPageObject.closeBrowser();
    }


}
