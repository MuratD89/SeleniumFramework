package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyInformation {

    public CompanyInformation(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


      @FindBy(xpath = "//span[normalize-space()='Company']")
      public WebElement companyButton;

      @FindBy(xpath = "//span[normalize-space()='About BayWa r.e.']")
      public WebElement aboutBayWa;

      @FindBy(xpath = "//a[@title='Company Information']//div[@class='link-simple'][normalize-space()='Find out more']")
      public WebElement companyInformation;

      @FindBy(xpath = "//div[@class='logo']//a")
      public WebElement logoButton;









}
