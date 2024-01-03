Feature: Outdoor Page

  Scenario: User validate that outdoor page is opened
    Given The website homepage is displayed
    When Click on outdoor button
    Then Validate the outdoor page is displayed

  Scenario: User selects the second item and add it to cart
    Given Select the second item
    When Add to cart
    And Validate the item is added to cart
    Then Click on cart icon
    And Click on go to cart
    Then Validate the total price is equal to the item price you got