Feature: Login Functionality
  User Story:
  As a user, I should be able to log in
Background:
  Given user is on login page of BleuCRM
@BLEU10-298
Scenario Outline: User should be able to log in with valid credentials as HR user
  When user enters username "<userName>"
  And user enters password "<password>"
  And user clicks to login button
  Then user should be on the homepage
  Examples: HR valid credentials
    | userName                 | password |
    | hr1@cybertekschool.com   | UserUser |
    | hr50@cybertekschool.com  | UserUser |
    | hr101@cybertekschool.com | UserUser |
@BLEU10-299
  Scenario Outline: User should be able to log in with valid credentials as Helpdesk user
  When user enters username "<userName>"
  And user enters password "<password>"
  And user clicks to login button
  Then user should be on the homepage
  Examples:
    | userName                       | password |
    | helpdesk1@cybertekschool.com   | UserUser |
    | helpdesk50@cybertekschool.com  | UserUser |
    | helpdesk101@cybertekschool.com | UserUser |

@BLEU10-300
  Scenario Outline: User should be able to log in with valid credentials as Marketing user
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user should be on the homepage
    Examples:
      | userName                        | password |
      | marketing1@cybertekschool.com   | UserUser |
      | marketing50@cybertekschool.com  | UserUser |
      | marketing101@cybertekschool.com | UserUser |
@BLEU10-301
  Scenario Outline: User sees error message if enter with invalid credentials
  When user enters username "<userName>"
  And user enters password "<password>"
  And user clicks to login button
  Then user gets the message of incorrect login or password
  Examples:
    | userName                      | password |
    | marketing1@cybertekschool.com | USERuser |
    | marketing1@cybertekschool     | UserUser |
    | marketing1@cybertekschool     | USERuser |

Scenario: User sees the message of Please fill out this field if leaves credentials fields empty
  When user leaves the field of username empty
  When user leaves the field of password empty
  And user clicks to login button
  Then user sees the message of Please fill out this field

Scenario:User lands on the ‘Get Password’ page after clicking on the "Forgot your password?" link
  When user click on button of Forgot your password
  Then user lands on the page where get your password is written.

Scenario: User sees Remember me link exists and is clickable on the login page
  When user sees remember me link
  Then user can click this link on the login page

Scenario: User should see the password as bullet signs
  When user enters password "<password>"
  Then user should see the password is encrypted

Scenario Outline: user press the enter button on the keyboard to login
    When user enters username "<userName>"
    And user enters password "<password>"
    And user press the enter button
    Then user should be on the homepage
    Examples:
      | userName               | password |
      | hr1@cybertekschool.com | UserUser |
  @smoke
Scenario Outline: Users can see their own usernames in the profile menu, after successful login
  When user enters username "<userName>"
  And user enters password "<password>"
  And user clicks to login button
  Then user should see their own "<profileName>"
  Examples:
    | userName                      | password | profileName |
    | marketing1@cybertekschool.com | UserUser | marketing   |
    | hr1@cybertekschool.com        | UserUser | hr          |
    | helpdesk1@cybertekschool.com  | UserUser | helpdesk    |




