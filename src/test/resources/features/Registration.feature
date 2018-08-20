Feature: Spec site Registration

  Scenario: Successful Registration

    Given User is on Home Page
    And User go to Registration Page
    When user enters all the valid fields
    And click on submit button
    Then user receives success message