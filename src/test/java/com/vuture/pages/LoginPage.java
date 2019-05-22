package com.vuture.pages;


import com.vuture.pageproperties.LoginPageProperty;
import com.vuture.utility.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends CommonFunctions {

    By UserNameBoxLocator = By.xpath(LoginPageProperty.UserNameBox);
    By PasswordBoxLocator = By.xpath(LoginPageProperty.PasswordBox);
    By SignInButtonLocator = By.xpath(LoginPageProperty.SignInButton);
    By WelcomeTextLocator = By.xpath(LoginPageProperty.WelcomeText);

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterAValidUserName(String userName) throws InterruptedException {
        enterText(UserNameBoxLocator,userName);
    }

    public void enterAValidPassword(String password) throws InterruptedException {
        enterText(PasswordBoxLocator,password);
    }

    public void clickOnSigninButton() throws InterruptedException {
        click(SignInButtonLocator);
    }

    public void verifyTheTextinLoginPage(){
        String actualText = getAnyTextFromWebPage(WelcomeTextLocator);
        String expectedText = "Welcome to Vuture";
        Assert.assertTrue(compareAnyText(actualText,expectedText));
    }

}
