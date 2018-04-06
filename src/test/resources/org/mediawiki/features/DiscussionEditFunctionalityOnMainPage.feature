

Feature: Discussion Tab on Main Page Functionalities
	
Background: 
Given I logged into MediaWiki

Scenario: Adding a Discussion topic
Given The Main page is displayed
When I click on the Discussion tab
And I click on the Edit tab 
Then Talk:Main Page title should be displayed
Then I click on the Level 2 Headline text button on Discussion page
Then I type "TechNinja's How to become a SDET" 
Then I click on save changes button
Then "Your edit was saved" popup should be displayed
And "TechNinja's How to become a SDET" should be displayed
Then I log out of the application

Scenario Outline: Adding multiple Discussion internal links
Given The Main Page is displayed
When I click on the Discussion tab
And I click on the Edit tab 
Then Talk:Main Page title should be displayed
Then I click on the internal link button
And I type "<TopicLinkNames>" 
Then I click on save changes button
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




