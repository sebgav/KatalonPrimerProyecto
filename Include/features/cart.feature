@tag
Feature: Car Operations
  To be able to buy in the store
  as new user 
  i want to performs the car operations

  @tag1
  Scenario: Add product
    Given that user has opened the commerce
    When he select the product from the following section
      | product       | category | subcategory     |
      | Printed Dress | Women    | Evening Dresses |
    When he adds a products to the cart with
      | quantity | size | color |
      |        5 | S    | Pink  |
    Then he should see the added product in the cart
