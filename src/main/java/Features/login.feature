Feature: Login feature
Scenario: Login with invalid credentials of user

Given user to navigate application by url
When title of the application is amazon
Then user on login page
Then user enters username and password
Then user clicks on login button to login
Then user should not login
Then close the browser