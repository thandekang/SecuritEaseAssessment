@Regression
Feature: Sport

  @Sport
  Scenario Outline:As an editor, I want to ensure that whenever someone searches for "Sport in 2023," at least 4 relevant
                   results are returned, so that users can access diverse and informative content.
    Given   I am on Landing page
    And I click on the Search link
    And enter the search input <searchInput>
    When click Search button
    Then search results are displayed


    Examples:
    |searchInput|
    |Sport in 2023            |
