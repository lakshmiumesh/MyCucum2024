
Feature: Place the Order and check Item


	@placeOrder
  Scenario Outline: Order an item and check its name
    Given User is on greenCart landing page
    When User searched with short name <Name> and extract actual name of the product
    Then User Select the amount of the product and add to cart

    Examples:
    |Name|
    |Tom|
 