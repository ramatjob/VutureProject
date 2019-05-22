package com.vuture.pages;


import com.vuture.pageproperties.HomePageProperty;
import com.vuture.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage extends CommonFunctions {
    By CreateEmailCampaignLinkLocator = By.xpath(HomePageProperty.CreateEmailCampaignLink);
    By CampaignNameBoxLocator = By.xpath(HomePageProperty.CampaignNameBox);
    By EmailLayoutDropdownLocator = By.xpath(HomePageProperty.EmailLayoutDropdown);
    By CreateButtonLocator = By.xpath(HomePageProperty.CreateButton);
    By ContainerAndCampaignNameLocator = By.xpath(HomePageProperty.ContainerAndCampaignName);
    By EmailNameBoxLocator = By.xpath(HomePageProperty.EmailNameBox);
    By InvitationIconLocator = By.xpath(HomePageProperty.InvitationIcon);
    By PublishEmailLocator = By.xpath(HomePageProperty.PublishEmail);
    By PublishNowLocator = By.xpath(HomePageProperty.PublishNow);
    By EmailStatusLocator = By.xpath(HomePageProperty.EmailStatus);


    private WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyHomePageURL(String expectedHomePageURL){
        String actualHomePageURL = driver.getCurrentUrl();
        Assert.assertTrue(compareAnyText(actualHomePageURL,expectedHomePageURL));
    }

    public void clickOnCreateEmailCampaignLink() throws InterruptedException {
        wait_implicit_till_window_load();
        isElementClickableOnWebPage(CreateEmailCampaignLinkLocator);
        click(CreateEmailCampaignLinkLocator);

    }

    public void enterCampaignNameintoTextBox(String campaignName) throws InterruptedException {
        switchToFrame("left");
        enterText(CampaignNameBoxLocator,campaignName);
    }

    public void selectEmailTemplate(String emailLayout){
        selectAnyValuFromDropdown(EmailLayoutDropdownLocator,emailLayout);
    }

    public void clickOnCreateButton(){
        click(CreateButtonLocator);
    }

    public void verifyContainerAndCapaignName(String expectedContainerAndCampaignName) throws InterruptedException {
        switchToFrame("topframe");
        String actualContainerAndCampaignName = getAnyTextFromWebPage(ContainerAndCampaignNameLocator);
        Assert.assertTrue(compareAnyText(actualContainerAndCampaignName,expectedContainerAndCampaignName));
    }

    public void enterMailName(String emailName) throws InterruptedException {
        switchToFrame("right");
        enterText(EmailNameBoxLocator,emailName);
    }

    public void clickOnInvitationIcon(){
        click(InvitationIconLocator);
    }

    public void clickOnPublishEmail() throws InterruptedException {
        wait_implicit_till_window_load();
        switchToFrame("left");
        click(PublishEmailLocator);
    }

    public void clickOnPublishNow() throws InterruptedException {
        switchToFrame("left");
        click(PublishNowLocator);
    }

    public void getEmailStatus(String expectedEmailStatus) throws InterruptedException {
        switchToFrame("left");
        String actualEmailStatus = getEmailStatus(EmailStatusLocator);
        Assert.assertTrue(compareAnyText(actualEmailStatus,expectedEmailStatus));
    }



}
