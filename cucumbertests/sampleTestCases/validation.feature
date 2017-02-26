Feature: Validation
This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.

Scenario: Checking validation of Reference Number
Given user navigates to SAP site
Then fills out Reference Number
#But It should only be numeric

Scenario: Checking validation of Contact Name
Then fills out Contact Names
#But It should only allow spaces

Scenario: Checking validation of Description
Then fills out the Description
#But It should only allow alphabets, numeric and spaces
