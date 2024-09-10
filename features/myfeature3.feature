@realtest
Feature: Scorecard

  @e2etest
  Scenario Outline: Scorecard with valid data for happy path test
    Given open "<bn>" browser
    When launch site for "<mid>" matchid with "<mdesc>"
    And get runs of <batsman> for <innings> in page
    And close site
    And define http request for "<mid>" matchid
    And send http request using GET
    And get runs of <batsman> for <innings> in JSON response
    Then compare runs in JSON response and in page

    Examples: 
      | bn      | mid   | mdesc                                                | batsman | innings |
      | chrome  | 91735 | srh-vs-rr-qualifier-2-indian-premier-league-2024     |       2 |       1 |
      | firefox | 92217 | ire-vs-ned-6th-t20i-netherlands-t20i-tri-series-2024 |       4 |       2 |
      | edge    | 91077 | usa-vs-ban-2nd-t20i-bangladesh-tour-of-usa-2024      |       2 |       2 |
