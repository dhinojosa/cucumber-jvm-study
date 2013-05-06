Feature: A calculator should be able to add, subtract, divide, and multiply

  Scenario: The calculator should add
    Given a calculator instance
    When the sum method is given two numbers
    Then the calculator should return the sum of the two numbers

  Scenario: The calculator should add two numbers from a feature
    Given a calculator instance
    When the sum method is given two numbers, 4 and 9
    Then the calculator should return the sum of the two numbers

  Scenario: Given the following table of entries
    Given the following calculator entries:
      | num1 | num2 | result |
      | 1    | 5    | 6      |
      | 3    | 6    | 9      |
      | 6    | 7    | 13     |
    And a calculator instance generated from the table
    When each the first two columns are placed into the calculator
    Then the calculator should return the value of the last column

