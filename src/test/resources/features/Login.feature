Feature: Login

  Scenario: Successful login with valid Credential

    Given User is on Home Page
    When User enters 'brandon@atsspec.co' and 'B4ck00fU'
    Then Message displayed Login Successfully

