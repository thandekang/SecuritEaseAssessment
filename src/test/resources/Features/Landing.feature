Feature: Landing

  Scenario: As a BBC editor, I want to accurately report the results of the 2023 Las Vegas Grand Prix, where Max
            Verstappen took 1st place, George Russell finished 2nd, and Sergio Perez secured 3rd place, so that my
            audience is informed about the key highlights of the race.
    Given I am on the Landing page
    And I click on Formula1
    And I click on Results
    And I click 2023
    When I click on LasVegas Grandprix results heading
    Then the LasVegas Grandprix results page is displayed