Feature: Check Search Box

Background: 
	Given I logged into MediaWiki


 	Scenario: Add a topic to the Discussion page
    Given  I see the Main page displayed
		When I click on the WatchList tab
		Then I should see the Watchlist options
		And I select "1" hour on Period of time to display
		And I select "Hide" checkBox
		And I click to selector
		Then I choose "MediaWiki"
		Then I click "Show" button
		And I should see result displayed
		Then I log out of the application