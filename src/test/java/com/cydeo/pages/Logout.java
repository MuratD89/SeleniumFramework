package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends LoginPage {
    public Logout(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout_btn;

    @FindBy(id="user-name")
    public WebElement profile;

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement endup;
}
