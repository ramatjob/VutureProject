package com.vuture.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver){
        this.driver = driver;
    }

    public void wait_explicit_till_element_loaded(By by){
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        waitnew.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void isElementClickableOnWebPage(By by){
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        waitnew.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void switchToFrame(String frameName) throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        WebDriverWait waitnew=new WebDriverWait(driver,20);
        waitnew.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
    }

    public void enterText(By byProp, String searchText) {
        wait_explicit_till_element_loaded(byProp);
        driver.findElement(byProp).sendKeys(searchText);
    }

    public void click(By byProp) {
        wait_explicit_till_element_loaded(byProp);
        driver.findElement(byProp).click();
    }

    public String getAnyTextFromWebPage(By prop){
        wait_explicit_till_element_loaded(prop);
        return driver.findElement(prop).getText();
    }

    public void selectAnyValuFromDropdown(By byProp, String visibleText){
        wait_explicit_till_element_loaded(byProp);
        Select select = new Select(driver.findElement(byProp));
        select.selectByVisibleText(visibleText);
    }

    public void isElementPresentOnWebPage(By byProp,String str1,String str2){
        boolean isElementPresent = false;
        wait_explicit_till_element_loaded(byProp);
        if(driver.findElement(byProp).isDisplayed()){
            isElementPresent = true;
        }

        if(isElementPresent){
            System.out.println(str1+" is present on the "+str2);
        }else{
            System.out.println(str1+" is not present on the "+str2);
            Assert.fail(str1+" is not present on the "+str2+" screen");
        }
    }

    public boolean compareAnyText(String actualString,String expectedString){
        boolean finalResult;
        if(expectedString.equalsIgnoreCase(actualString)){
            System.out.println("Actual string ("+actualString+")  is matched with the Expected string ("+expectedString+")");
            finalResult = true;
        }else{
            System.out.println("Actual string ("+actualString+")  is not matched with the Expected string ("+expectedString+")");
            finalResult = false;
        }
        return finalResult;
    }

    public String getEmailStatus(By byProp){
        List<WebElement> list = driver.findElements(byProp);
        String str = list.get(1).getText();
        String[] strArray = str.split(" ");
        return strArray[2];
    }

    public void wait_implicit_till_window_load(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
