#*User should be able to see Fiscal Position Configuration page and taxes information
	#
	#*User should be able to click and see details
	#
	#*User should be Click Create Button able to enter all information
	#
	#*User should able to see all information after save
	#
	#*User should be able to Delete information and verify it's gone
@Regression
Feature:  As a user or manager should be able to Create and Delete a Fiscal Position


		Background:
		Given Manager on Invoicing Page
		And user clicks on Configuration=>Accounting Link from left menu
		Then user clicks on Fiscal Position Link grom left menu

	@BRIT-4060 @emrah
		Scenario Outline: Create a new Fiscal Position
		Then user clicks on Create button
		And user see Fiscal Position -"New" creation page
		Then user fills out required information "<FiscalName>"
		Then user clicks on save button
		And user should see and verifies details that entered "<FiscalName>"
		
		Examples: 
		|FiscalName             |
		|SampleFiscalPosition1  |
		|SampleFiscalPosition2  |

	@BRIT-4060 @emrah
		Scenario Outline: Delete a Fiscal Position
		And user open a tax that has "<FiscalName>"
		Then user clicks on Action button
		And user clicks Delete option
		And user should see "Are you sure you want to delete this record ?" message
		Then user clicks to Ok button
		And user doesn't see deleted Fiscal Position on main page "<FiscalName>"
		
		Examples: 
		|FiscalName             |
		|SampleFiscalPosition1  |
		|SampleFiscalPosition2  |