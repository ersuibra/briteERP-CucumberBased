Feature:  Verifying Purchasable Products functionality from user perspective

  Background:
    Given User on login page
    Then User clicks on Master Data button
    And User clicks on Purchasable Products button


  Scenario: Verifying Purchasable Products  functionality
    Then User should see the all products


  Scenario: Verify iPad Mini2 product
    When User clicks on "iPad Mini2" product
    Then User should see the "iPad Mini2"


  Scenario: Printing  iPad Mini2 product label
    And User clicks on "iPad Mini2" product
    And User clicks on print dropdown button
    Then User clicks on Product Labels button
    When User clicks on print button
    Then User should see the printing label


  Scenario Outline: Creating new product
    And User clicks on create new product button
    And User enters the product name "<product_name>"
    Then User enters the product price "<product_price>"
    And User enters the cost "<cost>"
    When User clicks on save
    Then User should see the saved product "<product_name>"

    Examples:
      | product_name | product_price | cost |
      | iphone 7     | 750           | 0    |
      | iphone 8     | 850           | 0    |

  @zek
  Scenario: Vintage shirt edit test
    And User clicks on  the Vintage Shirt product
    And User clicks on edit button
    Then User enters the sale price 0.0
    When User clicks on savebutton product
    Then User should see the new sale price and cost



