package com.vuture.pages;


import com.vuture.utility.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends CommonFunctions {

    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void verifyHomePageURL(String expectedHomePageURL){
        String actualHomePageURL = driver.getCurrentUrl();
        Assert.assertTrue(compareAnyText(actualHomePageURL,expectedHomePageURL));
    }


}
