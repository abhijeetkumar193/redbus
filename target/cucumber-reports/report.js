$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample2.feature");
formatter.feature({
  "line": 1,
  "name": "Ratos application",
  "description": "",
  "id": "ratos-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 15,
  "name": ": TC_002 Create new jobs",
  "description": "",
  "id": "ratos-application;:-tc-002-create-new-jobs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter \u003cusername\u003e  and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on jobs in menu bar",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on create job button",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "ratos-application;:-tc-002-create-new-jobs;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "ratos-application;:-tc-002-create-new-jobs;;1"
    },
    {
      "cells": [
        "abhijeet.kumar+180@codenatives.com",
        "Abhijeet@1234"
      ],
      "line": 25,
      "id": "ratos-application;:-tc-002-create-new-jobs;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": ": TC_002 Create new jobs",
  "description": "",
  "id": "ratos-application;:-tc-002-create-new-jobs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "open the url",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter abhijeet.kumar+180@codenatives.com  and Abhijeet@1234",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on jobs in menu bar",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on create job button",
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
});