
Feature: Add to cart


  Scenario Outline : Add one quantity from store
    Given I'm on the store page
    When I add "<product_name>" to the cart
    Then  I should see 1 "<product_name>" in the cart
    Examples:
      | product_name |
      | Blue shoes   |
      | Anchor Bracelet|

    

