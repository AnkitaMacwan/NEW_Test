Feature: Spec Creation

  Scenario Outline:Create a Project Type spec

    Given User go to ATS Home Page
    And enter the username '<username>' and '<password>'
    And hit on login button
    And go to spec site
    When user clicks on Create New Project
    And insert the internal No '<internalnumber>'
    And insert the spec name '<specname>'
    And insert the building class '<buildingclass>'
    And insert the building type '<buildingtype>'
    And insert the State '<state>'
    And insert the City '<city>'
    And insert the Address '<address>'
    And insert the square footage '<square footage>'
    And insert your name '<yourname>'
    And click on Create
    And add a room '<room>'
    And add a product category '<productcategory>'
    And add product Type '<producttype>'
    And add product '<product>'
    And save the drawing
    Then verify the created spec

    Examples:
      | username           | password  | internalnumber | specname | buildingclass | buildingtype       | state   | city    | address | square footage | yourname     | room    | productcategory   | producttype | product |
      | brandon@atsspec.co | Ats123456 | 789654         | spec17   | Commercial    | Bar and Restaurant | Ontario | Toronto | Test    | 5000           | Aimée Holmes | General | Plumbing Fixtures | 8081        | 74631   |





