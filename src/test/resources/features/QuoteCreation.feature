Feature: Quote Creation from PT

  Scenario Outline: Create a Quote

    Given User is on ATS login page
    And Login to his account with username '<username>'
    And password '<password>'
    And click on Login
    And login as user '<user>'
    And login to project tracker '<site>'
    And click on direct login
    When create a quote
    And enter a job name '<jobname>'
    And select a job country '<country>'
    And select a job province '<province>'
    And select a job city '<city>'
    And enter a job address '<address>'
    And select job type '<job type>'
    And select outside sales rep '<outsidesalesrep>'
    And add a customer '<customer>'
    And enter engineer '<engineer>'
    And enter architect '<architect>'
    And enter the section title '<sectiontitle>'
    And enter the product number '<productnumber>'
    And click on the new section '<sectiontitle>'
    And click on alternative button
    And click on duplicate section
    And click on showhide section
    And click on delete
    And Add section comment '<sectioncomment>'
    And insert the special terms '<specialterms>'
    Then click on save

    Examples:
      | username           | password | user  | site                | jobname | country | province | city    | address | job type                        | outsidesalesrep | customer                     | engineer     | architect      | sectiontitle | productnumber                                  | specialterms | sectioncomment |
      | herrick@atsspec.co | ZAQ12wsx | 20468 | ATS Project Tracker | AM test | Canada  | Ontario  | Toronto | test    | Commercial - Bar and Restaurant | Avery White     | Brookfield Global Integrated | John A Wells | David Johnston | test         | Trespa® Athlon Unicolor Color To Be Determined | Test         | Test           |
