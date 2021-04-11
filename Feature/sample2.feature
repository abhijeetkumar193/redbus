Feature: Ratos application

@Regression
Scenario Outline:: TC_001 login to the applications
Given open the url
Then Enter <username>  and <password>
Then Click on submit

Examples:
|username|password|
|abhijeet.kumar+180@codenatives.com|Abhijeet@1234|


@smoke
Scenario Outline:: TC_002 Create new jobs
Given open the url
Then Enter <username>  and <password>
Then Click on submit
Then Click on jobs in menu bar
Then click on create job button


Examples:
|username|password|
|abhijeet.kumar+180@codenatives.com|Abhijeet@1234|

