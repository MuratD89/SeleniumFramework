package com.cydeo.step_definitions;

import com.cydeo.pages.Logout;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Log_out_Step_definitions extends Logout {

    Logout logout=new Logout();

    @When("user enters username")
    public void user_enters_username() {
       logout.userName.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters password")
    public void user_enters_password() {
     logout.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click to logout")
    public void user_click_to_logout() {
        logout.logout_btn.click();

    }


    @When("user click to profilename")
    public void user_click_to_profilename() {
       logout.profile.click();
    }
    @Then("user should log out and ends up the login page")
    public void user_should_log_out_and_ends_up_the_login_page() {
      String expected="Authorization";
      String actual=logout.endup.getText();
        Assert.assertEquals(expected, actual);

    }

    @When("user click the step button")
    public void user_click_the_step_button() {

        Driver.getDriver().navigate().back();
    }
    @Then("user cannot go to the home page")
    public void user_cannot_go_to_the_home_page() {
        String expected="Authorization";
        String actual=logout.endup.getText();
        Assert.assertEquals(expected, actual);
    }


    @When("user close the open tab\\(s)")
    public void user_close_the_open_tab_s() {
        BrowserUtils.openNewTab();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> allOpenTabs = new ArrayList<>(windowHandles);

        //allOpenTabs.size()-1 --> don't close the empty tab
        for (int i = 0; i < allOpenTabs.size()-1; i++) {
            Driver.getDriver().switchTo().window(allOpenTabs.get(i));
            Driver.getDriver().close();
        }
        BrowserUtils.switchToWindow(0);
    }



    @When("user open home page url")
    public void user_open_home_page_url() {
      BrowserUtils.sleep(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Then("user can not go to home page")
    public void user_can_not_go_to_home_page() {
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());

    }

}
