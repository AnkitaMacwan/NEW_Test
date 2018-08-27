Feature: Full workflow

  Scenario Outline: Project creation

    Given User is on ATS login page
    And Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    When Create a Project
    And Enter the project name '<projectname>'
    And Enter the LeadSourceType '<LeadsourceType>'
    And Enter the LeadSourceNumber '<LeadsourceNumber>'
    And Enter the Date of Bid '<dateofbid>'
    And Enter the Address '<address>'
    And Enter the Country '<country>'
    And Enter the Province '<province>'
    And Enter the City '<city>'
    And Enter the BuildingClass '<buildingclassandtype>'
    And Enter the BuildingType '<buildingtype>'
    And Enter the SquareFootage '<squareFootage>'
    And Enter the ProjectValuation '<projectValuation>'
    And Enter the ProjectPhase '<projectPhase>'
    And Click on Submit button
    Then See the Project detail page
    Examples:
      | username           | password | projectname  | LeadsourceType | LeadsourceNumber | dateofbid  | address | country | province | city    | buildingclassandtype | buildingtype       | squareFootage | projectValuation | projectPhase |

      | brandon@atsspec.co | B4ck00fU | Test Project | Dodge          | 123456789        | 2018-08-30 | Test    | Canada  | Ontario  | Toronto | Commercial           | Bar and Restaurant | 5000          | 50000            | Pre-design   |


