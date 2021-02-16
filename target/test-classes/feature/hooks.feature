Feature: To validate the login functionality
Background: 
 Given user has to launch chrome and hit the FB url
  
  Scenario: To verify login funtionality with valid username and invalid password in FB
   
    When user has to enter the username and password
      | Ajay | aravind | 962514 | 8596385 |
      | sdfg | lkjhg   | 852545 |  456852 |
    And click the login button
    Then user unable to enter the home page

   
  Scenario: To verify login funtionality with valid username and invalid password in FB
   
    When user has to click the forget password link
    And user has to enter the mobile number
     And click the search button
    Then user unable to navigate the OTP page
    