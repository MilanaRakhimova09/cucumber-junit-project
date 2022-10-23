Feature: Calculator should work for simple math


  As a user I should be able to do simple math

  Background:
    Given Calculator is open

  Scenario: Should be able to add two numbers
    When I add 2 with 3
    Then I should get 5

  Scenario: Should be able to add two numbers 2
      When I add 10 with 5
      Then i should get 15

  Scenarion: Should be able to add two numbers 3
        When I add 20 with 25
        Then i should get 45