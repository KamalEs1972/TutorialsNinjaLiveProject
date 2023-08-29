Feature: Login functinality scenarios

	@Login @One
	Scenario: Verify whether the User is able to login with valid credentials
	  Given I launch the application
	  And I navigate to Account Login page
	  When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
      Then I should see that the User is able to successfully login
      
      @Login @Two
	Scenario: Verify whether the User is able to login with invalid credentials
	  Given I launch the application
	  And I navigate to Account Login page
	  When I login to the application using Username "ravi.kiran12@gmail.com" and Password "rkiran99"
      Then I should see that the User is unable to successfully login
      
      @Login @Three
	Scenario: Verify whether the User is unable to login without providing credentials
	  Given I launch the application
	  And I navigate to Account Login page
	  When I click on LoginButton
      Then I should see that the User is unable to successfully login
      
       @Login @Four
	Scenario: Verify whether the User is able to reset Forgotten Password
	  Given I launch the application
	  And I navigate to Account Login page
	  When I reset Forgotten Password for email  "ravi.kiran1@gmail.com"
	  Then I should see a message that user getting an email to reset password