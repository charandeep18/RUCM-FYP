Feature: OpenUI5App
This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.
Scenario: Successfully opening Website and fills out details
Given user navigates to Website
Then fills out Contact Name
And ticks UOR check
Then enters company as "Alfreds Futterkiste"
And enters Reigion as "Westboro"
Then clicks on Navigation One
Then checks to see if on Navigation One page


