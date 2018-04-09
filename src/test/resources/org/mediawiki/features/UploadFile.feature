#Made by Afsheen
Feature: Upload Files

  Background: 
    Given I logged into MediaWiki

  @AfsheensTest
  Scenario: Upload a File
    When I click on Upload File
    Then I click on Choose File
    When I upload a file with valid data
    Then The uploaded file should be displayed automatically in Destination filename
    And I scroll the page down
    And select Ignore any warnings checkbox
    And verify that Watch this file checkbox should be checked by default
    Then I click on Upload button
    And you should see the uploaded file on the file page by verifying text of the file

  @AfsheensTest
  Scenario: Upload a File, Enter text in Summary and Select Checkbox
    When I click on Upload File
    Then I click on Choose File
    When I upload a file with valid data
    Then The uploaded file should be displayed automatically in Destination filename
    And I scroll the page down
    And select Ignore any warnings checkbox
    Then type text in the summary box
    And verify that Watch this file checkbox should be checked by default
    Then I click on Upload button
    And you should see the uploaded file on the file page by verifying text of the file
    And verify the text is displayed in the File History section under the comment column on File Page
