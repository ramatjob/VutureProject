Feature: Test the Email Compose functionality of Vuture Portal

  @TestCase3
  Scenario Outline: Email should be composed successfully
    Given I launch the Vuture Portal login page
    And I enter a valid "<UserName>" and "<Password>"
    And I click on Signin button
    And I click on create email campaign link
    And I entered a "<Campaign Name>"
    And I select the first email template from "<Email Layout Dropdown>"
    And I click on the create button
    And On the right hand frame, i enter an "<Email Name>"
    And I click on the invitation icon
    And I click on publish email
    And I click on publish now
    Then I verify that the "<Email Status>" is coming as Live in the published page
    And I close the browser

    Examples:
      | UserName            | Password  | Campaign Name   | Email Layout Dropdown | Email Name  | Email Status  |
      | maciej_r@yahoo.com  | Vuture!1  | Test-Campaign1  | email: invitation     | Test-Mail1  | Live          |