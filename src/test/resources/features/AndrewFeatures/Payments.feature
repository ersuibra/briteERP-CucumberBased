
	@BRIT-4246 @Regression
	Feature: User should be able to manage functionality of Payments
		
		    Background:
		    	Given Manager on Invoicing Page
		    	Then user opens dropdown Documents in Purchases
			    And user clicks on Payments

			@andrew
			Scenario: create button should be clickable
			    Then verify that Create button is clickable

			@andrew
			Scenario: user should be able to see same amount in the payments
			    Then verify that amoun on Payments Page and Receipt Page match

			@andrew
			Scenario: Verify title of Payments page
			    Then verify that title is "Verifying that title is Payments - Odoo"

			@andrew
			Scenario: Verify that user can not delete posted payment
			    Then click on first checkbox
			    And click on dropdown Action
			    Then click on delete
			    Then click on ok
			    And Verify that system displays "You can not delete a payment that is already posted"
			    
			    
			    
			
			