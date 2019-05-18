#Feature: Test the Email Compose functionality of Vuture Portal
#
#  @TestCase1
#  Scenario Outline: Email should be composed successfully
#    Given I launch the Vuture Portal login page
#    And I enter a valid "<UserName>" and "<Password>"
#    And I click on Signin button
#    And I click on the right-hand frame of the window, name the email, again pick a name of your choice
#    And I click on invitation template to create a new email on the left-hand frame
#    And I click on publish email and the publish now
#    Then I verify that the status of the email is coming as ‘Live’ in the published page
#    And I close the browser
#
#    Examples:
#      | UserName            | Password  |
#      | maciej_r@yahoo.com  | Vuture!1  |