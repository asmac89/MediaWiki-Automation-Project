Feature: Check Search Box

Background: 
	Given I logged into MediaWiki
	
	Scenario: Check Search Functionality
		Given I see the Main page displayed
		When I click on the input box
		Then I should be able to type "Details"
		When I click on the Search button
		Then Details should be displayed
	Then I log out of the application
		
	Scenario: Add a topic to the Discussion page
    Given  I see the Main page displayed
		When I click on the WatchList tab
		Then I should see the Mark all pages visited
		When I click on the Mark all pages visited
		And Mark all pages visited button should disappear
		Then I log out of the application