Feature: Logout Functionality
  User Story :
  As a user, I should be able to log out
  Background:
    Given user is on login page of BleuCRM
    When user enters username
    And user enters password
    And user clicks to login button



  Scenario: User can log out and ends up the login page
  When user click to profilename
  And user click to logout
  Then user should log out and ends up the login page


  Scenario: user can not go to the home page again by clicking the step back button
    When user click to profilename
    And user click to logout
    And user should log out and ends up the login page
    And user click the step button
    Then user cannot go to the home page


  Scenario: user must be logged out if the user close the open tab

    When   user close the open tab(s)
    And   user open home page url
    Then  user can not go to home page

