Feature: Feature about google site

  Scenario:
    Given I open browser Chrome
    When I open google site
    Then I see Google site
#    Given I open browser Firefox

  Scenario Outline:
    Given I open google site
    When I enter word
    Then I see result word
#    Given I open browser Firefox
    Examples:
      | word     |
      | java     |
      | selenium |