package com.vuture.pages;


import com.vuture.pageproperties.LogoutPageProperty;
import com.vuture.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutPage extends CommonFunctions {

    By MyAccountDropDownLocator = By.xpath(LogoutPageProperty.MyAccountDropDown);
    By LogoutButtonLocator = By.xpath(LogoutPageProperty.LogoutButton);
    By LoginPageRequestTextLocator = By.xpath(LogoutPageProperty.LoginPageRequestText);
    By UserNameBoxLocator = By.xpath(LogoutPageProperty.UserNameBox);
    By PasswordBoxLocator = By.xpath(LogoutPageProperty.PasswordBox);
    By SignButtonLocator = By.xpath(LogoutPageProperty.SignInButton);

    private WebDriver driver;

    public LogoutPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void clickOnLogoutButton() throws InterruptedException {
        wait_implicit_till_window_load();
        Thread.sleep(5000);
        click(MyAccountDropDownLocator);
        click(LogoutButtonLocator);
    }

    public void verifyLoginPageURL(String expectedLogoutPageURL){
        String actualLogoutPageURL = driver.getCurrentUrl();
        Assert.assertTrue(compareAnyText(actualLogoutPageURL,expectedLogoutPageURL));
    }

    public void verifyUsernamePasswordAndSigninElements(){
        isElementPresentOnWebPage(UserNameBoxLocator,"Username box", "Vuture portal login Page");
        isElementPresentOnWebPage(PasswordBoxLocator,"Password box", "Vuture portal login Page");
        isElementPresentOnWebPage(SignButtonLocator,"Signin button", "Vuture portal login Page");
        isElementPresentOnWebPage(LoginPageRequestTextLocator,"Required text", "Vuture portal login Page");
    }

}
