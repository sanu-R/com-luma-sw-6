@smoke @regression
Feature:  As a user I want to see the women menu

  Scenario: Verify the sort by product name filter
    Given I am on the homepage
    And I hover on women menu
    And I click on jackets
    And I click on sort by
    And I select on sort by filter product name
    Then  verify the product name display in alphabetical order

  @regression
  Scenario: Verify the sort by price filter
    Given I am on the homepage
    And I hover on women menu
    And I click on jackets
    And I click on sort by
    And I select on sort by filter price
    Then verify the product price display in low to high