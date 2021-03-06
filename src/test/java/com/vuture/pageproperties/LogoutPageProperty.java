package com.vuture.pageproperties;



public interface LogoutPageProperty {
    public String MyAccountDropDown = "//span[contains(text(),'My Account')]";
    public String LogoutButton = "//a[contains(text(),'Logout')]"; ////ul[@class='dropdown-menu']//li[1]
    public String LoginPageRequestText = "//div[@class='account-wall']//h4";
    public String UserNameBox = "//*[@id=\"strEmail\"]";
    public String PasswordBox = "//*[@id=\"strPassword\"]";
    public String SignInButton = "//*[@type=\"submit\"]";
}
