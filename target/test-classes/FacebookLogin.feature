Feature: Validation Of Facebook
Scenario Outline: Validation of Facebook with Correct username and correct password
Given  User must launch the Facebook url
When  User enters the correct username "<username>"and correct password "<password>"
And User clicks on the login button
Then  User validates url is navigated to Home Page
Examples:
|username|password|
|ramssss|12344|
|Ravikumar|87654|
|Suresh|543213|
|Muthu|56788|