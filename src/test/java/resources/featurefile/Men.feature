@smoke @regression
Feature:  As a user I want to see the men menu

  Scenario: User should be able to add product successfully to shopping cart
    Given I am on the homepage
    When  I hover on men menu
    And   I hover on bottoms
    And   I click on pants
    And   I hover on product name ‘Cronus Yoga Pant’
    And   I click on size '32'
    And   I hover and click on colour Black
    And   I add to cart button
    Then  I can see text ‘You added Cronus Yoga Pant to your shopping cart.’
    And   I click on ‘shopping cart’ Link into message
    Then  I can see the  text ‘Shopping Cart.’
    And   I can see the product name ‘Cronus Yoga Pant’
    Then  I can see the product size 32
    And   I can see the product colour ‘Black’
