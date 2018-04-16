@functionality
Feature: User page Functionalities:
  
 Background: 
	Given I logged into MediaWiki
	@smoke
  Scenario: Edit user section in main page
  		Given The Main page is displayed
  		And I click on TechNinjas7 link
  		Then User page should be displayed
    When I click on edit tab on User page
    And I edit the input box to "TechNinjas"
    When I click on the save button
    Then "TechNinjas" should be displayed on UserPage
		Then I log out of the application
		
			 
	@johnathantest	
  Scenario: View history of changes made to application
  Given The Main page is displayed
  And I click on TechNinjas7 link
  	Then User page should be displayed
  Then I click on the "View History" tab
  Then I see the revision history section and view all the changes made on the application
  Then I choose the first revision to compare with the default
  When I click on the button "compare selected revisions"
 	Then I should see side by side comparisons and changes that were made to the appllication
 	Then I log out of the application
  
  