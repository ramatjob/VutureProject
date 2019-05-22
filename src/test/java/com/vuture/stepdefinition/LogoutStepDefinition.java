package com.vuture.stepdefinition;

import com.vuture.pages.LogoutPage;
import com.vuture.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LogoutStepDefinition {
    private WebDriver driver;
    private LogoutPage logoutPageObject;
    private TestBase testBase;

    public LogoutStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Given("^I click on logout button$")
    public void clickOnLogoutButton() throws InterruptedException {
        driver = testBase.getDriver();
        logoutPageObject = new LogoutPage(driver);
        logoutPageObject.clickOnLogoutButton();
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
        testBase.tearDown();
    }


}
