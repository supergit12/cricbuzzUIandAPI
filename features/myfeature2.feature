@realtest
Feature: Scorecard

  @uitest
  Scenario Outline: scorecard page title test
    Given open "<bn>" browser
    When launch site
    Then title should be contain "Live Cricket Score"
    When close site

    Examples: 
      | bn      |
      | chrome  |
      | firefox |
      | edge    |

  @apitest
  Scenario Outline: scorecord resource availability test
    Given define http request for "<mid>" matchid
    When send http request using GET
    Then http response should be 200

    Examples: 
      | mid   |
      | 91735 |
      | 92217 |
      | 91077 |
