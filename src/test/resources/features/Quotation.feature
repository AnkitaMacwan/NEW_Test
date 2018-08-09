Feature: QuotationStatusChange

 Scenario: Change the quote status from inprogress to quoted

    Given Login to users account
    When User navigate to quotation list page
    And click on quote ids
    Then Change quote status from inprogress to quoted


