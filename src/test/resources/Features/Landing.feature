@Regression

Feature: Landing
  @Landing
  Scenario: As a BBC editor, I want to accurately report the results of the 2023 Las Vegas Grand Prix, where Max
            Verstappen took 1st place, George Russell finished 2nd, and Sergio Perez secured 3rd place, so that my
            audience is informed about the key highlights of the race.

    Given   I am on BBC SPORT landing page
    And     I click on Formula1
    And     I click on Results
    And     I click on results year
    When    I click on LasVegas Grandprix results heading
    Then    LasVegas Grandprix results page is displayed
