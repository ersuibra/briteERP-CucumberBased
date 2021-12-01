    #*User should be able to see Tax Configuration page and taxes information
	#
	#*User should be able to click and see details
	#
	#*User should be Click Create Button able to enter all information
	#
	#*User should able to see all information after save
	#
	#*User should be able to click Delete information and verify it's gone
@Regression
Feature: As a user or manager should be able to Create and Delete a Tax


  Background:
    Given Manager on Invoicing Page
    And user clicks on Configuration=>Accounting Link from left menu
    Then user clicks on Taxes Link grom left menu

  @BRIT-4059 @emrah
  Scenario Outline: Create a new Tax
    Then user clicks on Create button
    And user see Taxes -"New" creation page
    Then user fills out required information "<TaxName>", "<TaxAmount>"
    Then user clicks on save button
    And user should see and verifies details that entered "<TaxName>"

    Examples:
      | TaxName    | TaxAmount |
      | SimpleTax1 | 15        |
      | SimpleTax2 | 20        |

  @BRIT-4059 @emrah
  Scenario Outline: Delete a Tax
    And user open a tax that has "<TaxName>"
    Then user clicks on Action button
    And user clicks Delete option
    And user should see "Are you sure you want to delete this record ?" message
    Then user clicks to Ok button
    And user doesn't see deleted tax on main page "<TaxName>"

    Examples:
      | TaxName    |
      | SimpleTax1 |
      | SimpleTax2 |