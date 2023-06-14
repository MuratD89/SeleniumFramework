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





}
