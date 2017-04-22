$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('sampleTestCases\openUI5App.feature');
formatter.feature({
  "line": 1,
  "name": "OpenUI5App",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "openui5app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully opening Website and fills out details",
  "description": "",
  "id": "openui5app;successfully-opening-website-and-fills-out-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "fills out Contact Name",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "ticks UOR check",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enters company as \"Alfreds Futterkiste\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enters Reigion as \"Westboro\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clicks on Navigation One",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "checks to see if on Navigation One page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri('sampleTestCases\validation.feature');
formatter.feature({
  "line": 1,
  "name": "Validation",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checking validation of Reference Number",
  "description": "",
  "id": "validation;checking-validation-of-reference-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigates to SAP site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "fills out Reference Number",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#But It should only be numeric"
    }
  ],
  "line": 9,
  "name": "Checking validation of Contact Name",
  "description": "",
  "id": "validation;checking-validation-of-contact-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "fills out Contact Names",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#But It should only allow spaces"
    }
  ],
  "line": 13,
  "name": "Checking validation of Description",
  "description": "",
  "id": "validation;checking-validation-of-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "fills out the Description",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});