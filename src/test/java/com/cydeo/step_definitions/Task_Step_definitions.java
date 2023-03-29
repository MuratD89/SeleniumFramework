package com.cydeo.step_definitions;

import com.cydeo.pages.TaskPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Step_definitions extends TaskPage {

 //   WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);

    TaskPage taskPage=new TaskPage();

    @When("user Task button clicks")
    public void user_task_button_clicks() {
        taskPage.task_btn.click();
    }
    @When("user clicks high priority box")
    public void user_clicks_high_priority_box() {
       taskPage.highPriorityBox.click();
    }
    @When("user types task header")
    public void user_types_task_header() {
       taskPage.header.sendKeys("Task2");
    }

    @When("user sees the responsible person")
    public void user_sees_the_responsible_person() {
       taskPage.responsiblePerson.isSelected();
    }
    @When("user click the send button")
    public void user_click_the_send_button() {
        BrowserUtils.sleep(2);
       taskPage.send_btn.click();
    }
    @Then("user's task is created on the homepage")
    public void user_s_task_is_created_on_the_homepage() {
        BrowserUtils.sleep(5);
        String expected="Task2";
        String actual=taskPage.task.getText();
        Assert.assertEquals(expected, actual);

    }

    @When("user click the addMore button")
    public void user_click_the_add_more_button() {
       taskPage.addMore.click();
       BrowserUtils.sleep(2);
    }
    @When("user assigns second person")
    public void user_assigns_second_person() {
        taskPage.addPerson.click();
        BrowserUtils.sleep(4);
    }

    @Then("user sees task under MY TASKS table.")
    public void user_sees_task_under_my_tasks_table() {
    //   System.out.println("taskPage.ongoingTask.isDisplayed() = " + taskPage.ongoingTask.isDisplayed());
      //  System.out.println("taskPage.ongoingTask.getText() = " + taskPage.ongoingTask.getText());
          String countTask=taskPage.CountTaskActual.getText();
       String actual=taskPage.CountTaskActual.getText();
       Assert.assertEquals(countTask, actual);
        System.out.println("taskPage.CountTaskActual.getText() = " + taskPage.CountTaskActual.getText());


    }

    @When("user clicks the checklist")
    public void user_clicks_the_checklist() {
    taskPage.checklistAdd.click();
    }
    @When("user types the header checklist")
    public void user_types_the_header_checklist() {
     taskPage.typeCheck.sendKeys("Check1");
    }
    @When("user clicks the add button")
    public void user_clicks_the_add_button() {
    taskPage.addBtn.click();
    }

    @When("user clicks the deadline part")
    public void user_clicks_the_deadline_part() {
     taskPage.dateBtn.click();
    }
    @When("user select the date")
    public void user_select_the_date() {
     taskPage.dateGet.click();
    }
    @When("user clicks the select button")
    public void user_clicks_the_select_button() {
        taskPage.SelectBtn.click();
        BrowserUtils.sleep(3);
    }

    @When("user clicks the time planning button")
    public void user_clicks_the_time_planning_button() {
        taskPage.TimePlanningBtn.click();
    }

    @When("user clicks start part")
    public void user_clicks_start_part() {
     taskPage.TimeStart.click();
    }
    @When("user enter start task on part")
    public void user_enter_start_task_on_part() {
   //  wait.until(ExpectedConditions.invisibilityOf(taskPage.Time1Btn));
     taskPage.Time1Btn.click();

    }

    @When("user clicks finish part")
    public void user_clicks_finish_part() {
        taskPage.TimeFinish.click();
    }
    @When("user enter finish task part")
    public void user_enter_finish_task_part() {
//      wait.until(ExpectedConditions.invisibilityOf(taskPage.TimeBtnFinal));
       taskPage.TimeBtnFinal.click();
    }
    @When("user sees the rest of duration")
    public void user_sees_the_rest_of_duration() {
        taskPage.Duration.isDisplayed();
        System.out.println("taskPage.Duration.isDisplayed() = " + taskPage.Duration.isDisplayed());
      //  String x=taskPage.Duration.getText();
     //   int var=Integer.parseInt(x);
    //    System.out.println("var = " + var);

    }

}
