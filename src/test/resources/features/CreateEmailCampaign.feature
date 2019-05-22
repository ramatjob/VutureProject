Feature: Test the Email Campaign Creation functionality of Vuture Portal

  @TestCase2
  Scenario Outline: Email campaign should be created successfully
    Given I launch the Vuture Portal login page
    And I enter a valid "<UserName>" and "<Password>"
    And I click on Signin button
    And I click on create email campaign link
    And I entered a "<Campaign Name>"
    And I select the first email template from "<Email Layout Dropdown>"
    And I click on the create button
    Then I verify that the "<Container/Campaign Name>" are displayed at the top of the window
    And I close the browser

    Examples:
      | UserName            | Password  | Campaign Name   | Email Layout Dropdown | Container/Campaign Name     |
      | maciej_r@yahoo.com  | Vuture!1  | Test-Campaign2  | email: invitation     | Generic  /  Test-Campaign2  |