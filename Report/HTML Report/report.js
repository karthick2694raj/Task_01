$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Register.feature");
formatter.feature({
  "name": "To validate  priyoshop functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "To validate Register Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To Check priyoshop through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toCheckPriyoshopThroughChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass Firstname and Email and Phoneno",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassFirstnameAndEmailAndPhoneno()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d100.0.4896.127)\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027KARTHICKRAJ\u0027, ip: \u0027192.168.0.111\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [be5bb9c3c311e5b2a328d8f3ef6801d0, clickElement {id\u003de73f51f6-ba84-471d-9561-58ec2c301fad}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\rajka\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54980}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:54980/devtoo..., se:cdpVersion: 100.0.4896.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (be5bb9c3c311e5b2a328d8f3ef6801d0)] -\u003e xpath: //a[@href\u003d\u0027/register\u0027]]\nSession ID: be5bb9c3c311e5b2a328d8f3ef6801d0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat org.base.HelperClass.btnclck(HelperClass.java:58)\r\n\tat org.demo.StepDefinition.toPassFirstnameAndEmailAndPhoneno(StepDefinition.java:60)\r\n\tat ✽.To pass Firstname and Email and Phoneno(file:Register.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass password and confirmpassword",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toPassPasswordAndConfirmpassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass country and address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toPassCountryAndAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click accept radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickAcceptRadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});