Feature: Discussion Tab on Main Page Functionalities
	
	Background: 
	Given I logged into MediaWiki
	
	
Scenario: Editing the Discussion tab
Given The Main Page is displayed
When I click on the Discussion tab
And Talk:Main Page should be displayed
Then I click on the Edit button
Then I type in the input box "hello"
Then I click on save changes button
Then I should be on the main page
Then "Your edit was saved" popup should be displayed
Then I log out of the application

Scenario: Reading the Discussion topics
Given The Main Page is displayed
When I click on the Discussion tab
And Talk:Main Page should be displayed
And under the Talk:Main page section
Then I should see "hello" is displayed
Then I log out of the application






