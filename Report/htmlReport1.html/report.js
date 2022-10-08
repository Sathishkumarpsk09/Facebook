$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Facebook.feature");
formatter.feature({
  "name": "FaceBook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user launch the facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitionFB.user_launch_the_facebook_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets text information",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitionFB.user_gets_text_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter UserNAme",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionFB.user_Enter_UserNAme()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionFB.user_Enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionFB.user_Click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Returns To Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitionFB.user_Returns_To_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "New Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user Create Account",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitionFB.user_Create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user TakesScreenshot",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitionFB.user_TakesScreenshot()"
});
formatter.result({
  "status": "passed"
});
});