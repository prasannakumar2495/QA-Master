$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeaturesMaven/MyapplicationMaven.feature");
formatter.feature({
  "name": "test the web application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the  chrome browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter the valid credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to login sucessfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "prasannakumar2461995",
        "018Apple"
      ]
    },
    {
      "cells": [
        "prasannakumar2461995",
        "008Apple"
      ]
    },
    {
      "cells": [
        "prasannakumar2461995",
        "028Apple"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the  chrome browser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepMaven.open_the_chrome_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valid credentials \"prasannakumar2461995\" and \"018Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStepMaven.enter_the_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepMaven.user_should_be_able_to_login_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the  chrome browser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepMaven.open_the_chrome_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valid credentials \"prasannakumar2461995\" and \"008Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStepMaven.enter_the_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepMaven.user_should_be_able_to_login_sucessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test the login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the  chrome browser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepMaven.open_the_chrome_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valid credentials \"prasannakumar2461995\" and \"028Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStepMaven.enter_the_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepMaven.user_should_be_able_to_login_sucessfully()"
});
formatter.result({
  "status": "passed"
});
});