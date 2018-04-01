Feature: Main Page topic Functionalities

Background: 
Given: I logged into MediaWiki

Scenario: Editing Main Page topics
Given The Main Page is displayed
When I click on the Edit tab button
Then Editing Main Page topic title should be displayed 
Then I click inside the topic input box
And I type "Testing: Hello TechNinjas!"
Then I click on save changes button
Then I should be on the main page
Then "Your edit was saved" popup should be displayed

Scenario: Reading Main Page topics
Given The main page is displayed
When I scroll down the main page
Then "TechNinja's Topic" section should be displayed
And under "TechNinja's Topic", "TechNinjas are awesome!" should be displayed