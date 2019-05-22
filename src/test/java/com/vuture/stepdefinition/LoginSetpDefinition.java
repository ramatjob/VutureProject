package com.vuture.stepdefinition;


import com.vuture.pages.HomePage;
import com.vuture.pages.LoginPage;
import com.vuture.utility.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;


public class LoginSetpDefinition {
    WebDriver driver;
    private String url;

    private LoginPage loginPageObject;
    private HomePage homePageObject;
    private TestBase testBase;

    public LoginSetpDefinition(TestBase testBase){
        this.testBase = testBase;
        //driver = testBase.initializeDriver();
        //url = testBase.getUrl("VuturePortal");
    }

    @Given("^I launch the Vuture Portal login page$")
    public void luanchVuturePortalHomePage() {
        driver = testBase.initializeDriver();
        //driver.get(url);
        url = testBase.getUrl("VuturePortal");
        testBase.launchUrl(url);
        loginPageObject = new LoginPage(driver);
        loginPageObject.verifyTheTextinLoginPage();
    }

    @And("^I enter a valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterAValidUserNameAndPassword(String userName,String password) throws InterruptedException {
        loginPageObject.enterAValidUserName(userName);
        loginPageObject.enterAValidPassword(password);
    }

    @And("^I click on Signin button$")
    public void clickOnSigninButton() throws InterruptedException {
        loginPageObject.clickOnSigninButton();
    }

    @Then("^I can verify the Home Page URL \"([^\"]*)\"$")
    public void verifyHomePageURL(String homePageURL) throws InterruptedException {
        homePageObject = new HomePage(driver);
        homePageObject.verifyHomePageURL(homePageURL);
    }

}
