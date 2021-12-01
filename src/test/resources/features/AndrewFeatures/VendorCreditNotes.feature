
	@BRIT-4245 @Regression
	Feature: User should be able to manage functionality of Vendor Credit Notes

		    Background:
		    	Given Manager on Invoicing Page
		    	Then user opens dropdown Documents in Purchases
			    And user clicks on Vendor Credit Notes

			@andrew
			Scenario: Verify that import button is clickable
			    Then verify that import button is clickable

			@andrew
			Scenario: Verify that user can not delete Vendor Credit Note if it's not draft or canceled
			    Then click on first checkbox
			    Then click on dropdown Action
			    And click on delete
			    Then click on ok
			    And Verify that system displays "You cannot delete an invoice which is not draft or cancelled. You should create a credit note instead."

			@andrew
			Scenario: Verify the title of Vendor Credit Notes
			    Then verify that title is "Vendor Credit Notes - Odoo"
			
		
			
			