#Feature: Test the Email Campaign Creation functionality of Vuture Portal
#
#  @TestCase1
#  Scenario Outline: Email campaign should be created successfully
#    Given I launch the Vuture Portal login page
#    And I enter a valid "<UserName>" and "<Password>"
#    And I click on Signin button
#    And I click on icon to create a new email campaign
#    And I name the campaign on the left frame or i can pick a name of my choice
#    And I click on the create button for the first email template in the list
#    Then I verify that the container and campaign names are displayed at the top of the window
#    And I close the browser
#
#    Examples:
#      | UserName            | Password  |
#      | maciej_r@yahoo.com  | Vuture!1  |