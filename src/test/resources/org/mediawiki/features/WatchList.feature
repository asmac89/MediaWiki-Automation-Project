Feature: Check Search Box

  Scenario: Dropdown list contains proper text
    Given I logged into MediaWiki
    Given The Main page is displayed
    When I click on the WatchList tab
    Then I should see the Watchlist options
    Then I should see the Legend box
    Then I click on dropdown list
    And I choose 1 hour from dropdown list
    And I click on show button
    Then The text above shoould contains "changes in the last hour"
    Then I log out of the application

  Scenario: Dropdown list contains proper text and Legend box works properly
    Given I logged into MediaWiki
    Given The Main page is displayed
    When I click on the WatchList tab
    Then I should see the Legend box
    And I should see the Watchlist Options
    When I click on Collapse button
    Then Text in Legend should be equals to "Legend:[Expand]"
    Then I click on dropdown list
    And I choose 90 days from dropdown list
    And I click on show button
    Then The text above shoould contains "changes in the last 2,160 hours"
    Then I log out of the application
