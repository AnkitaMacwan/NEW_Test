Feature: Spec site Registration

  Scenario Outline: Successful Registration

    Given User is on ATS Home Page
    And User is going to Registration Page
    When User enters firstname '<firstname>' and lastname '<lastname>'
    And User enters username '<username>'
    And User enters phonenumber '<phonenumber>'
    And User enters emailaddress '<emailaddreess>'
    And User enters companyname '<companyname>'
    And User enters compnaytype '<companytype>'
    And User enters address '<address>'
    And User enters country '<country>'
    And User enters province '<province>'
    And User enters city '<city>'
    And User enters postalcode '<postalcode>'
    And User enters reference '<reference>'
    And User enables ecommunications
    And User enables terms
    And Click on submit
    Then User receives success message
    And Compare new user with sql database '<user>'
    Examples:
      | firstname | lastname | username         | phonenumber | emailaddreess          | companyname | companytype | address | country | province | city    | postalcode | reference |
      | Ankitaa   | Macwana  | AnkitaJMacrrrrr5 | 6473231385  | ankita+311@atsspec.com | QAATS       | Architect   | Test    | Canada  | Ontario  | Toronto | M9V3G2     | Other     |