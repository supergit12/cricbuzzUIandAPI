@realtest
Feature: Scorecard

  @e2etest
  Scenario Outline: Scorecard with valid data for happy path test
    Given work with UI in "<bn>" and get runs into a list
      | mid   | mdesc                                                | batsman | innings |
      | 91735 | srh-vs-rr-qualifier-2-indian-premier-league-2024     |       2 |       1 |
      | 92217 | ire-vs-ned-6th-t20i-netherlands-t20i-tri-series-2024 |       4 |       2 |
      | 91077 | usa-vs-ban-2nd-t20i-bangladesh-tour-of-usa-2024      |       2 |       2 |
    And work with API and get runs into a list
      | mid   | batsman | innings |
      | 91735 |       2 |       1 |
      | 92217 |       4 |       2 |
      | 91077 |       2 |       2 |
    And compare two lists

    Examples: 
      | bn      |
      | chrome  |
      | firefox |
      | edge    |
