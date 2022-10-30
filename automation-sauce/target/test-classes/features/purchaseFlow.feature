@PurchaseFlow

Feature: Purchase Flow
  As user want to purchase item

Scenario: User will short item by Name (Z to A)
  Given User open the web page
  When User input "standard_user" as userName and "secret_sauce" as password
  Then User sort product list by "Name (Z to A)"
  Then User click add to chart on the chosen item
  Then User click the shopping cart
  And User click remove button on the chosen item
  Then User click checkout button
  Then User input "imi" as firstName and "imi" as lastName and "9099" as postalCode
  And User click continue button
  Then User should get "Item total: $89.96" as expected item total
  And User should get "Tax: $7.20" as expected tax
  And User should get "Total: $97.16" as expected total
  Then User click finish button
  And User should get "THANK YOU FOR YOUR ORDER" as expected succes order
  And User click back home button


