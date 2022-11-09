$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mypc/eclipse-workspaces/FinalFb/src/test/resources/FeatureFiles/FinalFb.feature");
formatter.feature({
  "name": "login authentication validation of Facebook appication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login with Valid Username and invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch Facebook application",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter valid  \"\u003cUserName\u003e\" and invalid \"\u003cPassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "thiyaga",
        "thiyaga@123"
      ]
    },
    {
      "cells": [
        "ravi",
        "ravi@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login with Valid Username and invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch Facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.launch_Facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid  \"thiyaga\" and invalid \"thiyaga@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.enter_valid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "login with Valid Username and invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch Facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.launch_Facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid  \"ravi\" and invalid \"ravi@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.enter_valid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});