@Regression
Feature: When user(s) worked on any transaction, system doesn't allow to user can be delete related functions

   @BRIT-4072 @todoo
   Scenario: When user(s) worked on any transaction, system doesn't allow to user can be delete related functions
     Given Manager on Invoicing Page
     And user clicks on Configuration=>Accounting Link from left menu
     Then user clicks on Bank Account Link from left menu
     Then user clicks and open a Bank Account
     Then user try to delete this Bank Account
     And User should see on screen "Odoo Server Error" message