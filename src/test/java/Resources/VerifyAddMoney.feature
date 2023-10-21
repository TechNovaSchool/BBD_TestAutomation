

  Feature: Verify Add Money Button is Displayed

    @smoke
    Scenario: Verify Add Money Button is Displayed
      Given I Login Into The TN Bank
      When I Am On The Home Page
      Then I Should See Add Money Button Is Displayed

