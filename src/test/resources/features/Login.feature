
  Feature: Test the Login functionality of Vuture Portal

    @TestCase1
    Scenario Outline: Enter a valid username and password and navigate to vuture portal home page
      Given I launch the Vuture Portal login page
      And I enter a valid "<UserName>" and "<Password>"
      And I click on Signin button
      Then I can verify the Home Page URL "https://demo.vuturevx.com/home/home.aspx"
      And I close the browser

      Examples:
      | UserName            | Password  |
      | maciej_r@yahoo.com  | Vuture!1  |

