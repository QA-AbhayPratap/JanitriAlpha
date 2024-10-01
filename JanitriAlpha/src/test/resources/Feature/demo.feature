#Author
#Date
#Description

Feature: Feature to test the login funcanility

Scenario: Check login page with valid credential. 

Given User is on login page


When  User  enter valid username and password
And   click on signin button
Then  User is navigate to the home page


