package com.vuture.pages;


import com.vuture.pageproperties.LoginPageProperty;
import com.vuture.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.text.ParseException;

public class LoginPage extends CommonFunctions {

    By UserNameBoxLocator = By.xpath(LoginPageProperty.UserNameBox);
    By PasswordBoxLocator = By.xpath(LoginPageProperty.PasswordBox);
    By SignInButtonLocator = By.xpath(LoginPageProperty.SignInButton);
    By WelcomeTextLocator = By.xpath(LoginPageProperty.WelcomeText);

    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterAValidUserName(String userName) throws InterruptedException {
        isElementPresentOnWebPage(UserNameBoxLocator,"User name Box", "Vuture portal login Page");
        enterText(UserNameBoxLocator,userName);
    }

    public void enterAValidPassword(String password) throws InterruptedException {
        isElementPresentOnWebPage(PasswordBoxLocator,"Password Box", "Vuture portal login Page");
        enterText(PasswordBoxLocator,password);
    }

    public void clickOnSigninButton() throws InterruptedException {
        isElementPresentOnWebPage(SignInButtonLocator,"Login Button", "Vuture portal login Page");
        click(SignInButtonLocator);
    }

    public void verifyTheTextinLoginPage(){
        String actualText = getAnyTextFromWebPage(WelcomeTextLocator);
        String expectedText = "Welcome to Vuture";
        Assert.assertTrue(compareAnyText(actualText,expectedText));
    }

}
