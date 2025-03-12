Feature:
Scenario: To check the title of the application
Given User openes the browser
And navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" webpage
Then user verifying the title of that webpage
And user close the browser

Scenario Outline: To check the login functionality
Given User openes the browser
And navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" webpage
When user enters '<username>' username 
And user enteres '<password>' password 
And user clicks on login button
Then user verifies the username
And user close the browser
Examples:
|username|password|
|Admin|admin123|
|Admin|admin123|