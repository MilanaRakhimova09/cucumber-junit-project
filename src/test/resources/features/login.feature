@smoke @Regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed.

  Accounts are: librarian, student, admin


  Background: For thwe scenarios in the feature file,user is expected
  Given user is on the library login page


  @smoke
  Scenario: Login as a librarian
    #Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard


  Scenario: Login as a student
    #Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

 @smoke
  Scenario: Login as a student
    #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard
