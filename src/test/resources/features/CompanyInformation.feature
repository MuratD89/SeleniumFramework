@smoke
Feature: Company Information
  User Story:
  As a user, I should be able to enter the Company Information page


Scenario: User should be able to enter the Company Information page
  When user enters the main page
  And user clicks "Company" button
  And user clicks "About BayWa r.e."
  And user enters the About BayWa r.e. page and clicks "Company Information"
  And user scroll down and up
  And user goes back to main page
  Then user should see the title "BayWa r.e. is your partner for renewable energy"









