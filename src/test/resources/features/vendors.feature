@wip
Feature: Verifying Vendors functionality from user perspective


  Background:
    Given User on login page
    Then User clicks on Master Data button
    And User clicks on Vendors button


  Scenario: Verifying Vendors functionality
    Then User should see the Vendors

  @BRIT-4260
  Scenario Outline: Creating new Vendor
    Then User clicks on the Create button
    And User selects Company radio button
    And User enters the company name "<company_name>"
    And User enters the city "<city>"
    When User clicks on the Save button
    Then user should see the company name "<company_name>"

    Examples:
      | company_name | city    |
      | TreeStar     | Hersey  |
      | TKT          | Fairfax |


  Scenario: Verifying number of Vendors
    Then User should see the all vendors


  Scenario: Verifying Camptocamp functionality
    When User clicks on Camptocamp
    Then User should see tables
    And User should see tabs
    And User should see tags


  Scenario: Creating a meeting under Erkins Vendor
    And User clicks on Erkins button
    And User clicks on Meeting button
    And User clicks on List button
    And User clicks on Meeting create button
    Then User enters Meeting Subject, Start Date
    And User selects a day
    When User clicks on the savebutton
    Then User should see the Meeting Subject

		
		
		
		
		
		
		
		
		
		
		
		
		
		