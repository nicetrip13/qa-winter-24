Feature: Calculator
  Scenario: Some calculation check
    Given first number: 10
    And second number: 2

    When two numbers are summed
    Then result must be 12

    When we multiply two numbers
    Then result must be 20
