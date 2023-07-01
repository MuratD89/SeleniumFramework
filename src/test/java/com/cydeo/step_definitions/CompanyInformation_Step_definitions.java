package com.cydeo.step_definitions;

import com.cydeo.pages.CompanyInformation;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CompanyInformation_Step_definitions extends CompanyInformation {

    CompanyInformation searching=new CompanyInformation();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @When("user enters the main page")
    public void user_enters_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    }

    @And("user clicks {string} button")
    public void userClicksButton(String CompanyButton) {
        BrowserUtils.sleep(1);
        searching.companyButton.click();
    }

    @And("user clicks {string}")
    public void userClicks(String aboutWayWa) {
        BrowserUtils.sleep(1);
        searching.aboutBayWa.click();
    }

    @And("user enters the About BayWa r.e. page and clicks {string}")
    public void userEntersTheAboutBayWaREPageAndClicks(String companyInformation) {
        BrowserUtils.sleep(1);
        searching.companyInformation.click();
        BrowserUtils.sleep(1);

    }

    @And("user scroll down and up")
    public void userScrollDownAndUp() {
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,1500)");
        }
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-1500)");
        }

    }

    @And("user goes back to main page")
    public void userGoesBackToMainPage() {
        searching.logoButton.click();
    }

    @Then("user should see the title {string}")
    public void userShouldSeeTheTitle(String arg0) {
        String expectedTitle="BayWa r.e. is your partner for renewable energy";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
