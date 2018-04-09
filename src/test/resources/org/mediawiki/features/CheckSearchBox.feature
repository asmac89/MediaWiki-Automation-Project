Feature: Check Search Box

  Background: 
    Given I logged into MediaWiki
@vera1
  Scenario: Check Search Functionality
    Given The Main page is displayed
    When I click on the input box
    Then I should be able to type "Details"
    When I click on the Search button
    Then Details should be displayed
    Then I log out of the application
@vera2
  Scenario: Check Pages Visited
    Given The Main page is displayed
    When I click on the WatchList tab
    Then I should see the "Mark all pages visited" box
    When I click on the Mark all pages visited
    And "Mark all pages visited" box should disappear
    Then I log out of the application
