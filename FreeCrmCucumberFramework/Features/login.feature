Feature: Free CRM Login Feature

# ------ DATA DRIVEN APPROACH WITHOUT EXAMPLE --------------------
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on login page
#When title of login page is Free CRM
#Then user enters "ranjith.sit.cs@gmail.com" and "R@njith076"
#Then user clicks login button 
#And user is on home page
#Then close the browser

# ------ DATA DRIVEN APPROACH WITH EXAMPLE --------------------
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<uname>" and "<password>"
Then user clicks login button 
And user is on home page
Then Click on contacts
Then Add new contacts "<fname>" and "<lname>" and "<email>"
Then close the browser

Examples:
	| uname | password | fname | lname | email |
	| ranjith.sit.cs@gmail.com | R@njith076 | Aastha | Grover | Aastha@gmail.com |
	| ranjith.sit.cs@gmail.com | R@njith076 | Daljet | Kaur   | Daljeet@gmail.com |
