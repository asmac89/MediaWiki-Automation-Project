

Feature: Discussion Tab on Main Page Functionalities
	
Background: 
Given I logged into MediaWiki
Scenario: Adding a Discussion topic
Given The Main page is displayed
When I click on the Discussion tab on main page
Then Talk:Main Page title should be displayed
And I click on the Edit tab on discussion page
Then Editing Talk:Main Page title should be displayed 
Then I click on the Level 2 Headline text button 
Then I type "TechNinja's How to become a SDET" 
Then I click on save changes button on edit page
Then "Your edit was saved" popup should be displayed
And "TechNinja's How to become a SDET" topic should be displayed on edit page
Then I log out of the application
@andytest

Scenario Outline: Adding multiple Discussion internal links
Given The Main page is displayed
When I click on the Discussion tab on main page
Then Talk:Main Page title should be displayed
And I click on the Edit tab on discussion page
Then Editing Talk:Main Page title should be displayed 
Then I click on the internal link button on Discussion page
And I type "<TopicLinkNames>" link
Then I click on save changes button on edit page
Then "Your edit was saved" popup should be displayed
And "<TopicLinkNames>" link should be displayed 
And "<TopicLinkNames>" is clickable
Then I log out of the application

Examples: 
|TopicLinkNames|
|Java Tutorials|
|Selenium Tutorials|
|TestNG Tutorials|
|Cucumber BDD Tutorials|
|JIRA Tutorials|
|Jenkins Tutorials|
|Maven Tutorials|
|HTML Tutorials|
|Agile Tutorials|




