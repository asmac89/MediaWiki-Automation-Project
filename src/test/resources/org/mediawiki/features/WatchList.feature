Feature: Check Search Box

@iliaStepanov
  Scenario: Dropdown list contains proper text
    Given I logged into MediaWiki
    Given The Main page is displayed
    When I click on the WatchList tab
    Then I should see the Watchlist Options
    Then I should see the Legend box
    And I choose 1 hour"1 hour" from dropdown list
    And I click on show button
    Then The text above shoould contains changes in the last hour"changes in the last hour"
    Then I log out of the application
    
@iliaStepanov
  Scenario: Dropdown list contains proper text and Legend box works properly
    Given I logged into MediaWiki
    Given The Main page is displayed
    When I click on the WatchList tab
    Then I should see the Legend box
    Then I should see the Watchlist Options
    When I click on Collapse button
    Then Text in Legend should not be dispaly 
    And I choose 90 days "90 days" from dropdown list
    And I click on show button
    Then The text above shoould contains changes in the last 2,160 hours"changes in the last 2,160 hours"
    Then I log out of the application
