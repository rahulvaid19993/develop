Feature: Application login

Scenario: home page defualt login

Given User is on landing page "https://rahulshettyacademy.com/#/practice-project"
When user login into application with username and password
Then Home page is displayed
And cards are disaplayed