$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/APITesting/cucumber-demo/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login with valid credentials of user",
  "description": "",
  "id": "login-feature;login-with-valid-credentials-of-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user to navigate application by url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the application is amazon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button to login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should not login",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_on_navigate_application_by_url()"
});
formatter.result({
  "duration": 15606821000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.title_of_the_application_is_amazon()"
});
formatter.result({
  "duration": 17934300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_on_login_page()"
});
formatter.result({
  "duration": 1895485800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1085663900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_clicks_on_login_button_to_login()"
});
formatter.result({
  "duration": 1687032000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_not_login()"
});
formatter.result({
  "duration": 68960000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.close_the_browser()"
});
formatter.result({
  "duration": 2100156700,
  "status": "passed"
});
});