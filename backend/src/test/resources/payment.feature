Feature: payment

Scenario: Successful payment
  Given I am on a cause page
  When I select a donation amount
  And I fill name input field with a name
  And I click Pay
  Then I am redirected to the Payment page