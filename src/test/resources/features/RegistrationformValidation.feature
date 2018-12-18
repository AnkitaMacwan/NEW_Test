Feature: Registration form validation

  Scenario Outline: Checking required error message on firstname when no data has been inserted

    Given User is on ATS Home Page
    And User is going to Registration Page
    When User enters firstname '<firstname>' and lastname '<lastname>'
    Then Validate the required error message






