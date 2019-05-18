Feature: Test the Logout functionality of Vuture Portal

  @TestCase1
  Scenario Outline: User should be logged out of vuture portal successfully
    Given I launch the Vuture Portal login page
    And I enter a valid "<UserName>" and "<Password>"
    And I click on Signin button
    Then I can verify the Home Page URL "https://demo.vuturevx.com/home/home.aspx"
    And I click on logout button
    Then I can verify the Login page URL "https://demo.vuturevx.com/login/login.aspx"
    Then I verify that the Username,Password and Signin elements are visible
    And I close the browser

    Examples:
      | UserName            | Password  |
      | maciej_r@yahoo.com  | Vuture!1  |