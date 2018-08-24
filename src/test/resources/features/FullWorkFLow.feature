Feature: Full workflow

  Scenario Outline: Project creation, Spec creation and Quote Creation

    Given User is on Project Tracker board
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
      | projectname  | LeadsourceType | LeadsourceNumber | dateofbid  | address | country | province | city    | buildingclassandtype | buildingtype       | squareFootage | projectValuation | projectPhase |

      | Test Project | Dodge          | 123456789        | 30-08-2018 | Test    | Canada  | Ontario  | Toronto | Commercial           | Bar and Restaurant | 5000          | 50000            | Pre-design   |


