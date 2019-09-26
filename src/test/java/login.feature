Feature: Login into application
Scenario Outline: Positive test validating login
Given Initilize the browser with chrome
And Navigate to "https://qaclickacademy.com" Site
And Click on Login link in home page to land on Secure sing in page
When User enters <username> and <password> and logs in 
Then Verify that user is succesfully logged in

Examples:
|username			|password	|
|test99@gmai.com	|abcd		|
|Test123@gmail.com	|1234		|              
    


