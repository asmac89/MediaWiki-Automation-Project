


Feature: Main Page topic Functionalities

Background: 
Given I logged into MediaWiki
@smoke
Scenario: Adding Main Page topic 
Given The Main page is displayed
When I click on the Edit tab on main page
Then Editing Main Page topic title should be displayed 
Then I click on the Level 2 Headline text button
Then I type "TechNinja's Topic" 
Then I click on save changes button on edit page
Then "Your edit was saved" popup should be displayed
And "TechNinja's Topic" topic should be displayed
Then I log out of the application

Scenario: Adding Main Page topic description
Given The Main page is displayed
When I click on the Edit tab on main page
Then Editing Main Page topic title should be displayed 
And I type "TechNinjas are awesome!" 
Then I click on save changes button on edit page
Then "Your edit was saved" popup should be displayed
And "TechNinjas are awesome!" description should be displayed 
Then I log out of the application


