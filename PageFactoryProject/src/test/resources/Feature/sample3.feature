Feature:
Scenario: To check the login functionality
Given User openes the browser
And navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" webpage
When user enters the Login credentials
|Testdata123.xlsx| 
And user clicks on login button
Then user verifies the username
And user close the browser