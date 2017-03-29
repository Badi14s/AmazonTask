Feature: Shop for book definition
  In order to purchase it later
  As a customer
  I want to add a book to my shopping basket

  Scenario: Customer can add a book to shopping basket
    Given I navigate to homepage
    And I navigate to section books
    And I search for book by title
    And I see that the first item's title on results page matches
    And I see that the first item has badge Best Seller
    And I see that the first item's price for type Hardcover matches
    And I open the first item from results page
    And I see title on book details page mathes
    And I see badge Best Seller on book details page
    And I see that type Hardcover is selected
    And I see price for type Hardcover on book details page matches
    When I add item to basket
    And I see notification that item is added to the basket
    And I see that title in the basket matches
    And I see one item in the basket
    And I click on Edit basket
    Then I see one item in basket list
    And I see that title in basket list matches
    And I see type Hardcover in basket list
    And I see price in basket list matches
    And I see that quantity in basket list mathes
    And I see subtotal price in basket list matches




