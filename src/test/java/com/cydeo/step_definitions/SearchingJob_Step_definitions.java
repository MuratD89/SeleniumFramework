package com.cydeo.step_definitions;

import com.cydeo.pages.SearchingJob;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class SearchingJob_Step_definitions extends SearchingJob {

    SearchingJob searchingJob=new SearchingJob();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @When("user enters the main page")
    public void user_enters_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @And("user clicks master button")
    public void userClicksMasterButton() {
        searchingJob.bachelor.click();
    }

    @And("user scroll down and up")
    public void userScrollDownAndUp() {
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1750)");
        }
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-1750)");
        }

    }

    @And("user goes back to main page")
    public void userGoesBackToMainPage() {
        Driver.getDriver().navigate().back();
    }

    @Then("user should see the main page")
    public void userShouldSeeTheMainPage() {
        String expectedTitle="Dein Studium an der IU | IU Internationale Hochschule";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
