#Made by Afsheen
Feature: Upload Files

Background: 
	Given I logged into MediaWiki
	
Scenario: Upload a File
	When I click on Upload File
	Then I click on Choose File
	When I upload a file with valid data
	Then The uploaded file should be visible
	Then The name of the file should be the displayed automatically in Destination filename.
	And I scroll the page down
	And "Watch this file" checkbox should be checked by default 
	Then I click on Upload button
	Then The page should refresh
	And you should see the uploaded file on the file page
	
Scenario: Upload a File, Enter text in Summary and Select Checkbox
	When I click on Upload File
	Then I click on Choose File
	When I upload a file with valid data
	Then The uploaded file should be visible
	Then The name of the file should be the displayed automatically in Destination filename.
	And I scroll the page down
	And "Watch this file" checkbox should be checked by default
	Then type "text" in the summary box	
	And select "Ignore any warnings" checkbox
	Then I click on Upload button
	Then The page should refresh
	And you should see the uploaded file on the file page
	And verify the "text" is displayed in the File History section under the comment column