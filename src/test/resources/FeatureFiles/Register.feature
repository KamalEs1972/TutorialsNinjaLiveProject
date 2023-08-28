Feature: Registeration Functionality Scenarios


@Register @One
Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran2@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
    
    @Register @Two
    Scenario: Verify whether the user is not allowed to register skipping mandotery fields into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on Continue button
    Then I should see that the User Account has not created
    And I should see the errors message informing the user to fill the mandotery fields 
    
     @Register @Three
    Scenario: Verify whether the user is able to register into the application by opting Newsletter Subscrition
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran2@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
   And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
   
   @Register @Four
    Scenario: Verify whether the user is able restricted creating a duplicate account
        Given I launch the application
        And I navigate to Account Registration page
        When I provide the below duplicate valid details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran1@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
       And I select the Privacy Policy
       And I click on Continue button
       Then I should see that the User is restricted from  creating a duplicate account
   