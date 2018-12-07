Feature: Spec creation on new spec tool

  Scenario Outline:Create a Project Type spec

    Given user go to new spec tool site
    And enter the login credential '<username>' and '<password>'
    And click on create new project
    And insert '<Internal Number>'
    And insert '<Project Name>'
    And insert '<Country>'
    And insert '<State>'
    And insert '<City>'
    And insert '<Address>'
    And insert '<Biddate>'
    And insert '<Area>'
    And click on Next
    And select any building class '<buildingclass>'
    And select any building type '<buildingtype>'
    And clcik on nextbutton
    And click on finish
    And select plumbing fixtures
    And select sink
    And search a sink '<sink>'
    And select a sink and add to drawing
    And search a faucet '<faucet>'
    And select a faucet and add to drawing
    And search a prap '<prap>'
    And select a ptrap and add to drawing
    And search a supply '<supply>'
    And select a supply and add to drawing
    And click on complete
    Examples:
      | username           | password | Internal Number | Project Name | Country | State   | City    | Address | Biddate    | Area | buildingclass | buildingtype | sink | faucet | prap | supply |
      | herrick@atsspec.co | ZAQ12wsx | 789654          | ATS Test     | Canada  | Ontario | Toronto | Test    | 2018-09-30 | 5000 | Commercial    | Mall         | sink | faucet | prap | supply |


