@github 
   Scenario Outline: Sucessfull login with valid credentials
      Given the user launches the sauceDemo website
      And the user enters the "<username>"
      And the user enters the password as "<password>"
      And user click on the sign button
      And the user click on the red shirt
      And the user click on the cartbutton
      And the user click on the checkoutbutton
      And the user enters the firstname "<firstname>"
      And the user enters the secondname "<secondname>"
      And the user enters the zipcode "<postalcode>"
      And the user clicks the continue
<<<<<<< HEAD
      And the user click the finish
      And the user click on backtohome
      And the user click on the kaiors page
      And the user click  on the automation Testing page
=======
      #And the user click the finish
      #And the user click on backtohome
      And user it will reamin in Continue page
      
>>>>>>> b5057ea1bedb34952250240c36a102db51d6adf0
      Examples:
      |username||password||firstname||secondname||postalcode|
      |standard_user||secret_sauce||abc||xyz||abcdee|