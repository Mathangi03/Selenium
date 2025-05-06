Feature: Create Account name and verify in Salesforce APplication 

Scenario: Create Account name in Salesforce

Given Launch the browser 
And  Load the Url
And  Enter the username as 'vidyar@testleaf.com' 
And  Enter the password as 'Sales@123' 
When click on the Login button 
Then It should navigate to the next page 
And Click on toggle button 
And Click View All and then Click Sales from App launcher 
And Click on Accounts tab 
And Click on New button 
And Enter your name as Account name
And Select Ownership as Public 
When click on save 
Then Verify Account name 


