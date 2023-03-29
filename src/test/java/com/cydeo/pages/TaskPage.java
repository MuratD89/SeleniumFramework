package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Task']")
    public WebElement task_btn;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement header;

    @FindBy(id="tasks-task-priority-cb")
    public WebElement highPriorityBox;

    @FindBy(xpath = "//a[@class='task-form-field-item-text task-options-destination-text']")
    public WebElement responsiblePerson;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement send_btn;

    @FindBy(xpath = "(//a[text()='Task2'])[1]")
    public WebElement task;

    @FindBy(xpath = "//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add']")
    public WebElement addMore;

    @FindBy(xpath = "//div[.='helpdesk2@cybertekschool.com']")
    public WebElement addPerson;

    @FindBy(xpath = "//span[.='Ongoing']")
    public WebElement ongoingTask;

    @FindBy(xpath = "//span[.=31]")
    public WebElement count1;

    @FindBy(xpath = "//span[.=32]")
    public WebElement count2;

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement checklistAdd;

    @FindBy(xpath = "(//input[@placeholder='Things to do'])[2]")
    public WebElement typeCheck;

    @FindBy(xpath = "//span[.='add']")
    public WebElement addBtn;

    @FindBy(xpath = "//input[@data-bx-id='datepicker-display']")
    public WebElement dateBtn;

    @FindBy(xpath = "//a[@data-date='1678406400000']")
    public WebElement dateGet;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement SelectBtn;


    @FindBy(xpath = "(//input[@class='task-options-inp'])[3]")
    public WebElement Duration;

    @FindBy(xpath = "//span[.='Time planning']")
    public WebElement TimePlanningBtn;

    @FindBy(xpath = "//a[@data-date='1677628800000']")
    public WebElement Time1Btn;

    @FindBy(xpath = "(//a[.='7'])[1]")
    public WebElement TimeBtnFinal;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[2]")
    public WebElement TimeStart;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-end-date-plan']")
    public WebElement TimeFinish;

    @FindBy(xpath = "//span[.='65']")
    public WebElement CountTaskActual;












}
