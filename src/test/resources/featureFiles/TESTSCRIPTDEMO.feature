Feature: This scenario is to test input form of an application and practice selenium test for filling input form and sending details

  @Codility_Test
  Scenario Outline: Add products to the cart and verify that items are added to the cart
    Given I add four different products to my wish list
    When I view my wishlist table
    Then I find total four selected items in my wishlist
    When I search for lowest price product
    And I am able to add lowest price item to my cart
    Then I am able to verify the item in my cart
