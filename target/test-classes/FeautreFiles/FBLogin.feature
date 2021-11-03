Feature: To validate Facebook login Functionality of Facebook



Scenario Outline: To validate login functionality of facebook with invalid credentials


Given launch the chromer browser
When The user should type the url
And The User should maximize
And The user should type Invalid username "<user>"and Invalid password "<pass>"
And The user should click login button 
Then The user should navigate to Invalid credential page

Examples:
|user|pass|
|karthik|kar@123|
|karthik|sofi@123|