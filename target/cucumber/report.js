$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('testcases\Login.feature');
formatter.feature({
  "line": 1,
  "name": "Login to website",
  "description": "This feature looks to test login functionality for the website",
  "id": "login-to-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successfully Login to website",
  "description": "",
  "id": "login-to-website;successfully-login-to-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has navigated to the website to login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Finds the link to the login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Clicks on the login link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enters Username details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enters Password details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clicks Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.goToSiteLogin()"
});
formatter.result({
  "duration": 5783814150,
  "status": "passed"
});
formatter.match({
  "location": "Login.findLogin()"
});
formatter.result({
  "duration": 78213198,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 59 milliseconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\chara\\AppData\\Local\\Temp\\scoped_dir2212_22992}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 6da8c10c5a3bbf292e58ddda8455feda\n*** Element info: {Using\u003did, value\u003dlogin}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat testcases.Login.findLogin(Login.java:21)\r\n\tat ✽.And Finds the link to the login page(testcases\\Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.enterUsername()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.enterPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri('testcases\OpenSite.feature');
formatter.feature({
  "line": 1,
  "name": "Openwebpage",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "openwebpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully opening Website.",
  "description": "",
  "id": "openwebpage;successfully-opening-website.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to SAP website",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenSite.goToSiteLogin()"
});
formatter.result({
  "duration": 2314901977,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: unhandled inspector error: {\"code\":-32000,\"message\":\"Cannot navigate to invalid URL\"}\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 50 milliseconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\chara\\AppData\\Local\\Temp\\scoped_dir11516_3623}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c483a773213611cae08d7d767d9fcf6e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:902)\r\n\tat testcases.OpenSite.goToSiteLogin(OpenSite.java:14)\r\n\tat ✽.Given user navigates to SAP website(testcases\\OpenSite.feature:4)\r\n",
  "status": "failed"
});
formatter.uri('testcases\Openwebage.feature');
formatter.feature({
  "line": 1,
  "name": "Openwebpage",
  "description": "This is going to be a test to ensure that the selenium webdriver is able to open up the tests as intended.",
  "id": "openwebpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully opening Website.",
  "description": "",
  "id": "openwebpage;successfully-opening-website.",
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
  "name": "find the link to the webpage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on the link",
  "keyword": "Then "
});
formatter.match({
  "location": "Openwebpage.goToSite()"
});
formatter.result({
  "duration": 2757087018,
  "error_message": "org.openqa.selenium.NoSuchSessionException: no such session\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 7 milliseconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{message\u003dsession not created exception\nfrom disconnected: Unable to receive message from renderer\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64), platform\u003dANY}]\nSession ID: 9645c4ad8a3ba275b5453619d5a8cc6e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:902)\r\n\tat testcases.Openwebpage.goToSite(Openwebpage.java:17)\r\n\tat ✽.Given user navigates to Website(testcases\\Openwebage.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Openwebpage.findSite2()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Openwebpage.clickSite2()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri('testcases\Search.feature');
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "Enter the search information into the search bar field.",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User is able to search items on website",
  "description": "",
  "id": "search;user-is-able-to-search-items-on-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User has navigated to the website to search",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Finds the search bar in the website header",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enters search information",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks Submit",
  "keyword": "And "
});
formatter.match({
  "location": "Search.goToSiteSearch()"
});
formatter.result({
  "duration": 2635513391,
  "status": "passed"
});
formatter.match({
  "location": "Search.findSearch()"
});
formatter.result({
  "duration": 13621344,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 12 milliseconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027LAPTOP-6I4KMST0\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\chara\\AppData\\Local\\Temp\\scoped_dir2944_22773}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: ec4c5d8e00f5b2048f155cfef5b52845\n*** Element info: {Using\u003did, value\u003dtextbar}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat testcases.Search.findSearch(Search.java:21)\r\n\tat ✽.And Finds the search bar in the website header(testcases\\Search.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Search.enterSearchInfo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Search.clickSubmit()"
});
formatter.result({
  "status": "skipped"
});
});