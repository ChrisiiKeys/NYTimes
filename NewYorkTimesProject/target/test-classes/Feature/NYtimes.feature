Feature: NewyorkTimes Automation

Scenario: The user is logging in into the page

Given The user navigates to the Login page
When The user enter the email id and password
Then The user is clicking the Login button
And The user is redirected to the homepage

Scenario: The user is navigating to the elections page 

Given The user navigates to the Login page
When The user enter the US
Then The user is clicking the Elections
And The article regarding the Elections should be shown

Scenario: The user is navigating to the world page 

Given The user navigates to the world page
Then The user is clicking the Canada
And The article regarding the Canada should be displayed

Scenario: The user is Searching a context

Given The user navigates to the Login page
When The user enter the Climate 
Then The user is clicking the Search button
And The search result should be relevant to th climate


