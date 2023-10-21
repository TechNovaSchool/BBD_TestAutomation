

  Feature: Log Out


    @smoke
    Scenario: Log Out
      Given I Login Into The TN Bank
      When I Am On The Home Page
      Then I Should See Log Out Button is Displayed
      And I Click Log Out Button
      Then I Should Log Out Successfully

