#Author: Abhay Pratap Singh, pratap5126701@gmail.com
#Keywords Summary : Test and validate all mobileelement are present in  login screen

Feature: Test and validate that all login elements are present on the login screen.
  

  @tag1
  Scenario: login elements are present on the login screen
    Given User is on login screen
    And Validating the application name
    And Sing in text is displaying
    And Sing Up button is displaying
    When Application tag line is display and its spelling
    And User ID text is display
    And Password text is display
    And Eye button is display
    And Signin button is display
    And Bottom bar line is  display
    Then Hyper link is display on footer

    

  
