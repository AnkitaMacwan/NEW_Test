Feature: Account creation from PT

  Scenario Outline: Create an Account from Project Tracker

    Given User is on ATS login page
    And Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    When create a firm
    And enter the companyname '<Company Name>'
    And enter the companytype '<AccountType>'
    And enter the address '<Address>'
    And  enter the country1 '<Country>'
    And enter the province1 '<Province>'
    And enter the city1 '<City>'
    And enter the zipcode '<zipcode>'
    And enter the email '<email>'
    And enter the officephone '<officephone>'
    And enter the fax '<fax>'
    And save the firm
    And enter the firstname '<FirstName>'
    And enter the lastname '<LastName>'
    And enter the jobtitle '<JobTitle>'
    And enter the emailuser '<emailuser>'
    And enter the directline '<Directline>'
    And enter the extension '<ext>'
    And enter the mobile '<mobile>'
    And select the ecommunications
    And enter a note '<note>'
    And enter username1 '<username1>'
    And enter password1 '<password1>'
    Then save the user

    Examples:
      | username           | password | Company Name | AccountType | Address   | Country | Province | City    | zipcode | email                | officephone | fax    | FirstName  | LastName | JobTitle  | emailuser         | Directline | ext | mobile     | note | username1   | password1 |
      | herrick@atsspec.co | ZAQ12wsx | Test firm    | Architect   | ATS123456 | Canada  | Ontario  | Toronto | M9v3g2  | ankita+11@atssec.com | 6473231385  | 123654 | AnkitaTest | Macwan   | Architect | ankita+211@ats.co | 789654123  | 222 | 6472321385 | note | aamacwan444 | Ats123456 |