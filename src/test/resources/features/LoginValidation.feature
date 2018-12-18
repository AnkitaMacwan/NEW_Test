Feature: Login page validation

  Scenario Outline: Enter the no username and no password

    Given User is on ATS login page
    When Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    Then validate the error message '<errormessage>'
    Examples:
      | username | password | errormessage                   |
      |          |          | Login Failed, please try again |


  Scenario Outline: Enter the invalid username and valid password

    Given User is on ATS login page
    When Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    Then validate the error message '<errormessage>'
    Examples:
      | username               | password | errormessage                   |
      | herricktest@atsspec.co | ZAQ12wsx | Login Failed, please try again |

  Scenario Outline: Enter the valid username and invalid password

    Given User is on ATS login page
    When Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    Then validate the error message '<errormessage>'
    Examples:
      | username           | password | errormessage                   |
      | herrick@atsspec.co | ZaQ12wsx | Login Failed, please try again |



