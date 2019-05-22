package com.vuture.stepdefinition;

import com.vuture.pages.HomePage;
import com.vuture.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefinition {
    private WebDriver driver;
    private HomePage homePageObject;
    private TestBase testBase;

    public HomePageStepDefinition(TestBase testBase){
        this.testBase = testBase;
    }

    @Given("^I click on create email campaign link$")
    public void clickOnCreateEmailCampaignLink() throws InterruptedException {
        driver = testBase.getDriver();
        homePageObject = new HomePage(driver);
        homePageObject.clickOnCreateEmailCampaignLink();
    }

    @And("^I entered a \"([^\"]*)\"$")
    public void nameTheCampaign(String campaignName) throws InterruptedException {
        homePageObject.enterCampaignNameintoTextBox(campaignName);
    }

    @And("^I select the first email template from \"([^\"]*)\"$")
    public void selectEmailTemplate(String emailLayout) {
        homePageObject.selectEmailTemplate(emailLayout);
    }

    @And("^I click on the create button$")
    public void clickOnCreateButton() {
        homePageObject.clickOnCreateButton();
    }


    @And("^I verify that the \"([^\"]*)\" are displayed at the top of the window$")
    public void verifyTheContainerAndCampiagnNames(String expectedContainerAndCampaignName) throws InterruptedException {
        homePageObject.verifyContainerAndCapaignName(expectedContainerAndCampaignName);
    }

    @And("^On the right hand frame, i enter an \"([^\"]*)\"$")
    public void enterEmailName(String emailName) throws InterruptedException {
        homePageObject.enterMailName(emailName);
    }

    @And("^I click on the invitation icon$")
    public void clickOnInvitationIcon() {
        homePageObject.clickOnInvitationIcon();
    }

    @And("^I click on publish email$")
    public void clickOnPublishEmail() throws InterruptedException {
        homePageObject.clickOnPublishEmail();
    }

    @And("^I click on publish now$")
    public void clickOnPublishNow() throws InterruptedException {
        homePageObject.clickOnPublishNow();
    }

    @And("^I verify that the \"([^\"]*)\" is coming as Live in the published page$")
    public void verifyTheStatusOfEmail(String expectedEmailStatus) throws InterruptedException {
        homePageObject.getEmailStatus(expectedEmailStatus);
    }



}
