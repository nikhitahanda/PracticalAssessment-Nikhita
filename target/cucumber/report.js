$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('CucumberTest\Amazonbook.feature');
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Amazon book details search",
  "description": "I want to use this template for my feature file",
  "id": "amazon-book-details-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 25,
  "name": "User should be able to login with the correct username and correct password",
  "description": "",
  "id": "amazon-book-details-search;user-should-be-able-to-login-with-the-correct-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User is on amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User searches for appium book to select 10th book",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User prints details to add it to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepImplementation.openBrowser()"
});
formatter.result({
  "duration": 9604342300,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.searchbook()"
});
formatter.result({
  "duration": 7878224800,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.loginButton()"
});
formatter.result({
  "duration": 12786575900,
  "status": "passed"
});
});