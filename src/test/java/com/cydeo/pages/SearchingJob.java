package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingJob {

    public SearchingJob(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



      @FindBy (xpath="(//a[.='Our Software'])[1]")
      public WebElement OurSoftwareBtn;

      @FindBy(xpath = "(//a[.='Overview'])[1]")
      public WebElement OverviewBtn;

      @FindBy(xpath = "(//a[.='Contact'])[1]")
      public WebElement contactUsbtn;

      @FindBy(xpath="//div[@class='lin']")
      public WebElement LinkedInbtn;

      @FindBy(xpath = "//a[.='Contact']")
      public WebElement contact;

     @FindBy( id ="ember323")
     public WebElement JobsBtn;

     @FindBy(xpath = "//span[.='Quality Assurance Engineer (m/f/d)']")
    public WebElement btn;

     @FindBy(xpath = "//title[.='PACE Aerospace Engineering & Information Technology']")
    public WebElement title;





}
