Feature: 

  Background: 
    Given I logged into MediaWiki
@scenariotest
  Scenario: Advanced  Search Functionality
    Given The Main page is displayed
    When I click on special pages
    When I click on the "Search"
    And I should able to see search input
    Then  I click on "Advanced"
    Then I text "Details"
    Then uncheck "Main"
    And check "Talk"
    Then click Search button
    And I should  be able too see result
    Then I log out of the application

    @ver4
    
    Scenario: Search with wildcard
    Given The Main page is displayed
    When I click on special pages
    When I click on the "Search"
    Then  I click on Everything button
    Then I write "Sele*"
    Then  I click on the "Search" buton
    Then I should be able to see "[[Selenium Tutorials]]" and "Selenium and Java"
    Then I log out of the application