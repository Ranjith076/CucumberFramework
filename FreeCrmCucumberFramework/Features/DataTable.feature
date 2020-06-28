Feature: Free CRM Login Feature

# ------ DATA DRIVEN APPROACH USING DATA TABLE --------------------
# No Scenario Outline is required
# Examples keyword is not required
# Data is provided by pipe below to the corresponding step

Scenario: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters username and password
| ranjith.sit.cs@gmail.com | R@njith076 | 
Then user clicks login button 
And user is on home page
Then Click on contacts
Then Add new contacts details
| Vismaya | M | Vismaya@gmail.com |
Then close the browser


