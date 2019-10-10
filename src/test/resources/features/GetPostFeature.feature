Feature: Services Testing

  Scenario Outline: Auth service status check

    When Get the status of auth service '<url>' and '<endpoint>' and '<statuscode>'
    Examples:
      | url                                    | endpoint | statuscode |
      | http://staging.atsspec.local/auth2/v2/ | status   | 200        |

  Scenario Outline: Login to users account and get token

    When login to users account '<url>' and '<username>' and '<password>' and '<endpoint>'

    Examples:
      | url                                    | username         | password  | endpoint |
      | http://staging.atsspec.local/auth2/v2/ | peter@atsspec.co | Ats123456 | login    |

  Scenario Outline: Spec service status check
    When Get the status of spec service '<url>' and '<endpoint>' and '<X-ATS-APP-ID>' and '<statuscode>'
    Examples:
      | url                                    | endpoint | X-ATS-APP-ID    | statuscode |
      | http://staging.atsspec.local/spec2/v2/ | status   | 42b28d28eb9ad6a | 200        |

  Scenario Outline: Create a spec

    When Insert the specname '<url>' and '<endpoint>' and '<X-ATS-APP-ID>' and '<specname>' and '<statuscode>'
    Examples:
      | url                                    | endpoint | X-ATS-APP-ID    | statuscode | specname |
      | http://staging.atsspec.local/spec2/v2/ | spec     | 42b28d28eb9ad6a | 201        | Shradha  |


  Scenario Outline: View the created spec

    When Insert the '<url>' and endpoint '<endpoint>' and '<X-ATS-APP-ID>' and '<Content-Type>' search by specname '<specname1>'

    Examples:
      | url                                    | endpoint | X-ATS-APP-ID    | Content-Type | specname1 |
      | http://staging.atsspec.local/spec2/v2/ | specs    | 42b28d28eb9ad6a | application  | AMTest    |


