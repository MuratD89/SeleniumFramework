
Feature: Assign Tasks
  User Story: As a user, I should be able to assign tasks under Quick Navigate Menu.

  Background:
    Given user is on login page of BleuCRM
    When user enters username
    And user enters password
    And user clicks to login button

Scenario:  HR User should be able to create a "High priority" tasks with the mandatory fields.
  When user Task button clicks
  And user clicks high priority box
  And user types task header
  And user sees the responsible person
  And user click the send button
  Then user's task is created on the homepage

 Scenario: HR User should be able to assign a task to more than one user
   When user Task button clicks
   And user types task header
   And user sees the responsible person
   And user click the addMore button
   And user assigns second person
   And user click the send button
   Then user's task is created on the homepage

Scenario: When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.
  When user Task button clicks
  And user types task header
  And user click the send button
  And user's task is created on the homepage
  Then user sees task under MY TASKS table.

Scenario: Checklist should be able to be added while creating a task.
  When user Task button clicks
  And user types task header
  And user clicks the checklist
  And user types the header checklist
  And user clicks the add button
  And user click the send button
  Then user's task is created on the homepage

Scenario: Deadline should be able to be added while creating a task.
  When user Task button clicks
  And user types task header
  And user clicks the deadline part
  And user select the date
  And user clicks the select button
  And user click the send button
  Then user's task is created on the homepage

Scenario: Time planning function should be able to be used in the setting of deadline.
  When user Task button clicks
  And user types task header
  And user clicks the time planning button
  And user clicks start part
  And user enter start task on part
  And user clicks the select button
  And user clicks finish part
  And user enter finish task part
  And user clicks the select button
  And user click the send button
 # And user sees the rest of duration
  Then user's task is created on the homepage


