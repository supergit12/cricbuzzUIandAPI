Feature: Scorecard

  @smoketest @uitest
  Scenario: scorecard page title test
    Given open "chrome" browser
    When launch site
    Then title should be contain "Live Cricket Score"
    When close site

  @smoketest @apitest
  Scenario: scorecord resource availability test
    Given define http request for "91735" matchid
    When send http request using GET
    Then http response should be 200
    
