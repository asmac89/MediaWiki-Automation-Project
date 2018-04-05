Feature: Discussion Tab on Main Page Functionalities
	
	Background: 
	Given I logged into MediaWiki
	


Scenario: Adding Discussion tab topic
Given The Main page is displayed
When I click on the Discussion tab
And I click on the Edit tab 
Then  Talk:Main Page title should be displayed
Then I type "==TechNinja's Discussion Topic==" inside the topic input box
Then I click on save changes button
Then "Your edit was saved" popup should be displayed
And "TechNinja's Discussion Topic" should be displayed
Then I log out of the application

Scenario: Adding Discussion tab topic links
Given The Main Page is displayed
When I click on the Discussion tab
And I click on the Edit tab 
Then  Talk:Main Page title should be displayed
And I type "[[TechNinjas Java Tutorials]]" inside the topic input box
Then I click on save changes button
Then "Your edit was saved" popup should be displayed
And "[[TechNinjas Java Tutorials]]" should be displayed 
Then I log out of the application





