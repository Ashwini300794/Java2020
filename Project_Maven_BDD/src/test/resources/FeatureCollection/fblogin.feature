@SmokeTest
Feature: Login Feature
         Verify Login feature of Mercuty Tour application
         
Background: User access Login screen of Mercury Tours apllication   
            When user opens "chrome" browser
            And user enters application url "http://www.newtours.demoaut.com/"
            And user waits "15" seconds to load login page
            Then user maximize chrome browser
            Then user is on login screen of Mercury Tours application
         
@SmokeTest
Scenario: Vrify that valid user able to login into Mercury Tours application by using valid username and password
          Given user access login screen of Mercury Tours application
          When user enters "cjc1" as username
          And user enters "pass1" password
          And user clicks on Signin button
          When user clicks on SignOff link
          Then user is on Signon screen
                   