Feature: Editing discussion tab on user page

Background: 
	Given I logged into MediaWiki
	
	Scenario: Edit the Discussion page
		Given that I see the User page displayed
		When I click on the Discussion tab
		Then I should see the Read, Edit, Add topic, View history and Star image tabs
		When I click on the Edit tab
		Then Editing User talk:Techninjas7 should be displayed
		And I should be able to type any "String" characters in the text field below
		Then I click on save changes button
		And what ever I had typed previously should be displayed on the newly loaded Discussion page
		Then I log out of the application
		
	Scenario: Add a topic to the Discussion page
		Given that I see the User page displayed
		When I click on the Discussion tab
		Then I should see the Read, Edit, Add topic, View history and Star image tabs
		When I click on the Add topic tab
		Then Editing User talk:Techninjas7 (new section) should be displayed
		Then I type "First Section" in the Subject text field
		Then I type "Tech Ninjas are so cool, they'll make you drool! :D" in the following text field
		Then I click on save changes button
		And what ever I had typed previously should be displayed on the newly loaded Discussion page
		Then I log out of the application
		