package com.vuture.stepdefinition;

import com.vuture.pages.HomePage;
import com.vuture.pages.LoginPage;
import com.vuture.pages.LogoutPage;
import com.vuture.utility.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefinition {
    WebDriver driver;
    private HomePage homePageObject;

    public HomePageStepDefinition(TestBase testBase){
        driver = testBase.initializeDriver();
        homePageObject = new HomePage(driver);
    }

    @Given("^I click on icon to create a new email campaign$")
    public void clickOnTheCreateEmailCampaign() {
        // implementation is pending
    }

    @And("^I name the campaign on the left frame or i can pick a name of my choice$")
    public void nameTheCampaign() {
        // implementation is pending
    }

    @And("^I click on the create button for the first email template in the list$")
    public void clickOnCreateButton() {
        // implementation is pending
    }

    @And("^I verify that the container and campaign names are displayed at the top of the window$")
    public void verifyTheContainerAndCampiagnNames() {
        // implementation is pending
    }

    @And("^I click on the right-hand frame of the window, name the email, again pick a name of your choice$")
    public void nameTheEmail() {
        // implementation is pending
    }

    @And("^I click on invitation template to create a new email on the left-hand frame$")
    public void clickOnInvitationTemplate() {
        // implementation is pending
    }

    @And("^I click on publish email and the publish now$")
    public void clickOnPublishEmailAndPublishNow() {
        // implementation is pending
    }

    @And("^I verify that the status of the email is coming as ‘Live’ in the published page$")
    public void verifyTheStatusOfEmail() {
        // implementation is pending
    }



}
