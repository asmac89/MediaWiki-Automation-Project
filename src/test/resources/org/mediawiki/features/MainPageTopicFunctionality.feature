@andytest

Feature: Main Page topic Functionalities
Background: 
Given: I logged into MediaWiki


Scenario: Adding Main Page topic 
Given The Main page is displayed
When I click on the Edit tab 
Then Editing Main Page topic title should be displayed 
Then I click on the Level 2 Headline text button
Then I type "TechNinja's Topic" 
Then I click on save changes button
Then "Your edit was saved" popup should be displayed
And "TechNinja's Topic" should be displayed
Then I log out of the application

Scenario: Adding Main Page topic description
Given The Main page is displayed
When I click on the Edit tab 
Then Editing Main Page topic title should be displayed 
And I type "TechNinjas are awesome!" inside the topic input box
Then I click on save changes button
Then "Your edit was saved" popup should be displayed
And "TechNinjas are awesome!" should be displayed 
Then I log out of the application


