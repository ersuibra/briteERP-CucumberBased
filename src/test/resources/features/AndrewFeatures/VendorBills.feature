
	@BRIT-4217 @Regression
	Feature: User should be able to manage functionality of Vendor Bills
		
		    Background:
		        Given Manager on Invoicing Page
		        Then user opens dropdown Documents in Purchases
		        And user clicks on Vendor Bills

		    @andrew
		    Scenario: Verify title of Vendor Bills page
		        Then title should be "Vendor Bills - Odoo"

		    @andrew
		    Scenario: Verify Vendor's names
		        And verify that names on Vendor Bills page and Receipt Page match

		    @andrew
		    Scenario: Verify that checkbox is not selected by default
				Then verify that first checkbox is not selected by default
		    
		    
		    
		    