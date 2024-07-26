
Feature: Search and check Item


	@searchProduct
  Scenario Outline: Search experience in both home and offer page of greencart
    Given User is on greenCart landing page
    When User searched with short name <Name> and extract actual name of the product
    Then User searched for the same short name <Name> in offers page to check if product exist
    And Ensure that both results are same
    
    Examples:
    |Name|
    |Tom|
