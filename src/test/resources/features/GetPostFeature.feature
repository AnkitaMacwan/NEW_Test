Feature: Login service

  Scenario Outline: The user makes a successful login request

    When Get the status of auth service '<url>' and '<endpoint>' and '<statuscode>'
    And login to users account '<username>' and '<passord>'



    Examples:
      | url                                    | endpoint | statuscode | username         | passord   |
      | http://staging.atsspec.local/auth2/v2/ | status   | 200        | peter@atsspec.co | Ats123456 |