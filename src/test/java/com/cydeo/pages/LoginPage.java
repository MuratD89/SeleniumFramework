package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



      @FindBy (xpath="//input[@name='USER_LOGIN']")
      public WebElement userName;

     @FindBy(xpath = "//input[@name='USER_PASSWORD']")
     public WebElement password;

     @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement btn;

     @FindBy(id="user-name")
    public WebElement profile;

     @FindBy(xpath = "//div[@class='errortext']")
    public WebElement error_message;

     @FindBy(xpath = "//a[.='Forgot your password?']")
     public WebElement forgot_btn;

     @FindBy(xpath = "//div[.='Get Password']")
    public WebElement getPassword_btn;

     @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement remember_btn;

     @FindBy(xpath = "//input[@type='password']")
    public WebElement bullet_sign;





}
