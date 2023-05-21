#All three cart checkout validation rules should be tested:
#FreeRule (buy N get N free)
#ReducedPriceRule (buy more than N pay a different price)
#FractionPriceRule (buy more than N, pay a percentage of the original price)

Feature: All cart checkout validations test cases
  As a user a want to purchase as many products I want
  During the order checkout all relative discounts will be properly applied

  Background:
    Given All products are loaded from the YAML file
    And All rules are loaded from the YAML file

# First rule only - Free Rule
    Scenario Outline: FreeRule buy N get N free
      Given I am on checkout stage with all my products
      When I buy "<purchasedProductQty>" products
      Then I should receive "<freeProduct>" products

      Examples:
        | purchasedProductQty | freeProduct|
        | 10                  |       1       |
        | 20                  |       2       |
        | 50                  |      -1       |
        | 30                  |       0       |

# Second rule only - Reduced Price
    Scenario Outline: ReducedPriceRule buy more than N pay a different price
      Given I am on checkout stage with all my products
      When I buy "<purchasedProductQty>" products
      Then I should receive "<discount>" on my purchase

      Examples:
        | purchasedProductQty | discount      |
        | 10                  |       10      |
        | 20                  |       20      |
        | 50                  |      -1       |
        | 30                  |       0       |

# Third rule only - FractionPriceRule
  Scenario Outline: FractionPriceRule buy more than N get percentage discount
    Given I am on checkout stage with all my products
    When I buy "<purchasedProductQty>" products
    Then I should receive "<percentageDiscount>" on my purchase

    Examples:
      | purchasedProductQty | percentageDiscount |
      | 10                  |       10           |
      | 20                  |       20           |
      | 50                  |       -1           |
      | 30                  |        0           |

# All rules at once in the same purchase

  Scenario Outline: All rules on the total purchased price
    Given I am on checkout stage with all my products
    When I buy "<purchasedProductQty>" products
    Then I should receive "<percentageDiscount>" on my purchase
    And I should receive "<discount>" on my purchase
    And I should receive "<freeProduct>" on my purchase

    Examples:
      | purchasedProductQty | percentageDiscount |discount|freeProduct|
      | 10                  |       10           |10      |     1     |
      | 20                  |       20           |20      |     2     |
      | 50                  |       -1           |-1      |    -1     |
      | 30                  |        0           | 0      |     0     |