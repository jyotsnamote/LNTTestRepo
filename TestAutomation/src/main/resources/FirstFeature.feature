Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  Scenario Outline: Title of your scenario
    Given open Gmail account link
    Then Enter information "<name>" And  "<password>"
    And login done 
    Examples: 
      | name    | password |
      | Jyotsna | jio      |
