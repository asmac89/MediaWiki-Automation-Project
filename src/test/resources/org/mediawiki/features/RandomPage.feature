@functionality

Feature: Random Page


Background: 
	Given I logged into MediaWiki

Scenario: Click on Random Page
	When I click on random page
	Then I should see a random page appear
	And I click on Random Page again, it should show me a different page instead of displaying the same one
 Then I log out of the application
 
Scenario: Click on Random Page, Edit the page, Save changes, Verify the text is displayed.
	When I click on random page
	Then I should see a random page appear
	When I click on Random Page again, it should show me a different page instead of displaying the same one
	Then I click on the Edit tab
	Then I type text in the edit box
	And I click on Save changes button
	And I should see the text that was added to the page displayed on the page and verify it
	Then I log out of the application