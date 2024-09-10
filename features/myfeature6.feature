@realtest
Feature: Scorecard

  @apitest
  Scenario Outline: Scorecard with valid and invalid data for happy path test and fuzzy test
    Given define http request for "<mid>" matchid
    When send http request using GET
    And get runs of <batsman> for <innings> in JSON response
    Then verify JSON response as per "<criteria>"

    Examples: 
      | mid     | innings | batsman | criteria        |
      |   91641 |       1 |       1 | all_valid       |
      | 0000000 |       2 |       1 | matchid_invalid |
      |   91641 |       5 |       1 | innings_invalid |
      |   91641 |       1 |      15 | batsman_invalid |

  @apitest
  Scenario: Scorecard with valid and invalid data for happy path test and fuzzy test
    Given test API by getting data from txt file

  @apitest
  Scenario: Scorecard with valid and invalid data for happy path test and fuzzy test
    Given test API by getting data from excel file
