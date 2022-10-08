Feature: FaceBook 
@smoke
Scenario: user Login
Given user launch the facebook website
When user gets text information
And user Enter UserNAme
And user Enter Password
And user Click Login
Then user Returns To Login Page 

@regression
Scenario:  New Account
When user Create Account
And user TakesScreenshot 