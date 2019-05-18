package com.vuture.utility;


public enum UrlDetails {

    //QA environment details
    qa_url_VuturePortal("https://demo.vuturevx.com/mvc/login/"),

    //UAT environment details
    uat_url_VuturePortal("https://demo.vuturevx.com/mvc/login/"),

    //Prod environment details
    prod_url_VuturePortal("https://demo.vuturevx.com/mvc/login/");


    private String property;
    public void setProperty(String property){
        this.property = property;
    }

    public String getProperty(){
        return property;
    }

    UrlDetails(String property) {
        this.property = property;
    }
}
