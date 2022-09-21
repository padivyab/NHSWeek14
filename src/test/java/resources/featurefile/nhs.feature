Feature: NHS Functionality

  As a user I want to NHS Costs

  Scenario: NHS wales cost check

    Given I am on Homepage
    When  I click on start button
    And   I click on wales
    And   I click on next button
    And   I click on yes button
    And   I click on next button
    And   I click on wales
    And   I click on next button
    And   I click on day
    And   I click on month
    And   I click on year
    And   I click on link
    And   I click on next a button
    And   I click on yes button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    And   I click on no button
    And   I click on next button
    Then  I verify costs "You get free:"

  Scenario: NHS northern ireland

    Given I am on Homepage
    When  I click on start button
    And   I click on northern ireland
    And   I click on next button
    Then  I verify costs page "You cannot use this service because you live in Northern Ireland"



