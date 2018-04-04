Feature: Searching Pages

  Background: 
    Given I logged into MediaWiki

  
  Scenario: Search for all Talk pages
    When I click on special pages
    And I click on all pages
    Then in the namespace dropdown list, "(Main)" should be selected by default
    And I type "A" in the Display pages starting at: text box
    And I type "Z" in the Display pages ending at: text box
    And I select "Talk" in the namespace dropdown list
    Then all "Talk" pages should be displayed below
    Then I log out of the application

  Scenario: Search for all Cybertek's Wiki! pages
    When I click on special pages
    And I click on all pages
    Then in the namespace dropdown list, "(Main)" should be selected by default
    And I type "A" in the Display pages starting at: text box
    And I type "Z" in the Display pages ending at: text box
    And I select "Cybertek's Wiki!" in the namespace dropdown list
    Then all "Cybertek's Wiki!" pages should be displayed below
    Then I log out of the application
