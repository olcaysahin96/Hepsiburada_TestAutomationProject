Feature: Hepsiburada Product Feature Test Scenarios

  Background:
    Given I start the browser
    And I'm going to the hepsiburada page

  Scenario: Adding products to the basket by logging in
    And I click the login button
    And I'm filling in the username, password fields and clicking the login button
    And I'm searching "Samsung"
    And I verify that there are products
    And I add the Samsung product to the cart
    Then I add the product from another seller to the cart
    Then I close the browser

  Scenario: Adding the product to the cart without user login
    And I am adding the drone spare part to the basket
    Then I close the browser

