
Feature: User page Functionalities:
  
 Background: 
	Given I logged into MediaWiki
	@johnathantest	 
  Scenario: Edit user section in main page
  		Given the Main page is displayed
  		And I click on TechNinjas7 link
  		Then User page should be displayed
    When I click on edit tab on User page
    And I edit the section name to "TechNinjas"
    When I click on the save button
    Then I should see the topic section for "TechNinjas"
		Then I log out of the application
		
		
  Scenario: View history of changes made to application
  Given the Main page is displayed
  And I click on TechNinjas7 link
  	Then User page should be displayed
  Then I click on the "View History" tab
  Then I see the revision history section and view all the changes made on the application
  Then I choose two revisions to compare
  When I click on the button "compare selected revisions"
 	Then I should see side by side comparisons and chnaged taht were made to the appllication
 	Then I log out of the application
  
  