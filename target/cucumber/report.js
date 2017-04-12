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
formatter.match({
  "location": "validation.user_navigates_to_SAP_site()"
});
formatter.result({
  "duration": 5018411442,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to decode response from marionette\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{rotatable\u003dfalse, raisesAccessibilityExceptions\u003dfalse, marionette\u003dtrue, firefoxOptions\u003d{args\u003d[], prefs\u003d{}}, appBuildId\u003d20170125094131, version\u003d, platform\u003dXP, proxy\u003d{}, command_id\u003d1, specificationLevel\u003d0, acceptSslCerts\u003dfalse, processId\u003d5916, browserVersion\u003d51.0.1, platformVersion\u003d10.0, XULappId\u003d{ec8030f7-c20a-464f-9b0e-13a3a9e97384}, browserName\u003dfirefox, takesScreenshot\u003dtrue, takesElementScreenshot\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 9d9d72c7-bdbe-42dd-b573-a3775b28166f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:902)\r\n\tat sampleTestCases.validation.user_navigates_to_SAP_site(validation.java:20)\r\n\tat ✽.Given user navigates to SAP site(sampleTestCases\\validation.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "validation.fills_out_Reference_Number()"
});
formatter.result({
  "status": "skipped"
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
formatter.match({
  "location": "validation.fills_out_Contact_Names()"
});
formatter.result({
  "duration": 2156640,
  "error_message": "java.lang.NullPointerException\r\n\tat sampleTestCases.validation.fills_out_Contact_Names(validation.java:38)\r\n\tat ✽.Then fills out Contact Names(sampleTestCases\\validation.feature:10)\r\n",
  "status": "failed"
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
formatter.match({
  "location": "validation.fills_out_the_Description()"
});
formatter.result({
  "duration": 131160,
  "error_message": "java.lang.NullPointerException\r\n\tat sampleTestCases.validation.fills_out_the_Description(validation.java:49)\r\n\tat ✽.Then fills out the Description(sampleTestCases\\validation.feature:14)\r\n",
  "status": "failed"
});
});